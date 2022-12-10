package RPG;

import java.util.ArrayList;

public class Inventaire {
	
	private ArrayList<Weapon> contenu = new ArrayList<>();
	

	
	public Inventaire(ArrayList<Weapon> contenu)
	{
		this.contenu = contenu;
	}
	
	public void addObjet(Weapon w) {
		this.contenu.add(w);
	}
	
	public ArrayList<Weapon> getContenu() {
		if(contenu == null)
		{
			System.out.println("Votre inventaire est vide");
		}
		return contenu;
	}

	public void setContenu(ArrayList<Weapon> contenu) {
		this.contenu = contenu;
	}
}
