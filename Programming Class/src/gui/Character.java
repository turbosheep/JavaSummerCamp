package gui;

public abstract class Character {

	/**
	 * The name of the character
	 */
	protected String name;

	protected String victoryQuote = "Haha! I won!";

	protected String deathQuote = "Oh no! I lost...";

	public boolean isAlive = true;

	/**
	 * The maximum health of the character
	 */
	protected int maxHealth = 100;

	/**
	 * The current health of the character
	 */
	protected int currentHealth = 100;

	/**
	 * The attack value of the character
	 */
	protected int attackValue = 10;

	/**
	 * The value of the character's heal
	 */
	protected int healValue = 15;


	/**
	 * Attacks the target
	 * @param target
	 */
	public abstract void attack(Character target);

	/**
	 * Take damage
	 */
	abstract void takeDamage(int value);

	/**
	 * Heal damage
	 */
	public abstract void heal();

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int amount) {
		currentHealth = amount;
	}
	public void setMaxHealth(int amount) {
		maxHealth = amount;
	}
	public void setAttackValue(int amount) {
		attackValue = amount;
	}
	public void setHealValue(int amount) {
		healValue = amount;
	}
	public void setName(String value) {
		name = value;
	}

	public int getMaxHealth() {
		return maxHealth;
	}
	public int getAttackValue() {
		return attackValue;
	}
	public int getHealValue() {
		return healValue;
	}
	public String getName() {
		return name;
	}

}
