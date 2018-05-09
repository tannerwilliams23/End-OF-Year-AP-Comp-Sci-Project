package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

@SuppressWarnings("serial")
public class Bullet extends Ball implements KeyListener, ActionListener{
	

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.fill(new Ellipse2D.Double(getX(), getY(), 40, 40));
	}
	
	public void actionPerformed(ActionEvent e) {

		repaint();
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
