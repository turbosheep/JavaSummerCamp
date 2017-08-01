package gui;

public class Player extends Character {

	public String surrenderQuote;

	public Player() {
		name = "Player";
		victoryQuote = "I Won!";
		deathQuote = "I lost...";
		surrenderQuote = "I give up...";
	}

	@Override
	public void attack(Character target) {
		// TODO Auto-generated method stub
		target.takeDamage(attackValue);
	}

	@Override
	public void takeDamage(int value) {
		currentHealth -= value;
		if(currentHealth <= 0) {
			isAlive = false;
		}
	}

	@Override
	public void heal() {
		currentHealth += healValue;
		if(currentHealth > maxHealth)
			currentHealth = maxHealth;
	}

}
