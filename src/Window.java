import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

public class Window extends JPanel {
    private JFrame window;
    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    private final String title = "MinMax - TicTacToe";
    private final boolean resizable = false;
    private final Color backgroundColor = Color.BLACK;

    public Window() {
        createWindow();
    }

    private void createWindow(){
        this.window = new JFrame();
        this.window.setTitle(this.title);
        this.window.setSize(this.WIDTH, this.HEIGHT);
        this.window.setResizable(this.resizable);
        this.window.setLocationRelativeTo(null);
        this.window.setVisible(true);
        this.window.setContentPane(this);
        this.window.getContentPane().setBackground(this.backgroundColor);

        // close on application close
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // optimization: drawing grid here saves a call to paintComponent()
        drawGrid(this.window.getGraphics());
    }

    // this should only be called when AI/User input for optimization purposes
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    // draws tic-tac-toe 3x3 grid
    private void drawGrid(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        System.out.println("grid");
        for (int i = 0; i < 10; i++){
            Line2D line = new Line2D.Float(i * 100, i * 100, i * 200, i * 200);
            graphics2D.draw(line);
        }
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

    public JFrame getWindow() {
        return window;
    }
}
