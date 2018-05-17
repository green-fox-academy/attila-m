import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E07FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.

    for (int i = 0; i < 4; i++) {

      int r = (int) (Math.random( )*256);
      int g = (int)(Math.random( )*256);
      int b= (int)(Math.random( )*256);
      Color randomColor = new Color(r, g, b);
      graphics.setColor(randomColor);

      int randomX = (int)(Math.random() * 100);
      int randomY = (int)(Math.random() * 100);
      int randomSize = (int)(Math.random() * 100);
      int randomHeight = (int)(Math.random() * 100);
      graphics.fillRect(randomX,randomY,randomSize,randomHeight);

    }
  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}