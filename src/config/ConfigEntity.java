package config;

import java.awt.Color;

/**
 * Object for all the entities in entityConfig
 * @author Cookielord
 *
 */
public class ConfigEntity {
	
	private String name;
	private int health;
	private Color color;
	private boolean attacker;
	private boolean mover;
	private boolean hostile;
	
	public ConfigEntity(String name, int health, Color color, boolean attacker, boolean mover, boolean hostile){
		this.name = name;
		this.health = health;
		this.color = color;
		this.attacker = attacker;
		this.mover = mover;
		this.hostile = hostile;
	}

	
	/*
	 * Getter and Setter
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isAttacker() {
		return attacker;
	}

	public void setAttacker(boolean attacker) {
		this.attacker = attacker;
	}

	public boolean isMover() {
		return mover;
	}

	public void setMover(boolean mover) {
		this.mover = mover;
	}

	public boolean isHostile() {
		return hostile;
	}

	public void setHostile(boolean hostile) {
		this.hostile = hostile;
	}
}
