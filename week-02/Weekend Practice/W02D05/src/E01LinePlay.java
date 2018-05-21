import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E01LinePlay {
  public static void mainDraw(Graphics graphics) {
    int size = 20;
    patternDrawer(size, graphics);
  }

  private static void patternDrawer(int step, Graphics graphics) {
    for (int i = 0; i < WIDTH / step ; i++) {
      lineDrawer(i, step, graphics);
    }
  }

  private static void lineDrawer(int i, int stepSize, Graphics graphics) {
    graphics.drawLine(i * stepSize, 0, HEIGHT, i * stepSize);
    graphics.drawLine(0,i * stepSize, i * stepSize, WIDTH);
  }

  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex01LinePlay");
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