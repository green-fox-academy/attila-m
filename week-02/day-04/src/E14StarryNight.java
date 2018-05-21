import javafx.scene.layout.Background;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E14StarryNight {


  public static void mainDraw(Graphics graphics) {

    drawBackground(graphics);
    starColor(starNumber, graphics);

  }

  private static void drawBackground(Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0,WIDTH,HEIGHT);
  }

  public static void starColor (int starNum, Graphics graphics) {

    for (int i = 0; i < starNum ; i++) {

      int gray = (int) Math.floor(Math.random() * ( 256 - 100)) + 100;
      Color randomColorGrey = new Color(gray, gray, gray);
      graphics.setColor(randomColorGrey);
      starDraw(starNum, graphics);
    }
  }

  private static void starDraw(int starNum, Graphics graphics) {

    for (int i = 0; i < starNum ; i++) {
      int randomX = (int) Math.floor(Math.random() * (maximumX) - (minimumX)) + minimumX;
      int randomY = (int) Math.floor(Math.random() * (maximumY) - (minimumY)) + minimumY;
      graphics.fillRect(randomX,randomY,5,5);
    }
  }

  static int WIDTH = 600;
  static int HEIGHT = 623;
  static int starNumber = 51;
  static int starSize = 5;
  static int maximumX = WIDTH-starSize;
  static int maximumY = HEIGHT-starSize;
  static int minimumX = WIDTH+starSize;
  static int minimumY = HEIGHT+starSize;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.setBackground(Color.BLACK);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}