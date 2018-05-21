import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E11Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    int squareSize = WIDTH / 8;
    checkerBoard(squareSize, graphics);
  }

  private static void checkerBoard(int squareSize, Graphics graphics) {
    for (int rowIndex = 0; rowIndex <8 ; rowIndex++) {
      for (int columnIndex = 0; columnIndex <8 ; columnIndex++) {
        if (rowIndex % 2 == 0) {
          if (columnIndex % 2 == 0) {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(rowIndex * squareSize, columnIndex * squareSize, squareSize, squareSize);
          } else {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(rowIndex * squareSize, columnIndex * squareSize, squareSize, squareSize);
          }
        } else {
          if (columnIndex % 2 == 0) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(rowIndex * squareSize, columnIndex * squareSize, squareSize, squareSize);
          } else {
            graphics.setColor(Color.WHITE);
            graphics.fillRect(rowIndex * squareSize, columnIndex * squareSize, squareSize, squareSize);
          }
        }
      }
    }
  }

  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex11Checkerboard");
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