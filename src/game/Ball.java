package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Ball extends JPanel implements ActionListener, KeyListener{
	Timer timer = new Timer(5, this);
	Timer shooterTimer = new Timer(1000, this);
	double x = 400, y = 600,xBullet = 0, velX = 0, velY = 0;
	int counter = 1;
	boolean spacePressed = false;
	public Ball() {
		timer.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.orange);
		g.fillRect(0, 0, 900, 900);
		g.setColor(Color.red);
		g.drawString("COMMUNISM SIMULATOR", 350, 450);
		g.setColor(Color.white);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(new Ellipse2D.Double(x, 600, 40, 40));
		
		if(spacePressed == true	) {
		
			if(counter == 1) {
				counter = 2;
				xBullet = x;
				
			}
			g2.fill(new Ellipse2D.Double(xBullet + 10, y,20,20));
			
		}
		
	}
	
	/*public void paintComponentBullet(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		if(spacePressed == true	) {
			
			if(counter == 1) {
				counter = 2;
				xBullet = x;
				
			}
			g2.fill(new Ellipse2D.Double(xBullet + 20, y,5,5));
			
		}
	}
	*/
	
	public void actionPerformed(ActionEvent e) {
		if(x < 0) {
			velX=0;
			x = .01;
		}
		if(x > 845) {
			velX = 0;
			x = 844.9;
		}
		if(y < -150) {
			spacePressed = false;
			y = 600;
			velY = 0;
			counter = 1;
		}
		
		x += velX;
		y += velY;
		
		repaint();
		
	}
	

	public void left() {
		velX = -1.5;
	}
	
	public void right() {
		velX = 1.5;
	}
	public void stopBall(){
		velX = 0;
	}
	
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if(keyCode == KeyEvent.VK_A) {
			left();
			
		
		}
		if(keyCode == KeyEvent.VK_D) {
			right();
			
		}
		if(keyCode == KeyEvent.VK_SPACE) {
			velY = 0;
			velY = - 5;
			spacePressed = true;
			
			
			
			
		}
			
	}
	public void keyTyped(KeyEvent e) {
	/*char keyCode = e.getKeyChar();
		//System.out.println(e.getKeyChar());
		if(keyCode == 'a') {
			left();
		}
		if(keyCode == 'd') {
			right();
		}
		*/
		
		
	}
	public void keyReleased(KeyEvent e) {
		//stopBall();
	}
	

}
