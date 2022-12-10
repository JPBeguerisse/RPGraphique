package RPG;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WeaponStore {
	JPanel panelWeapon = new JPanel();
	JPanel panelBuy = new JPanel();

	private ArrayList<Weapon> store = new ArrayList<>();	
	Weapon bow = new Bow();
	Weapon hammer = new Hammer();
	Weapon axe = new Axe();
	Weapon sword = new Sword();
	Weapon gun = new Shotgun();
	Weapon grenade = new Grenade();
	
	Scanner sc = new Scanner(System.in);

	
	//Constructeur store
	public WeaponStore(ArrayList<Weapon> store)
	{
		this.store = store;
		this.store.add(bow);
		this.store.add(hammer);
		this.store.add(axe);
		this.store.add(sword);
		this.store.add(gun);
		this.store.add(grenade);
	}
	
	
	
	//afficher les armes et leur prix 
	public JPanel afficheStore() {
		panelWeapon.setLayout(new GridLayout(2, 3, 10, 10));
		int x = 0;
		System.out.println("Bienvenue dans votre boutique \n");
		for(Weapon w : store) {
			//System.out.println(x+1 + " : " + w.ascii());
			panelWeapon.add(w.affiche());
			x++;
		}
		return panelWeapon;
	}

	//Fonction pour acheter une arme qui prend en param la personne qui achète
	public JPanel buyWeapon(Personnage pers)
	{
		JLabel title = new JLabel("Bienvenue, tapez le numéro de l'arme que vous souhaitez acheté");
		JTextField choiceWeapon = new JTextField(10);
		JButton valide = new JButton("Valider");
		JLabel xp = new JLabel("Il vous reste " + pers.XP + "XP");


		valide.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String choiceValue = choiceWeapon.getText(); 
				choiceWeapon.setText("");
				
				int weaponNumber = Integer.parseInt(choiceValue) - 1;
				if(pers.XP - store.get(weaponNumber).price > 0 )
				{
					pers.inventaire.addObjet(store.get(weaponNumber)); //ajouter les armes acheter dans l'inventaire du joueur
					pers.XP -= store.get(weaponNumber).price;
					System.out.println();
					xp.setText("Il vous reste " + pers.XP + "XP");
					//btnInventaire.setVisible(true);

				}else {
					xp.setText("XP insuffisant");
				}
			}
					
		});
		
		panelBuy.add(title);
		panelBuy.add(choiceWeapon);
		panelBuy.add(valide);
		panelBuy.add(xp);


		/*int weaponNumber = -1;
		
		while(weaponNumber<0)
		{
			System.out.println("Saissez le numéro de l'arme que vous souhaitez acheté :");
			weaponNumber = sc.nextInt()-1; //-1 vu que  le tableau commence par 0 (si entre 1 donc egale [0])
			//sc.nextLine();
		}
		if(pers.XP - store.get(weaponNumber).price > 0 )
		{
			pers.inventaire.addObjet(store.get(weaponNumber)); //ajouter les armes acheter dans l'inventaire du joueur
			pers.XP -= store.get(weaponNumber).price;
			System.out.println(pers.inventaire.getContenu()); // afiche les armes dispo dans l'inventaire du joueur
			System.out.println("Il vous reste " + pers.XP + "XP");
			System.out.println();

		}else {
			System.out.println("XP insuffisant");
		}*/
		
		return panelBuy;
				
	}
	
	//Afficher les armes de l'inventaire
	public JPanel panelInventaire(Personnage pers) {
		JPanel panelInvantaire = new JPanel();
		
		ArrayList<Weapon> inventaire = new ArrayList<>();
		inventaire = pers.inventaire.getContenu();
		System.out.println("Vos armes: \n" + pers.inventaire.getContenu()); // afiche les armes dispo dans l'inventaire du joueur

		for(Weapon w : inventaire)
		{
			panelInvantaire.add(w.affiche());
		}

		return panelInvantaire;
	}
}
