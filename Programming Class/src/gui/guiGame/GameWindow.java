package gui.guiGame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.*;

import gui.Enemy;
import gui.Player;
import gui.Vampire;

public class GameWindow extends JPanel {
	JPanel playerPanel;
	JPanel optionPanel;
	JPanel enemyPanel;
	
	JButton attack;
	JButton heal;
	JButton surrender;
	
	JLabel playerHealth;
	JLabel enemyHealth;
	
	Player p;
	Enemy e;
	GameApp app;
	
	public GameWindow(Player _p, Enemy _e, GameApp _app) {
		
		p=_p;
		e = _e;
		app = _app;
		
		setLayout(new GridLayout(0,3));
		playerPanel = new JPanel();
		playerPanel.setLayout(new GridLayout(3,0));
		
		playerPanel.add(new JLabel(p.getName(), SwingConstants.CENTER));
		playerPanel.add(new JLabel("Image Goes Here", SwingConstants.CENTER));
		
		playerHealth = new JLabel("Health: " + p.getCurrentHealth() + " / " + p.getMaxHealth());
		playerHealth.setHorizontalAlignment(SwingConstants.CENTER);
		playerPanel.add(playerHealth);
		
		optionPanel = new JPanel();
		optionPanel.setLayout(new GridLayout(3,0));
		
		attack = new JButton("Attack");
		attack.setSize(100, 100);
		
		heal = new JButton("Heal");
		heal.setSize(100, 100);
		
		surrender = new JButton("Surrender");
		surrender.setSize(100, 100);
		
		attack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attack();
			}
		});
		heal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heal();
			}
		});
		surrender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				surrender();
			}
		});
		
		optionPanel.add(attack);
		optionPanel.add(heal);
		optionPanel.add(surrender);
		
		enemyPanel = new JPanel();
		enemyPanel.setLayout(new GridLayout(3,0));
		
		enemyPanel.add(new JLabel(e.getName(), SwingConstants.CENTER));
		enemyPanel.add(new JLabel("Image Goes Here"));
		
		enemyHealth = new JLabel("Health: " + e.getCurrentHealth() + " / " + e.getMaxHealth());
		enemyHealth.setHorizontalAlignment(SwingConstants.CENTER);
		enemyPanel.add(enemyHealth);
		
		
		
		//Add everything to the GUI
		add(playerPanel);
		add(optionPanel);
		add(enemyPanel);
	}
	
	public void attack() {
		p.attack(e);
		//enemyHealth.setText("Health: " + e.getCurrentHealth() + " / " + e.getMaxHealth());
		if(e.getCurrentHealth() <= 0) {
			e = makeEnemy();
			
		}
		updateEnemy();
		enemyTurn();
	}
	
	public void heal() {
		p.heal();
		
		if(p.getCurrentHealth() >= p.getMaxHealth()) {
			p.setCurrentHealth(p.getMaxHealth());
		}
		updatePlayer();
		enemyTurn();
	}
	
	public void surrender() {
		displayGameOver();
	}
	
	public void displayGameOver() {
		app.dispatchEvent(new WindowEvent(app, WindowEvent.WINDOW_CLOSING));
		System.out.println("GameOver");
	}
	
	public void updatePlayer() {
		playerHealth.setText("Health: " + p.getCurrentHealth() + " / " + p.getMaxHealth());
	}
	
	public void updateEnemy() {
		enemyHealth.setText("Health: " + e.getCurrentHealth() + " / " + e.getMaxHealth());
	}
	
	
	public void enemyTurn() {
		if(e.getHealValue() == 0 || e.getCurrentHealth() > 10) {
			
			e.attack(p);
		}
		else {
			
			e.heal();
		}
		
		if(!p.isAlive) { // did enemy kill you?
			displayGameOver();
		}
		updatePlayer();
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
