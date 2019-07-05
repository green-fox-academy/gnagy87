import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class R2 {
  public static void mainDraw(Graphics graphics) {
   /* int x1 = WIDTH/2;
    int y1 = 0;
    int x2 = WIDTH/2;
    int y2 = HEIGHT/2;*/

    lines(graphics,160,0,160,160,0,10,10,0);
    lines(graphics,160,320,160,160,0,-10,10,0);
    lines(graphics,160,0,160,160,0,10,-10,0);
    lines(graphics,160,320,160,160,0,-10,-10,0);
  }

  public static void lines(Graphics graphics, int x1, int y1, int x2, int y2, int a, int b, int c, int d){
    graphics.setColor(Color.green);
    for (int i = 0; i < 16; i++){
      graphics.drawLine(x1,y1,x2,y2);
      x1+=a;
      y1+=b;
      x2+=c;
      y2+=d;
    }
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