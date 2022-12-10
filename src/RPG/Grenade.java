package RPG;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Grenade extends Weapon{
	private static final double damage = 70;
	private static final String name = "Grenade";
	private static final double price = 80;
	private static String sourceImg =  "./image/grenade.png";

	
	public Grenade() {
		super(6, name, price, damage, sourceImg);
		// TODO Auto-generated constructor stub
	}




	/*
	@Override
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
			JButton grenade = new JButton(new ImageIcon(img));
			JButton buy = new JButton("Acheter");
			JLabel grenadeName = new JLabel(name);
			JLabel grenadeDamage = new JLabel("Force: " + damage);
			JLabel grenadePrice = new JLabel("Prix: " + price + "XP");
			
			panelWeapon.add(grenadeName);
			panelWeapon.add(grenadeDamage);
			panelWeapon.add(grenadePrice);
			panelWeapon.add(buy);
			panelWeapon.add(grenade);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panelWeapon;
	}*/

}
