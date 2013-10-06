package entitys;

public abstract class AbstractEntity {

	private final String DEFAULTNAME = "DefaultEntity";
	
	private int xPos;
	private int yPos;
	
	private String name;
	
	public AbstractEntity(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
		this.name = DEFAULTNAME;
	}

	public AbstractEntity(int xPos, int yPos, String name){
		this.xPos = xPos;
		this.yPos = yPos;
		this.name = name;
	}
	
	
	
	public abstract Object clone();
	

	/*
	 * Getter and Setter
	 */
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
