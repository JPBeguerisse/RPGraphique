package RPG;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.Dimension;


import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class TestFrame extends JFrame{
	JPanel contentPane = (JPanel)this.getContentPane();
	JLabel pic = new JLabel();
	/******* RIGHTPANEL *******/
	JPanel panelRight = new JPanel(new GridLayout(6, 1));
	JButton btnCreate = new JButton("Créer votre personnage");
	JButton btnInventaire = new JButton("Voir votre inventaire");
	JButton btnShop = new JButton("Boutique");
	JButton btnPlay = new JButton("Jouer");
	/********************************/
	
	/******* TOLBAR *******/
	JPanel toolBar = new JPanel();
	JLabel title;
	JTextField choicePerso;
	Personnage p;
	JButton valide;
	/********************************/
	
	/******* TOLBAR *******/
	JPanel panelPersonnage = new JPanel();
	JPanel panelSouth = new JPanel();

	
	/******* SHOP *******/

	ShopTest shop = new ShopTest();
	JPanel panelShop = new JPanel();
	JPanel panelBuyWeapon = new JPanel(new GridLayout(2, 3, 10, 10));
	JButton buy = new JButton();	
	JPanel panelBuy = new JPanel();
	/********************************/

	/******* PERSONNAGE *******/
	PersonnagePanel personnages = new PersonnagePanel();
	JPanel panelPersonnages = new JPanel();
	
	JPanel panelChoice = new JPanel(new GridLayout(1, 4));
	JButton btnChoice1 = new JButton("Choisir");
	JButton btnChoice2 = new JButton("Choisir");
	JButton btnChoice3 = new JButton("Choisir");
	JButton btnChoice4 = new JButton("Choisir");
	JPanel panelInventaire = new JPanel();

	/********************************/


	boolean etatButton;
	private String choiceValue;


	
	
	
	public TestFrame()
	{
		super("RPG");
		getContentPane().setBackground(Color.DARK_GRAY);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1200, 1000);
		this.setLocationRelativeTo(null);
		
		
		BufferedImage img;
		try {
			img = ImageIO.read(new File("./image/background.jpg"));
			pic = new JLabel(new ImageIcon(img));
			 contentPane.add(pic);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		contentPane.add(createRightPanel(), BorderLayout.EAST);


		//contentPane.add(createTool(), BorderLayout.NORTH);
		
		
		
	}
	
	
	
	
	public JPanel createRightPanel()
	{
		btnCreate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//WindowPersonnage wPersonnage = new WindowPersonnage();
				panelPersonnages = personnages.createPersonnages();
				panelPersonnages.setVisible(true);
				panelRight.setVisible(false);
				pic.setVisible(false);
				contentPane.add(panelPersonnages);
			//	contentPane.add(createToolBarPersonnage(), BorderLayout.NORTH);
				contentPane.add(createBtnChoice(), BorderLayout.SOUTH);

				//toolBar.setVisible(false);
			}
			
		});
		panelRight.add(btnCreate);
		
		
		/*JButton btnInventaire = new JButton("Voir votre inventaire");
		//btnClickme.setPreferredSize(new Dimension( 3, 5));
		panelRight.add(btnInventaire);
		JButton btnShop = new JButton("Boutique");
		btnShop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//WindowShop wShop = new WindowShop();
				panelShop = shop.createWeapon();
				panelShop.setVisible(true);
				panelRight.setVisible(false);
				pic.setVisible(false);
				contentPane.add(panelShop);

			}
			
		});
		panelRight.add(btnShop);
		
		JButton btnPlay = new JButton("Jouer");
		panelRight.add(btnPlay);
		return panelRight;
		*/
		
		return panelRight;

	}
	
	
	
	public JPanel panelAfterCreatePlayer()
	{
		//btnClickme.setPreferredSize(new Dimension( 3, 5));
		JButton btnShop = new JButton("Boutique");
		JButton btnPlay = new JButton("Jouer");
		btnPlay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame window = new JFrame();
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setResizable(false);
				window.setTitle("RPG");
				
				
				GamePanel gamePanel = new GamePanel();
				gamePanel.startGameThread();
				window.add(gamePanel);
				//on emballe, le Jpanel pour qu'on puisse le voir
				window.pack();
				window.setLocationRelativeTo(null);
				window.setVisible(true);
			}
			
		});
		
		btnShop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//panelShop = shop.createWeapon();
				ArrayList<Weapon> w = new ArrayList<>();
				WeaponStore store = new WeaponStore(w);
				panelShop = store.afficheStore();
				panelBuy = store.buyWeapon(p);

				panelShop.setVisible(true);
				panelSouth.setVisible(false);
				panelPersonnage.setVisible(false);
				pic.setVisible(false);
				contentPane.add(panelShop);
				contentPane.add(panelBuy, BorderLayout.SOUTH);
				// boutton permettant de voir son inventaire
					JButton btnBack = new JButton("Retour");
					JButton btnSeeInventaire = new JButton("Voir votre inventaire");
					JPanel btnGroup = new JPanel();
					btnBack.setVisible(false);

					btnSeeInventaire.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							panelShop.setVisible(false);
							panelInventaire = store.panelInventaire(p);
							contentPane.add(panelInventaire, BorderLayout.CENTER);
							panelBuy.setVisible(false);
							btnSeeInventaire.setVisible(false);
							btnBack.setVisible(true);
						}
						
					});
					btnGroup.add(btnSeeInventaire);
				
					btnBack.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							panelInventaire.setVisible(false);
							btnSeeInventaire.setVisible(true);
							btnBack.setVisible(false);
							//store.afficheStore();
							panelShop.setVisible(true);
							panelBuy.setVisible(true);
						}
						
					});
					btnGroup.add(btnPlay);
					btnGroup.add(btnBack);
					
				contentPane.add(btnGroup, BorderLayout.NORTH);
			
				//store.buyWeapon(p);
			}
			
		});
		
		panelSouth.add(btnShop);
		
		
		//panelSouth.add(btnPlay);
		return panelSouth;
	}
	
	
	//Methode qui créé des buttons qui permettent de choisir son personnages 
	public JPanel createBtnChoice() {
		/**********Choice1*************/
		btnChoice1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				choiceValue = "Guerrier"; 
				infoPerso(choiceValue);
			}
			
		});
		
		btnChoice2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				choiceValue = "Miss Fortune"; 
				infoPerso(choiceValue);
			}
			
		});
		
		btnChoice3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						choiceValue = "Gandalf"; 
						infoPerso(choiceValue);
					}
					
				});
		btnChoice4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				choiceValue = "Braum"; 
				infoPerso(choiceValue);
			}
			
		});
		panelChoice.add(btnChoice1);
		panelChoice.add(btnChoice2);
		panelChoice.add(btnChoice3);
		panelChoice.add(btnChoice4);

		
		return panelChoice;
	}
	
	
	//Function qui affiche les infos du joueur
	//affiche également les boutons boutique et jouer
	public void infoPerso(String name)
	{
		p = Personnage.createPersonnage(name); 
		panelPersonnages.setVisible(false);
		panelPersonnage = p.affiche();
		//createToolBarPersonnage().setVisible(false);
		createBtnChoice().setVisible(false);
		contentPane.add(panelPersonnage, BorderLayout.CENTER);
		contentPane.add(panelAfterCreatePlayer(), BorderLayout.SOUTH);
	}
}
