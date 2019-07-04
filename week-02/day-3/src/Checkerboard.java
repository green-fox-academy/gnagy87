import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    int a = 0;
    int b = 0;
    int c = 0;

  for (int i = 0; i < 8; i++){
    if(i%2==0){
      c=0;
    }
    else {
      c=1;
    }
    for(int j = 0; j < 8; j++){
      checker(graphics,a,b,c);
      a+=40;
      if(c==0){
        c=1;
      }
      else {
        c=0;
      }
    }
    a=0;
    b+=40;
  }

  }
  public static void checker(Graphics graphics, int a, int b, int c){
    Color[] blackOrWhite = {Color.black,Color.white};
    graphics.setColor(blackOrWhite[c]);
    graphics.fillRect(a,b,40,40);
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