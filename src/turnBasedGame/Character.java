package turnBasedGame;

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
	abstract void attack(Character target);
	
	/**
	 * Take damage
	 */
	abstract void takeDamage(int value);
	
	/**
	 * Heal damage
	 */
	abstract void heal();
	
	

}
