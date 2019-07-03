import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
    int j = 0;
    squareDrawing(graphics,(int)(Math.random()*320), (int)(Math.random()*320), (int)(Math.random()*256), (int)(Math.random()*256),
            (int)(Math.random()*256));
    for(int i = 0; i < 7; i++){
      rainbow(graphics,i,j,j,320-j,320-j);
      j+=40;
    }
  }
  public static void squareDrawing (Graphics graphics, int height, int width, int r, int g, int b){
    graphics.setColor(new Color(r,g,b));
    graphics.fillRect(160-width/2, 160-height/2, width, height);
  }
  public static void rainbow (Graphics graphics, int i, int a, int b, int c, int d){
    Color[] rainbow = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(75,0,130),
    new Color(238,130,238)};
    graphics.setColor(rainbow[i]);
    graphics.fillRect(a-a/2, b-b/2, c, d);
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