

public class TicTacToe {
    private boolean XTurn = true;
    private int[][] gameState = new int[3][3]; // -1 for O & 1 for X

    public TicTacToe(){

    }

    private void resetGameState(){
        this.gameState = new int[3][3];
    }

    public int[][] getGameState() {
        return gameState;
    }

    public boolean isXTurn() {
        return XTurn;
    }
}
