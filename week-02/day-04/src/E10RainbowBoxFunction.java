import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E10RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.

    for (int i = 0; i < 50; i++) {

      int r = (int) (Math.random( )*256);
      int g = (int)(Math.random( )*256);
      int b= (int)(Math.random( )*256);
      Color randomColor = new Color(r, g, b);
      graphics.setColor(randomColor);

      int randomSize = (int)(Math.random() * WIDTH);

      rainbowRectangleDrawer(randomSize,randomColor, graphics);
      
    }
  }

  public static void rainbowRectangleDrawer(int size, Color color,  Graphics graphics) {

    graphics.setColor(color);
    graphics.drawRect((WIDTH/2)-(size/2), (HEIGHT/2)-(size/2), size, size);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}