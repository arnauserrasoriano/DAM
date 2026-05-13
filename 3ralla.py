import os

# ─── COLORES ────────────────────────────────────────────────
RESET  = "\033[0m"
BOLD   = "\033[1m"
RED    = "\033[91m"
BLUE   = "\033[94m"
CYAN   = "\033[96m"
YELLOW = "\033[93m"
GRAY   = "\033[90m"
WHITE  = "\033[97m"


# ─── UTILIDADES ─────────────────────────────────────────────
def clear():
    os.system('cls' if os.name == 'nt' else 'clear')

def init_board():
    return [' '] * 9


# ─── TABLERO (SIN FUNCIONES INTERNAS) ───────────────────────
def print_board(board):
    symbols = {
        'X': f"{RED}{BOLD} X {RESET}",
        'O': f"{BLUE}{BOLD} O {RESET}",
    }

    separator = f"{GRAY}───┼───┼───{RESET}"

    # Construimos cada celda directamente
    cells = []

    for i in range(9):
        if board[i] == ' ':
            cells.append(f"{GRAY} {i+1} {RESET}")
        else:
            cells.append(symbols[board[i]])

    print(f"\n  {cells[0]}│{cells[1]}│{cells[2]}")
    print(f"  {separator}")
    print(f"  {cells[3]}│{cells[4]}│{cells[5]}")
    print(f"  {separator}")
    print(f"  {cells[6]}│{cells[7]}│{cells[8]}\n")


# ─── LÓGICA ────────────────────────────────────────────────
def check_winner(board, player):
    wins = [
        [0,1,2],[3,4,5],[6,7,8],
        [0,3,6],[1,4,7],[2,5,8],
        [0,4,8],[2,4,6]
    ]

    for combo in wins:
        if board[combo[0]] == player and \
           board[combo[1]] == player and \
           board[combo[2]] == player:
            return True

    return False


def is_draw(board):
    return ' ' not in board


# ─── INPUT ─────────────────────────────────────────────────
def get_move(board, player):
    color = RED if player == 'X' else BLUE

    while True:
        raw = input(f"  {color}{BOLD}Jugador {player}{RESET} → casilla (1-9): ").strip()

        if not raw.isdigit():
            print(f"  {YELLOW}⚠ Número inválido{RESET}")
            continue

        idx = int(raw) - 1

        if idx < 0 or idx > 8:
            print(f"  {YELLOW}⚠ Debe ser 1-9{RESET}")
        elif board[idx] != ' ':
            print(f"  {YELLOW}⚠ Ocupado{RESET}")
        else:
            return idx


def play_again():
    ans = input(f"  {WHITE}¿Otra partida? (s/n): {RESET}").lower()
    return ans in ('s','si','sí','y','yes')


# ─── UI ────────────────────────────────────────────────────
def print_header():
    print(f"\n  {CYAN}{BOLD}╔══════════════════╗{RESET}")
    print(f"  {CYAN}{BOLD}║   TRES EN RAYA   ║{RESET}")
    print(f"  {CYAN}{BOLD}╚══════════════════╝{RESET}")

def print_result(winner=None):
    if winner:
        color = RED if winner == 'X' else BLUE
        print(f"\n  {color}{BOLD}🎉 Gana {winner}{RESET}\n")
    else:
        print(f"\n  {YELLOW}{BOLD}Empate{RESET}\n")


# ─── MAIN ──────────────────────────────────────────────────
def main():
    while True:
        clear()
        print_header()

        board = init_board()
        current = 'X'

        while True:
            print_board(board)

            idx = get_move(board, current)
            board[idx] = current

            if check_winner(board, current):
                clear()
                print_header()
                print_board(board)
                print_result(current)
                break

            if is_draw(board):
                clear()
                print_header()
                print_board(board)
                print_result()
                break

            current = 'O' if current == 'X' else 'X'
            clear()
            print_header()

        if not play_again():
            break


if __name__ == "__main__":
    main()