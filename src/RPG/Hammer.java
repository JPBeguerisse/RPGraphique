package RPG;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hammer extends Weapon{
	private static final double damage = 20;
	private static final String name = "Marteau";
	private static final double price = 50;
	private static String sourceImg =  "./image/marteau.png";

	public Hammer() {
		super(2,name, price, damage, sourceImg);
		// TODO Auto-generated constructor stub
	}


	

	/*@Override
	public void attack(Destructible d) {
		// TODO Auto-generated method stub
		
	}*/


	/*@Override
	public JPanel affiche() {
		// TODO Auto-generated method stub
		JPanel panelWeapon = new JPanel();
		BufferedImage img;
		try {	
			img = ImageIO.read(new File(sourceImg));
			JButton hammer = new JButton(new ImageIcon(img));
			JButton buy = new JButton("Acheter");
			JLabel hammerName = new JLabel(name);
			JLabel hammerDamage = new JLabel("Force: " + damage);
			JLabel hammerPrice = new JLabel("Prix: " + price + "XP");
			
			panelWeapon.add(hammerName);
			panelWeapon.add(hammerDamage);
			panelWeapon.add(hammerPrice);
			panelWeapon.add(buy);
			panelWeapon.add(hammer);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panelWeapon;
	}*/
}
