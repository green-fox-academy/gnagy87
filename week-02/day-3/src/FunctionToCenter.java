import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    int a = 0;
    int b = 0;
    for (int i = 0; i < 64; i++){
      if(a<320 && b!=320 && b==0){
        lineToCenter(graphics,a,b);
        a+=20;
      }
      if(a==320 && b!=320){
        lineToCenter(graphics,a,b);
        b+=20;
      }
      if(b==320){
        lineToCenter(graphics,a,b);
        a-=20;
      }
      if(a==0 && b>0){
        lineToCenter(graphics,a,b);
        b-=20;
      }
    }
  }
  public static void lineToCenter(Graphics graphics, int a, int b){
    graphics.setColor(Color.black);
    graphics.drawLine(a,b,160,160);
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