package turnBasedGame;

public class Vampire extends Enemy {
	
	public Vampire() {
		name = "Vampire";
		maxHealth = 50;
		currentHealth = 50;
		attackValue = 10;
		healValue = 5;
	}

	@Override
	void attack(Character target) {
		target.takeDamage(attackValue);

	}

	@Override
	void takeDamage(int value) {
		currentHealth -= value;
		if(currentHealth <= 0)
			isAlive = false;
	}

	@Override
	void heal() {
		currentHealth += healValue;
		if(currentHealth > maxHealth) {
			currentHealth = maxHealth;
		}
	}

}
