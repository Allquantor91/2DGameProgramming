package entitys;

import gameInterfaces.Agile;
import gameInterfaces.Attacker;

public class PlayerEntity extends AgileCharacterEntity implements Agile, Attacker {


	public PlayerEntity(int xPos, int yPos, String name, int health,
			float jumpSpeed, float moveSpeed) {
		super(xPos, yPos, name, health, jumpSpeed, moveSpeed);
	}

	@Override
	public Object clone() {
		PlayerEntity ret = new PlayerEntity(getxPos(), getyPos(), getName(),
				getHealth(), getJumpSpeed(), getMoveSpeed());
		return ret;
	}


	@Override
	public void attack() {
		
	}
	

}
