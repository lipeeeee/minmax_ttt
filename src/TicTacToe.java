public class TicTacToe {
    private boolean XTurn = true;
    private int[][] gameState; // -1 for O & 1 for X

    public TicTacToe(){
        resetGameState();
    }

    // starts/resets game state as array of empty zero's
    private void resetGameState(){
        this.gameState = new int[3][3];
    }

    public void sendAction(int x, int y){
        System.out.println(x + ", " + y);
    }

    public int[][] getGameState() {
        return gameState;
    }

    public boolean isXTurn() {
        return XTurn;
    }
}
