package entitys;

import gameInterfaces.Killable;

public abstract class CharacterEntity extends AbstractEntity implements Killable{

	private final int DEFAULTDAMAGE = 1;
	private final int DEFAULTHEALAMOUNT = 1;

	private int health;
	
	public CharacterEntity(int xPos, int yPos, String name, int health){
		super(xPos, yPos, name);
		this.setHealth(health);
	}
	
	@Override
	public void takeDamage() {
		this.health -= DEFAULTDAMAGE;	
	}
	

	@Override
	public void takeDamage(int damage) {
		this.health -= damage;
	}

	@Override
	public void heal() {
		this.health += DEFAULTHEALAMOUNT;
	}
	@Override
	public void heal(int health){
		this.health += health;
	}

	@Override
	public void die() {
	}

	/*
	 * Getter and Setter
	 */
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
