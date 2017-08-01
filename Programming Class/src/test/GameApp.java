package test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameApp {
	static JFrame mainWindow;
	static JButton attac;
	static JButton heal;
	static JButton surrender;
	static BufferedImage image1;
	
	public static void main(String args[]) {
		mainWindow = new JFrame();
		JPanel holder = new JPanel();
		attac = new JButton("Attack");
		heal = new JButton("Heal");
		surrender = new JButton("Surrender");
		
		ImageIcon image = new ImageIcon("images/Player.jpg");
		Image old = image.getImage(); // transform it 
		Image newimg = old.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		image = new ImageIcon(newimg); 
		
		JLabel label = new JLabel("", image, JLabel.CENTER);
		JPanel panel = new JPanel(new BorderLayout());
		
		panel.add( label, BorderLayout.CENTER );
		
		ImageIcon image1 = new ImageIcon("images/Enemy.jpg");
		Image old1 = image1.getImage(); // transform it 
		Image newimg1 = old1.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		image1 = new ImageIcon(newimg1); 
		
		JLabel label1 = new JLabel("", image1, JLabel.CENTER);
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.add( label1, BorderLayout.CENTER );
		
		
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setLayout(new BorderLayout());
		holder.setLayout(new GridLayout(3,0));
		holder.add(attac);
		holder.add(heal);
		holder.add(surrender);
		mainWindow.getContentPane().add(holder, BorderLayout.CENTER);
		mainWindow.getContentPane().add(panel, BorderLayout.WEST);
		mainWindow.getContentPane().add(panel1, BorderLayout.EAST);
		
		mainWindow.pack();
		mainWindow.setSize(1000, 1000);
		mainWindow.setLocationRelativeTo(null);
		mainWindow.setVisible(true);
		
	}
}
