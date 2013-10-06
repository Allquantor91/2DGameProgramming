package gameInterfaces;

public interface Killable {
	public void takeDamage();
	public void takeDamage(int damage);
	public void heal();
	public void heal(int health);
	public void die();
}
