package gui;
import java.awt.Graphics;

import javax.swing.*;
public class DrawingFrame extends JPanel {

	public DrawingFrame () {
		super();
		createAndShowGUI();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawRect(20, 20, 100, 100);
		
	}

	public void createAndShowGUI() {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(this);

		frame.pack();
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}




}

