package turnBasedGame;

import java.util.Random;
import java.util.Scanner;

public class GameTester {

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
						// fill in player attacking with your code
						
						
						
						// end of your code
					}
					else if(input.equalsIgnoreCase("heal")) {
						understood = true;
						// fill in player healing

						
						
						// end of your code
					}
					else if(input.equalsIgnoreCase("surrender")) {
						understood = true;
						// fill in player surrendering

						
						
						// end of your code
					}
					else {
						understood = false;
						System.out.println("Please try again.");
						System.out.println("Will " + player.name + " attack, heal, or surrender?");
					}
				} while (!understood); //if command not understood, try again
				
				if(!enemy.isAlive) { // did you kill the enemy?
					// tell player that enemy died and make a new enemy
					
					
					
					
					
					
					// end of your code
					continue;
				}
				
				//********************ENEMY TURN*********************//
				if(enemy.healValue == 0 || enemy.currentHealth > 10) {
					// make enemy attack
					
					
					
					// end of your code
				}
				else {
					//  make enemy heal
					
					
					
					// end of your code
				}
				
				if(!player.isAlive) { // did enemy kill you?
					// tell player you died
					
					
					
					
					// end of your code
					
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
		else if (rand == 1) { // fill out other enemy types
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
