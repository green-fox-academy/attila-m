import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E02ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.

    graphics.setColor(new Color(100,100,100,100));
    graphics.fillRect(2,2,(WIDTH-2),(HEIGHT-2));

    graphics.setColor(Color.GREEN);
    graphics.drawLine(1,1,(WIDTH-1),1);
    graphics.setColor(Color.RED);
    graphics.drawLine((WIDTH-1),1,(WIDTH-1),(HEIGHT-1));
    graphics.setColor(Color.BLUE);
    graphics.drawLine((WIDTH-1),(HEIGHT-1),1,(HEIGHT-1));
    graphics.setColor(Color.BLACK);
    graphics.drawLine(1,(HEIGHT-1),1,1);

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