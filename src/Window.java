import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

public class Window extends JPanel {
    private JFrame window;
    private final int WIDTH = 700;
    private final int HEIGHT = 600;
    private final int CELL_SIZE = this.HEIGHT / 3;
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

        // putting this here saves an extra call from paintComponent
        addButtons(this.window.getGraphics());
    }

    // in an ideal world this should only be called
    // when AI/User input for optimization purposes
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
    }

    // draws tic-tac-toe 3x3 grid
    private void drawGrid(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        for (int i = 0; i < 3; i++){
            // vertical
            g2d.draw(new Line2D.Float(i * this.CELL_SIZE, 0, i * this.CELL_SIZE, 3 * this.CELL_SIZE));

            // horizontal
            g2d.draw(new Line2D.Float(0, i * this.CELL_SIZE, 3 * this.CELL_SIZE, i * this.CELL_SIZE));
        }
        // draw another vertical line to allow WIDTH resizing and maintain a clean UI
        g2d.draw(new Line2D.Float(3 * this.CELL_SIZE, 0, 3 * this.CELL_SIZE, 3 * this.CELL_SIZE));
    }

    private void addButtons(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        JButton btn;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                btn = new JButton("");
                btn.setBounds(j * this.CELL_SIZE, i * this.CELL_SIZE, this.CELL_SIZE, this.CELL_SIZE);
                this.window.add(btn);
            }
        }
    }

    public int getCELL_SIZE() {
        return CELL_SIZE;
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
