package entitys;

public class NPCEntity extends AgileCharacterEntity {

	private String[] dialogues;
	
	public NPCEntity(int xPos, int yPos, String name, int health,
			float jumpSpeed, float moveSpeed, String [] dialogues) {
		super(xPos, yPos, name, health, jumpSpeed, moveSpeed);
		this.dialogues = dialogues;
		
	}
	
	/*
	 * NPC with zero movementspeed and jumpspeed
	 */
	public NPCEntity(int xPos, int yPos, String name, int health, String [] dialogues){
		super(xPos, yPos, name, health, 0, 0);
		this.dialogues = dialogues;
	}


	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * Getter and Setter
	 */
	public String[] getDialogues() {
		return dialogues;
	}


	public void setDialogues(String[] dialogues) {
		this.dialogues = dialogues;
	}

}
