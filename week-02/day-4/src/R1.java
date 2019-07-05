import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class R1 {
  public static void mainDraw(Graphics graphics) {
    int x1 = 40;
    int y1 = 3;
    int x2 = 317;
    int y2 = 15;

      for (int i = 0; i < 14; i++) {
        lines(graphics, x1, y1, x2, y2,0);
        lines(graphics,y1,x1,y2,x2,1);
        x1 += 20;
        y2 += 20;
      }
  }

  public static void lines(Graphics graphics, int x1, int y1, int x2, int y2, int color){
    Color [] colors = {Color.MAGENTA,Color.green};
    graphics.setColor(colors[color]);
    graphics.drawLine(x1,y1,x2,y2);
  }
  
  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}