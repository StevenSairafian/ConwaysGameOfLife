/*package conwaysPack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

public class MainClass {

    public static void main(String[] args) {
	
	(new Thread(new Animate())).start();
   }

}

class MyPanel extends JPanel {

    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private Board board;

    public MyPanel() {
	setBackground(Color.BLACK);
	setPreferredSize(new Dimension(WIDTH, HEIGHT));
	setFocusable(true);
	board = new Board(50, 50);
	for (int i = 0; i < 50; i += 32) {
	    for (int j = 0; j < 50; ++j) {
		board.set(i, j);
	    }
	}

    }

    public void update() {
	board = board.next();
	repaint();

    }

    public void paintComponent(Graphics Page) {
	Graphics2D page2 = (Graphics2D) Page;
	page2.setColor(Color.BLACK);
	for (int i = 0; i < 50; ++i) {
	    for (int j = 0; j < 50; ++j) {
		if (board.board[i][j] == 1) {
		    page2.fillRect((i * 10), (j * 10), 10, 10);
		}
	    }
	}
	
	
    }

    public void paint(Graphics g) {
	g.setColor(Color.BLACK);
	Graphics2D g2 = (Graphics2D) g;
	g2.clearRect(0, 0, 550, 550);
	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
	super.paint(g2);
    }

    public void setSquare(Point p){
	try{
	    board.set(p.x/10, p.y/10);
	}catch(Exception e){System.out.println("No point");}
	   
	}
    
}

class Animate extends Thread {

    private MyPanel mp;

    public Animate() {

	JFrame frame = new JFrame("Direction Keys");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mp = new MyPanel();
	mp.setBackground(Color.BLACK);
	frame.getContentPane().add(mp);
	frame.pack();
	frame.setResizable(false);
	frame.setVisible(true);

	
    }

    public void run() {
	for (int i = 0; i < 300; ++i) {
	    mp.update();
	   
	    System.out.println("Updated (" + i + ") times");
	    try {
		Thread.sleep(950);
	    } catch (Exception e) {
		System.out.println("ERROR");
	    }

	}
    }
}
*/