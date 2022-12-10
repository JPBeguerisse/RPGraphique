package RPG;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Shotgun extends Weapon{
	private static final double damage = 70;
	private static final String name = "Fusil";
	private static final double price = 150;
	private static String sourceImg =  "./image/arme-a-feu.png";

	public Shotgun() {
		super(5, name, price, damage, sourceImg);
		// TODO Auto-generated constructor stub
	}
	
	
	/*@Override
	public JPanel affiche() {
		JPanel panelWeapon = new JPanel();
		BufferedImage img;
		try {	
			img = ImageIO.read(new File(sourceImg));
			JButton shotGun = new JButton(new ImageIcon(img));
			JButton buy = new JButton("Acheter");
			JLabel shotGunName = new JLabel(name);
			JLabel shotGunDamage = new JLabel("Force: " + damage);
			JLabel shotGunPrice = new JLabel("Prix: " + price + "XP");
			
			panelWeapon.add(shotGunName);
			panelWeapon.add(shotGunDamage);
			panelWeapon.add(shotGunPrice);
			panelWeapon.add(buy);
			panelWeapon.add(shotGun);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panelWeapon;
	}*/


	
	/*@Override
	public void attack(Destructible d) {
		// TODO Auto-generated method stub
		
	}*/

}
