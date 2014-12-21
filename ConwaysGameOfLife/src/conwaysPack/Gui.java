/*package conwaysPack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Gui extends JPanel {

    private Board board;

    public Gui() {
	initialize();
    }

    private void initialize() {
	this.addMouseListener(new SquareActivator());
	board = new Board(50, 50);

    }

    private void painterMethod(Graphics g) {
	Graphics2D g2D = (Graphics2D) g;
	g2D.setColor(Color.BLACK);
	g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);

	for (int i = 0; i < 50; ++i) {
	    for (int j = 0; j < 50; ++j) {
		if (board.board[i][j] == 1) {
		    g2D.fillRect((i * 10), (j * 10), 10, 10);
		}
	    }

	}

    }

    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	painterMethod(g);
    }

    class SquareActivator extends MouseAdapter implements Runnable {

	private Thread activeThread;

	public SquareActivator() {
	    startThread();
	}

	private void startThread() {
	    activeThread = new Thread(this);
	    activeThread.start();
	}

	public void mousePresseEvent(MouseEvent e) {
	    int x = e.getX();
	    int y = e.getY();

	    if (x / 10 < 50 && y / 10 < 50) {
		board.set((x / 10), (y / 10));
	    }
	}

	@Override
	public void run() {
	    // TODO Auto-generated method stub
	    repaint();
	    board.next();
	    try {
		Thread.sleep(100);
	    } catch (Exception e) {
		System.out.println("Something went wrong");
	    }

	}
    }
}

public class Main extends JFrame {

    public Main() {
	add(new Gui());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500, 500);

    }

    public static void main(String[] args) {

	SwingUtilities.invokeLater(new Runnable() {
	    @Override
	    public void run() {
		Main m = new Main();
		m.setVisible(true);
	    }
	});
    }

}
*/