import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E12FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    int startX = 0;
    int startY = 0;

    drawLines(startX,startY, graphics);

  }

  private static void drawLines(int startX, int startY, Graphics graphics) {

    int x = startX;
    int y = startY;
    int midX = WIDTH / 2;
    int midY = HEIGHT / 2;

    for (int i = 0; i < 21; i++) {
      graphics.drawLine((20 * i), y, midX, midY);
      graphics.drawLine(WIDTH, 20 * i, midX, midY);
      graphics.drawLine(20 * i, HEIGHT, midX, midY);
      graphics.drawLine(x, 20 * i, midX, midY);
    }
  }

  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 423;
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex12FunctionToCenter");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
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