import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class E12RectangleRecurse {

  public static Graphics canvas;

  public static void mainDraw() {

    drawRectangleFractal(0,0,4,WIDTH);
  }

  private static void drawRectangleFractal(int x, int y, int size,int n) {
    if (n > 0) {
      n--;
      canvas.drawRect(x+WIDTH/3,y,size/3,size/3);
      drawRectangleFractal(WIDTH/3,y,size/3,n);
      canvas.drawRect(x+WIDTH/3*2,y+WIDTH/3,size/3,size/3 );
      drawRectangleFractal(WIDTH/3,x,y+WIDTH/3,n);
      canvas.drawRect(x,y+WIDTH/3, WIDTH/3,size/3 );
      drawRectangleFractal( WIDTH/3, x + 2 * WIDTH / 3, y+WIDTH/3,n);
      canvas.drawRect(x + WIDTH / 3, y + 2 * WIDTH / 3, size / 3,size/3);
      drawRectangleFractal( WIDTH/3, x +WIDTH/3,y+2*WIDTH/3,n);
    } else {
      System.out.println("Your RectangleFractal is ready.");
    }
  }

  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT+23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      canvas = graphics;
      mainDraw();
    }
  }
}