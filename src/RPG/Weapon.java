package RPG;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Weapon {
	protected int id;
	protected String name;
	protected double price;
	protected double damage;
	protected BufferedImage img;
	protected  String sourceImg;

	
	public Weapon(int id, String name, double price, double damage, String source)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.damage = damage;
		this.sourceImg = source;
	}
	
	//public abstract void attack(Destructible d);
	//public abstract JPanel affiche();
	
	public String toString()
	{
		return this.name + "\nPrix: " + this.price + "\nForce :" + this.damage;
	}
	
	public JPanel affiche() {
		JPanel panelWeapon = new JPanel();
		//BufferedImage img;
		try {	
			img = ImageIO.read(new File(sourceImg));
			JButton logo = new JButton(new ImageIcon(img));
			JLabel idWeapon  = new JLabel("" + id + " - " );
			JLabel nameWeapon = new JLabel(name);
			JLabel damageWeapon = new JLabel("Force: " + damage);
			JLabel priceWeapon = new JLabel("Prix: " + price + "XP");
			
			panelWeapon.add(idWeapon);
			panelWeapon.add(nameWeapon);
			panelWeapon.add(damageWeapon);
			panelWeapon.add(priceWeapon);
			panelWeapon.add(logo);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panelWeapon;
	};

}
