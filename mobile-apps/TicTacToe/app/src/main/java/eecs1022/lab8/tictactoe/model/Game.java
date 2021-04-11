package eecs1022.lab8.tictactoe.model;
public class Game {
    private String playerOne;
    private String playerTwo;
    private String currentPlayer;
    private char[][] board;
    private String status;

    public Game(){

    }

    public Game(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.currentPlayer = playerOne;
        this.status = getCurrentPlayer() + "'s turn to play...";
        this.board = new char[3][3];
        char result = '_';
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = result;
            }
        }
    }

    public String getPlayerOne() {
        return this.playerOne;
    }

    public String getPlayerTwo() {
        return this.playerTwo;
    }

    public String getCurrentPlayer() {
        return this.currentPlayer;
    }

    public String getStatus() {
        return status;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setWhoPlaysFirst(char c) {
        if (c == 'x') {
            this.playerTwo = getPlayerOne();
        } else {
            this.playerTwo = getPlayerTwo();
        }
        this.currentPlayer = this.playerTwo;
        this.status = currentPlayer + "'s turn to play...";
    }

    public void move(int move1, int move2) {
        if (0 > move1) {
            this.status = "Error: row " + move1 + " is invalid.";
        } else if (move2 < 0) {
            this.status = "Error: row " + move2 + " is invalid.";
        } else if (move1 < 0 && move2 > 3) {
            this.status = "Error: row " + move1 + " is invalid.";
        } else if (move1 > 3 && move2 < 0) {
            this.status = "Error: row " + move2 + " is invalid.";
        } else if (move2 > 3) {
            this.status = "Error: col " + move2 + " is invalid.";
        } else if (move1 > 3) {
            this.status = "Error: col " + move1 + " is invalid.";
        } else {
            int r = 0;
            int c = 0;
            int count = 0;
            for (; r < move1; r++) {
                for (; c < move2; c++) {
                    count++;
                }
            }

            if (board[r - 1][c - 1] == 'o') {
                if (this.currentPlayer == null) {
                } else {
                    this.currentPlayer = this.playerOne;
                    this.status = "Error: slot @ (" + move1 + ", " + move2 + ") is already occupied.";
                }
            } else if (board[r - 1][c - 1] == 'x') {
                if (this.currentPlayer == null) {
                } else {
                    this.currentPlayer = this.playerTwo;
                    this.status = "Error: slot @ (" + move1 + ", " + move2 + ") is already occupied.";
                }
            } else {
                if (getCurrentPlayer().equals(this.playerOne)) {
                    this.board[r - 1][c - 1] = 'x';
                } else if (getCurrentPlayer().equals(this.playerTwo)) {
                    this.board[r - 1][c - 1] = 'o';
                }
                if (this.currentPlayer.equals(this.playerOne)) {
                    this.currentPlayer = this.playerTwo;
                    this.status = this.currentPlayer + "'s turn to play...";
                } else if (this.currentPlayer.equals(this.playerTwo)) {
                    this.currentPlayer = this.playerOne;
                    this.status = this.currentPlayer + "'s turn to play...";
                }
            }
        }

        if (this.currentPlayer == null) {
            if(checkBoardIsFulled(board))
                this.status ="Error: game is already over with a tie.";
            else{
                this.status = "Error: game is already over with a winner.";
            }
        } else if (this.board[0][0] == 'x' && this.board[1][1] == 'x' && this.board[2][2] == 'x') {
            this.status = "Game is over with " + this.playerOne + " being the winner.";
            this.currentPlayer = null;
        } else if (this.board[0][0] == 'o' && this.board[1][1] == 'o' && this.board[2][2] == 'o') {
            this.status = "Game is over with " + this.playerTwo + " being the winner.";
            this.currentPlayer = null;
        } else if (this.board[0][0] == 'o' && this.board[0][1] == 'o' && this.board[0][2] == 'o') {
            this.status = "Game is over with " + this.playerTwo + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[0][0] == 'x' && this.board[0][1] == 'x' && this.board[0][2] == 'x') {
            this.status = "Game is over with " + this.playerOne + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[1][0] == 'x' && this.board[1][1] == 'x' && this.board[1][2] == 'x') {
            this.status = "Game is over with " + this.playerOne + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[1][0] == 'o' && this.board[1][1] == 'o' && this.board[1][2] == 'o') {
            this.status = "Game is over with " + this.playerTwo + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[2][0] == 'x' && this.board[2][1] == 'x' && this.board[2][2] == 'x') {
            this.status = "Game is over with " + this.playerOne + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[2][0] == 'o' && this.board[2][1] == 'o' && this.board[2][2] == 'o') {
            this.status = "Game is over with " + this.playerTwo + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[0][0] == 'x' && this.board[1][0] == 'x' && this.board[2][0] == 'x') {
            this.status = "Game is over with " + this.playerOne + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[0][0] == 'o' && this.board[1][0] == 'o' && this.board[2][0] == 'o') {
            this.status = "Game is over with " + this.playerTwo + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[0][1] == 'x' && this.board[1][1] == 'x' && this.board[2][1] == 'x') {
            this.status = "Game is over with " + this.playerOne + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[0][1] == 'o' && this.board[1][1] == 'o' && this.board[2][1] == 'o') {
            this.status = "Game is over with " + this.playerTwo + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[0][2] == 'x' && this.board[1][2] == 'x' && this.board[2][2] == 'x') {
            this.status = "Game is over with " + this.playerOne + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[0][2] == 'o' && this.board[1][2] == 'o' && this.board[2][2] == 'o') {
            this.status = "Game is over with " + this.playerTwo + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[0][2] == 'x' && this.board[1][1] == 'x' && this.board[2][0] == 'x') {
            this.status = "Game is over with " + this.playerOne + " being the winner.";
            this.currentPlayer = null;
        }else if (this.board[0][2] == 'o' && this.board[1][1] == 'o' && this.board[2][0] == 'o') {
            this.status = "Game is over with " + this.playerTwo + " being the winner.";
            this.currentPlayer = null;
        }
        else {
            if(checkBoardIsFulled(board)){
                this.status = "Game is over with a tie between "+this.playerOne +" and "+this.playerTwo +".";
                this.currentPlayer = null;
            }
        }
    }

    private boolean checkBoardIsFulled(char[][] game) {
        for (char[] chars : game) {
            for (char aChar : chars) {
                if(aChar == '_')
                    return false;
            }
        }
        return true;
    }
}