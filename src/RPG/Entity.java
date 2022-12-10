package RPG;
import java.awt.image.BufferedImage;

/*
 * C'st la classe parente de toutes les autres class personnage monster dans le map
 */
public class Entity {

	public int x, y;
	public int speed;
	public BufferedImage up1, up2, down1, left1, right1;

	public String direction;
}
