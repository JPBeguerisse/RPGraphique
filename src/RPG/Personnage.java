package RPG;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Personnage {
	protected String name;
	protected double mana;
	protected double XP;
	protected int force;
	private ArrayList<Weapon> contenu = new ArrayList<>();
	protected Position position;
	private int positionRow;
	private int positionCol;


	public void setPosition(Position position) {
		this.position = position;
	}


	static Scanner sc = new Scanner(System.in);

	protected Inventaire inventaire = new Inventaire(contenu);

	public Personnage(String name, double mana, double XP, int force) {
		this.name = name;
		this.mana = mana;
		this.XP = XP;
		this.positionRow = 4;
		this.positionCol = 0;
		this.force = force;
	}
	
	
	
	// Méthode pour créer un personnage
	public static Personnage createPersonnage(String name )
	{
		Personnage pers;
		
		//Si le nom est égale à un personnage existant
		//On crée un nouveau personnage de ce dernier
		if(name.equalsIgnoreCase("Guerrier")) {
			pers = new Guerrier();
		}
		else if(name.equalsIgnoreCase("Miss Fortune")) {
			pers = new Queen();
		}
		else if(name.equalsIgnoreCase("Gandalf")) {
			pers = new Sorcier();
		}
		else if(name.equalsIgnoreCase("Braum")) {
			pers = new Soldat();
		}
		else {
			pers = new Personnage(name, 100, 250, 25);
		}
		
		
		System.out.println(pers.toString());
		return pers;
		
	}
	
	
	//Achat d'arme qui retoune l'XP restant
	public double buy(Weapon w) {
		return this.XP - w.price;
	}
	
	public double getMana() {
		return mana;
	}


	public void setMana(double mana) {
		this.mana = mana;
	}


	public double getXP() {
		return XP;
	}


	public void setXP(double xP) {
		XP = xP;
	}

	
	
	public Inventaire getInventaire() {
		return this.inventaire;
	}

	public void setInventaire(Inventaire inventaire) {
		this.inventaire = inventaire;
	}
	
	public Position getPosition() {
		return position;
	}
	
	
	public int getPositionRow() {
		return positionRow;
	}


	public void setPositionRow(int positionRow) {
		this.positionRow = positionRow;
	}


	public int getPositionCol() {
		return positionCol;
	}


	public void setPositionCol(int positionCol) {
		this.positionCol = positionCol;
	}

	
	public String toString()
	{
		return "Voici les détails de votre personnage :\n"
				+ "Nom: " +this.name 
				+ "\nVie: " +this.mana
				+ "\nXP: " +this.XP
				//+ "\nArmes: " +this.inventaire
				;
	}



	public JPanel affiche() {
		// TODO Auto-generated method stub
		JPanel panelPersonnage = new JPanel();
		BufferedImage img;
		try {	
			img = ImageIO.read(new File("./image/illaoi.jpg"));
			JButton imgPerso = new JButton(new ImageIcon(img));
			JButton choice = new JButton("Choisir");
			JLabel persoName = new JLabel(name);
			JLabel persoMana = new JLabel("Vie: " + mana);
			JLabel persoXP = new JLabel("XP: " + XP + "XP");
			
			panelPersonnage.add(imgPerso);
			panelPersonnage.add(persoName);
			panelPersonnage.add(persoMana);
			panelPersonnage.add(persoXP);
			panelPersonnage.add(choice);
			


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return panelPersonnage;
	}
}

	
