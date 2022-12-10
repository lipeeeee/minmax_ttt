import java.awt.*;
import javax.swing.*;

public class Window {
    final int WIDTH = 500;
    final int HEIGHT = 500;
    final String title = "MinMax - TicTacToe";
    final boolean resizable = false;
    final Color backgroundColor = Color.BLACK;

    public Window() {
        createWindow();
    }

    private void createWindow(){
        JFrame window = new JFrame();
        window.setSize(this.WIDTH, this.HEIGHT);
        window.setTitle(this.title);
        window.getContentPane().setBackground(this.backgroundColor);
        window.setResizable(this.resizable);
        window.setLocationRelativeTo((Component)null);
        window.setVisible(true);

        // close on application close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // draws tic-tac-toe 3x3 grid
    private void drawGrid(){
        // TODO
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public boolean isResizable() {
        return resizable;
    }

    public String getTitle() {
        return title;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }
}
