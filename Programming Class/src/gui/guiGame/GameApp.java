package gui.guiGame;

import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.*;

import gui.Enemy;
import gui.Player;
import gui.Vampire;

public class GameApp extends JFrame {
	
	private static int WIDTH = 1000;
	private static int HEIGHT = 1000;
	
	Player p = new Player();
	Enemy e;
	
	GameWindow game;

	
	public GameApp() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		newGame();
		this.setVisible(true);
	}
	
	public void newGame() {
		getContentPane().removeAll();
		p = new Player();
		e = makeEnemy();
		game = new GameWindow(p, e, this);
		
		add(game);
		setVisible(true);
		revalidate();
		repaint();
	}
	
	public static Enemy makeEnemy() {
		Random rng = new Random();
		
		int rand = rng.nextInt(1);
		
		if(rand == 0) {
			return new Vampire();
		}
		else if (rand == 1) {
			return null;
		}
		else if (rand == 2) {
			return null;
		}
		else if (rand == 3) {
			return null;
		}
		else {
			return null;
		}
	}
	
	
}
