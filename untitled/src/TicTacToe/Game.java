package TicTacToe;
import java.util.Scanner;
import java.util.Random;
import java.util.random.*;

public class Game {
    boolean player1Starts;
    Board board;
    Player player1;
    Player player2;

    Game(){

        this.board = new Board();
        this.player1=new Player('X');
        this.player2=new Player('O');
    }
    void play(){Scanner scanner = new Scanner(System.in);
       board.printBoard();
        while(true) {
            System.out.println("Player 1's turn");
            boolean player1placed=false;
            do {
                int row1 = scanner.nextInt();
                int col1 = scanner.nextInt();
                if(row1>2||col1>2){
                    continue;
                }
                player1placed = board.setBoard(row1, col1, player1);
            } while (!player1placed);
            board.printBoard();
            if (player1.checkWin()){
                System.out.println("Player 1 won");
            break;
            }
            if (board.checkDraw()){
                System.out.println("Draw");
                break;
            }
            System.out.println("Player 2's turn");
            boolean player2placed=false;
            do{
                int row1 = scanner.nextInt();
                int col1 = scanner.nextInt();
                if(row1>2||col1>2){
                    continue;
                }
                player2placed=board.setBoard(row1,col1,player2);
            }while(!player2placed);
            board.printBoard();
            if (player2.checkWin()){
                System.out.println("Player 2 won");
                break;
            }

        }
    }
}
