package game;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		final int WIDTH = 900, HEIGHT = 900; 
		
		Ball ball = new Ball();

		JFrame f = new JFrame();
		f.add(ball);
		
		f.setVisible(true);
		f.setSize(WIDTH, HEIGHT);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("CAP HUNTER");
	}

}
