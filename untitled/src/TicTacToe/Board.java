package TicTacToe;

public class Board {
    char[][] board;
    Board(){
        board = new char[3][3];
    }
    void printBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    void setBoard(int x, int y,char player){
        board[x][y] = player;
    }
}
