import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsTest extends JPanel {

  public void paintComponent (Graphics a) {
    super.paintComponent(a);
    this.setBackground(Color.WHITE);

    a.setColor(Color.BLUE);
    a.fillRect(25, 25, 100, 30);

    a.setColor(new Color(190, 81, 215));
    a.fillRect(25, 65, 100, 30);
    a.setColor(Color.RED);
  }
}
