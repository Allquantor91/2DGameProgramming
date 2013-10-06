package entitys;

import gameInterfaces.Agile;

public abstract class AgileCharacterEntity extends CharacterEntity implements Agile {

	private float jumpSpeed;
	private float moveSpeed;
	
	private float curMoveSpeed;
	private float curJumpSpeed;
	
	private boolean moving;
	private boolean jumping;

	public AgileCharacterEntity(int xPos, int yPos, String name, int health,
			float jumpSpeed, float moveSpeed) {
		super(xPos, yPos, name, health);
		this.jumpSpeed = jumpSpeed;
		this.moveSpeed = moveSpeed;
		
		this.curMoveSpeed = 0F;
		this.curJumpSpeed = 0F;
		this.moving = false;
		this.jumping = false;
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
	/*
	 * Getter and Setter
	 */
	public float getJumpSpeed() {
		return jumpSpeed;
	}

	public void setJumpSpeed(float jumpSpeed) {
		this.jumpSpeed = jumpSpeed;
	}

	public float getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(float moveSpeed) {
		this.moveSpeed = moveSpeed;
	}
	
	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public boolean isJumping() {
		return jumping;
	}

	public void setJumping(boolean jumping) {
		this.jumping = jumping;
	}
	
	public float getCurMoveSpeed() {
		return curMoveSpeed;
	}

	public void setCurMoveSpeed(float curMoveSpeed) {
		this.curMoveSpeed = curMoveSpeed;
	}

	public float getCurJumpSpeed() {
		return curJumpSpeed;
	}

	public void setCurJumpSpeed(float curJumpSpeed) {
		this.curJumpSpeed = curJumpSpeed;
	}

}
