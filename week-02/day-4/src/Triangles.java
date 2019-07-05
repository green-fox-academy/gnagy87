import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int rows = 15;

    for(int i = 1; i <= rows; i++){
      for(int n = 0; n<(rows-i)*10 ;n++){
        x++;
      }
      for (int j = i; j > 0; j--){
        triangle(graphics,x,y,x,y);
        x+=20;
      }
      y+=20;
      x=0;
    }
  }
  public static void triangle(Graphics graphics, int x1, int y1, int x2, int y2){
    graphics.setColor(Color.black);
    graphics.drawLine(x1+0,y1+20,x2+10,y2+0);
    graphics.drawLine(x1+10,y1+0,x2+20,y2+20);
    graphics.drawLine(x1+0,y1+20,x2+20,y2+20);
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