package TicTacToe;

public class Board {
    char[][] board;
    int[][] winBoard;
    Board(){
        board = new char[3][3];
        winBoard = new int[][]{
                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 6}
        };
    }
    void printBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    void printWinBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(winBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
    boolean setBoard(int x, int y,Player player){
        if ( board[x-1][y-1]==0) {
            board[x-1][y-1] = player.symbol;
            player.winCondition[x-1][y-1]=winBoard[x-1][y-1];
            return true;
        }
        return false;
    }
    boolean checkDraw(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j]==0) {
                    return false;
                }
            }
        }
        return true;
    }
}
