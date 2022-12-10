package RPG;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bow extends Weapon{
	private static final double damage = 35;
	private static final String name = "Arc";
	private static final double price = 60;
	private static String sourceImg =  "./image/arc.png";

	
	public Bow() {
		super(1, name, price, damage, sourceImg);
		// TODO Auto-generated constructor stub
	}
	
	
	/*//affiche l'armes et ses details
	public JPanel affiche()
	{
		JPanel panelWeapon = new JPanel();
		//BufferedImage img;
		try {	
			img = ImageIO.read(new File(sourceImg));
			JButton bow = new JButton(new ImageIcon(img));
			JButton buy = new JButton("Acheter");
			JLabel bowName = new JLabel(name);
			JLabel bowDamage = new JLabel("Force: "+damage);
			JLabel bowPrice = new JLabel("Prix:" + price + "XP");
			
			panelWeapon.add(bowName);
			panelWeapon.add(bowDamage);
			panelWeapon.add(bowPrice);
			panelWeapon.add(buy);
			panelWeapon.add(bow);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panelWeapon;
	}*/
}