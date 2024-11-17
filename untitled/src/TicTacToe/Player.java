package TicTacToe;

public class Player {
    char symbol;
    int[][] winCondition;
    Player(char symbol_){
        symbol = symbol_;
        winCondition = new int[3][3];
    }
    boolean checkWin(){
        //checking horizontally
        for(int i=0;i<3;i++){
            int sumHor=0;
            for(int j=0;j<3;j++){
                sumHor += winCondition[i][j];
            }
            if(sumHor==15){
                return true;
            }
        }
        //checking vertically
        for(int i=0;i<3;i++){
            int sumVer=0;
            for(int j=0;j<3;j++){
                sumVer+=winCondition[j][i];
            }
            if(sumVer==15){
                return true;
            }
        }
        //checking diagonally
        int sumDiagRight=0;
        int sumDiagLeft=0;
        for (int i=0;i<3;i++){
            sumDiagRight+=winCondition[i][i];
            sumDiagLeft+=winCondition[i][2-i];
        }
        if(sumDiagRight==15||sumDiagLeft==15){
            return true;
        }
        return false;
    }
}
