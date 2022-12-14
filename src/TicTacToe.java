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

    // inputs action into board and returns its board value
    public void sendAction(int x, int y){
        setBoardValue(x, y);
    }

    // returns -1, 0 or 1 for a given board value
    public int getBoardValue(int x, int y){
        return this.gameState[x][y];
    }

    private void setBoardValue(int x, int y){
        int bv = getBoardValue(x, y);

        // if empty
        if (bv == 0){
            this.gameState[x][y] = (this.XTurn)? 1 : -1;
            this.XTurn = !this.XTurn;
        }
    }

    public int[][] getGameState() {
        return gameState;
    }

    public boolean isXTurn() {
        return XTurn;
    }
}
