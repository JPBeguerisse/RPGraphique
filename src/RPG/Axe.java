package RPG;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Axe extends Weapon{
	private static final double damage = 40;
	private static final String name = "hache";
	private static final double price = 90;
	private static String sourceImg =  "./image/hache.png";
	
	public Axe() {
		super(3, name, price, damage, sourceImg);

		// TODO Auto-generated constructor stub
	}

	

	




	/*@Override
	public void attack(Destructible d) {
		// TODO Auto-generated method stub
		d.hitMe(damage);
	}*/


	//@Override
	/*public JPanel affiche() {
		// TODO Auto-generated method stub
		/*JPanel panelWeapon = new JPanel();
		//BufferedImage img;
		try {	
			img = ImageIO.read(new File("./image/hache.png"));
			JButton axe = new JButton(new ImageIcon(img));
			JButton buy = new JButton("Acheter");
			JLabel axeName = new JLabel(name);
			JLabel axeDamage = new JLabel("Force: " + damage);
			JLabel axePrice = new JLabel("Prix: " + price + "XP");
			
			panelWeapon.add(axeName);
			panelWeapon.add(axeDamage);
			panelWeapon.add(axePrice);
			panelWeapon.add(buy);
			panelWeapon.add(axe);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panelWeapon;
	}*///
		

}
