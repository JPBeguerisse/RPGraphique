package RPG;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.GridLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ShopTest{
	private JPanel panelShop = new JPanel();
	
	public ShopTest() {
		panelShop.add(createTool(), BorderLayout.NORTH);
		panelShop.add(createWeapon(), BorderLayout.CENTER);
	}
	
	
	public JPanel createTool()
	{
		JPanel toolBar = new JPanel();
		
		JButton btnBack = new JButton("Retour");
		JLabel title = new JLabel("Bienvenue dans votre magasin d'armes");
		
		toolBar.add(btnBack);
		toolBar.add(title);
		
		return toolBar;
	}
	
	public JPanel createWeapon()
	{
		JPanel panelWeapon = new JPanel();
		panelWeapon.setLayout(new GridLayout(2, 3, 10, 10));
		

		Bow bow = new Bow();
		panelWeapon.add(bow.affiche());
		
		Sword sword = new Sword();
		panelWeapon.add(sword.affiche());

		Axe axe = new Axe();
		panelWeapon.add(axe.affiche());
		
		Hammer hammer = new Hammer();
		panelWeapon.add(hammer.affiche());
		
		
		Shotgun shotGun = new Shotgun();
		panelWeapon.add(shotGun.affiche());

		Grenade grenade = new Grenade();
		panelWeapon.add(grenade.affiche());
		return panelWeapon;
	}
	
	

	
	
}
