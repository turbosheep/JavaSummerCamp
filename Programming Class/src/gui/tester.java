package gui;

import javax.swing.SwingUtilities;

public class tester {
	public static void main(String[] args) {
		
		DrawingFrame d = new DrawingFrame();
		
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				d.createAndShowGUI();
			}
		});


	}
}
