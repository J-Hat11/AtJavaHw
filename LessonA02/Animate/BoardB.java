package Animate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//used the internet to help with animation because my original program was not running correctly
public class BoardB extends JPanel implements ActionListener {
  
private final int B_WIDTH = 720;
private final int B_HEIGHT = 720;
private int imgWidth;
private int imgHeight;
private double x = 0;
private double y = 0;
private double angle = 0;
private Timer timer;
private Image myImage;

   /*
    * Constructor
    */
   public BoardB() {
    
       setBackground(Color.CYAN);
       setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
       ImageIcon icon = new ImageIcon("Andy.png");
       myImage = icon.getImage();
       imgWidth  = myImage.getWidth(null);
       imgHeight = myImage.getHeight(null);
       timer = new Timer(25, this);
       timer.start();

       

       
   }



   public void paintComponent(Graphics g) {

      
super.paintComponent(g);
Graphics2D g2d = (Graphics2D) g;
AffineTransform at = new AffineTransform();
at.translate(x - imgWidth / 2.0, y - imgHeight / 2.0);
at.rotate(Math.toRadians(angle), imgWidth / 2.0, imgHeight / 2.0);
g2d.drawImage(myImage, at, null);

   }

public void actionPerformed(ActionEvent e) {
    x += 1;
    y += 1;
    angle += 5;
    if (x > B_WIDTH)  x = 0;
    if (y > B_HEIGHT) y = 0;
    repaint(); //calls paint component again
}
}