import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E04GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.

    for (int i = 0; i < 100; i++) { //should be 3 but 100 looks better
      int randomX = (int)(Math.random() * WIDTH);
      int randomY = (int)(Math.random() * HEIGHT);

      lineDrawer(randomX,randomY,graphics);
    }
  }

  public static void lineDrawer(int x1, int y1, Graphics graphics) {

    graphics.setColor(Color.BLACK);
    graphics.drawLine(x1, y1, (WIDTH/2), (HEIGHT/2));
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
