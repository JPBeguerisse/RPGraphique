package RPG;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sword extends Weapon{
	private static final int id = 4;
	private static final double damage = 55;
	private static final String name = "Epés";
	private static final double price = 60;
	private static String sourceImg =  "./image/epee.png";

	public Sword() {
		super(id, name, price, damage, sourceImg);
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
			JButton sword = new JButton(new ImageIcon(img));
			JButton buy = new JButton("Acheter");
			JLabel swordName = new JLabel(name);
			JLabel swordDamage = new JLabel("Force: " + damage);
			JLabel swordPrice = new JLabel("Prix: " + price + "XP");
			
			panelWeapon.add(swordName);
			panelWeapon.add(swordDamage);
			panelWeapon.add(swordPrice);
			panelWeapon.add(buy);
			panelWeapon.add(sword);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panelWeapon;
	}*/

}
