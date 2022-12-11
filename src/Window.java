import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
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
        this.window.getContentPane().setPreferredSize(new Dimension(this.WIDTH, this.HEIGHT));
        this.window.getContentPane().setBackground(this.backgroundColor);
        this.window.setResizable(this.resizable);
        this.window.setLocationRelativeTo((Component)null);
        this.window.setVisible(true);

        // close on application close
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
    }

    // draws tic-tac-toe 3x3 grid
    private void drawGrid(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;

        for (int i = 0; i < 3; i++){
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
