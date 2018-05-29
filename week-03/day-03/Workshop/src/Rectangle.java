import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Rectangle {

  public static void mainDraw(Graphics graphics){
    int n = 5;
    int startpointX = 0;
    int startpointY = 0;
    drawSquare(n, WIDTH, startpointX, startpointY, graphics);
  }

  private static void drawSquare(int n, int width, int startpointX, int startpointY, Graphics graphics) {
    if (n == 0) {

    } else {
      graphics.drawRect(startpointX + width/3, startpointY, width / 3, width / 3);
      drawSquare(n-1, width/3, startpointX + width / 3, startpointY, graphics);

      graphics.drawRect(startpointX + 2 * width / 3,  startpointY + width / 3, width / 3, width / 3 );
      drawSquare(n-1, width/3, startpointX, startpointY + width / 3, graphics);

      graphics.drawRect(startpointX, startpointY + width / 3, width / 3, width / 3 );
      drawSquare(n-1, width/3, startpointX + 2 * width / 3, startpointY + width / 3, graphics);

      graphics.drawRect(startpointX + width / 3, startpointY + 2 * width / 3, width / 3, width / 3 );
      drawSquare(n-1, width/3, startpointX + width / 3, startpointY + 2 * width / 3, graphics);
    }
  }

  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}