package TicTacToe;

public class Game {
    Board board;
    Player player1;
    Player player2;

    Game(){
        this.board = new Board();
        this.player1=new Player('x');
        this.player2=new Player('o');
    }
}
