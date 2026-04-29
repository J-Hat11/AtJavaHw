
// I was having trouble with getting the audio to play so I searched up how to impliment it on the web 
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel implements KeyListener, MouseListener {

    private static final int B_WIDTH = 600;
    private static final int B_HEIGHT = 400;
    private static final int DIAMETER = 20;

    private int circleX;
    private int circleY;

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
        circleX = B_WIDTH / 2 - DIAMETER / 2;
        circleY = B_HEIGHT / 2 - DIAMETER / 2;
        this.addMouseListener(this);
    }
    //looked up this part: 
   public void playSound(String soundFile) {
    try {
        File file = new File(soundFile);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.MAGENTA);
    g.fillOval(circleX, circleY, DIAMETER, DIAMETER);
}
public void keyPressed(KeyEvent e){
    //same with the following line
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        circleX = B_WIDTH / 2 - DIAMETER / 2;
        circleY = B_HEIGHT / 2 - DIAMETER / 2;
        repaint();
        playSound("blop.wav");
    }
}
public void mousePressed(MouseEvent e) {
    circleX = e.getX() - DIAMETER / 2;
    circleY = e.getY() - DIAMETER / 2;
    repaint();
    playSound("blip.wav");  
}
public void mouseClicked(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}

   public void keyTyped(KeyEvent e){}



   public void keyReleased(KeyEvent e){}
}



