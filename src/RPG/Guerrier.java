package RPG;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Guerrier extends Personnage{

	public Guerrier() {
		super("Guerrier", 100, 250, 50);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public JPanel affiche() {
		// TODO Auto-generated method stub
		JPanel panelPersonnage = new JPanel();
		BufferedImage img;
		try {	
			img = ImageIO.read(new File("./image/yasuo.jpg"));
			JButton imgPerso = new JButton(new ImageIcon(img));
			JLabel persoName = new JLabel("Nom: " + name);
			JLabel persoMana = new JLabel("Vie: " + mana);
			JLabel persoXP = new JLabel("XP: " + XP + "XP");
			JLabel persoForce = new JLabel("Force: " + force);

			
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

}
