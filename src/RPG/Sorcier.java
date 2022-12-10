package RPG;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sorcier extends Personnage {


	JLabel persoName = new JLabel("Nom: " + name);
	JLabel persoMana = new JLabel("Vie: " + mana);
	JLabel persoXP = new JLabel("XP: " + XP + "XP");
	JLabel persoForce = new JLabel("Force: " + force);


	public Sorcier() {
		super("Gandalf", 115, 250, 62);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public JPanel affiche() {
		// TODO Auto-generated method stub
		JPanel panelPersonnage = new JPanel();
		BufferedImage img;
		try {	
			img = ImageIO.read(new File("./image/pyke.jpg"));
			
			JButton imgPerso = new JButton(new ImageIcon(img));
			
			panelPersonnage.add(imgPerso);
			panelPersonnage.add(persoName);
			panelPersonnage.add(persoMana);
			panelPersonnage.add(persoXP);
			panelPersonnage.add(persoForce);


			


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panelPersonnage;
	}
	
	public static Personnage createPersonnage()
	{
		
		Personnage pers = new Sorcier();
		System.out.println("good");
		return pers;
	}
}
