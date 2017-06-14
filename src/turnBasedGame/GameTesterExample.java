package turnBasedGame;

import java.util.Random;
import java.util.Scanner;

public class GameTesterExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input;
		Player player;
		Enemy enemy;

		boolean playAgain = true;
		while(playAgain) {
			player = new Player();
			enemy = makeEnemy();
			System.out.println(player.name + " encounters " + enemy.name + "!");
			while(player.isAlive) {
				boolean understood = false;
				
				//******************PLAYER TURN********************//
				System.out.println("Will " + player.name + " attack, heal, or surrender?");
				
				do {
					input = s.nextLine();
					if(input.equalsIgnoreCase("attack")) {
						understood = true;
						System.out.println(player.name + " attacks! " + enemy.name + " health -" + player.attackValue);
						player.attack(enemy);
					}
					else if(input.equalsIgnoreCase("heal")) {
						understood = true;
						System.out.println(player.name + " heals! " + player.name + " health +" + player.healValue);
						player.heal();
					}
					else if(input.equalsIgnoreCase("surrender")) {
						understood = true;
						player.isAlive = false;
						System.out.println(player.surrenderQuote);
					}
					else {
						understood = false;
						System.out.println("Please try again.");
						System.out.println("Will " + player.name + " attack, heal, or surrender?");
					}
				} while (!understood); //if command not understood, try again
				
				if(!enemy.isAlive) { // did you kill the enemy?
					System.out.println(enemy.name + ": " + enemy.deathQuote);
					System.out.println(player.name + ": " + player.victoryQuote);
					System.out.println();
					enemy = makeEnemy();
					System.out.println(player.name + " encounters " + enemy.name + "!");
					continue;
				}
				
				//********************ENEMY TURN*********************//
				if(enemy.healValue == 0 || enemy.currentHealth > 10) {
					System.out.println(enemy.name + " attacks! " + player.name + " health -" + enemy.attackValue);
					enemy.attack(player);
				}
				else {
					System.out.println(enemy.name + " heals! " + enemy.name + " health +" + enemy.healValue);
					enemy.heal();
				}
				
				if(!player.isAlive) { // did enemy kill you?
					System.out.println(player.name + ": " + player.deathQuote);
					System.out.println(enemy.name + ": " + enemy.victoryQuote);
					break;
				}
				
				System.out.println();
				System.out.println(player.name + " health: " + player.currentHealth);
				System.out.println(enemy.name + " health: " + enemy.currentHealth);
				System.out.println();
				
			}
			System.out.println("Play again? (yes/no)");
			input = s.nextLine();
			if(!input.equalsIgnoreCase("yes")) {
				playAgain = false;
				System.out.println("Thanks for playing!");
			}
		}
		s.close();
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
