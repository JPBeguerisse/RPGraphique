package RPG;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class WindowPersonnage extends JFrame{
	public WindowPersonnage() {
		super("RPG");
		getContentPane().setBackground(Color.DARK_GRAY);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1200, 1000);
		this.setLocationRelativeTo(null);
		
		JPanel contentPane = (JPanel)this.getContentPane();
		contentPane.add(createTool(), BorderLayout.NORTH);
		
		contentPane.add(createPersonnages(), BorderLayout.CENTER);
		
	}
	
	
	public JToolBar createTool()
	{
		JToolBar toolBar = new JToolBar();
		
		JButton btnBack = new JButton("Retour");
		JLabel title = new JLabel("Bienvenue choississez votre personnage");
		
		btnBack.addActionListener(e->{
			this.dispose();
		});
		toolBar.add(btnBack);
		toolBar.add(title);
		
		return toolBar;
	}
	
	public JPanel createPersonnages()
	{
		JPanel panelPersonnage = new JPanel();
		panelPersonnage.setLayout(new GridLayout(1, 4, 10, 10));
		
		Guerrier guerrier = new Guerrier();
		panelPersonnage.add(guerrier.affiche());
		
		Queen miss = new Queen();
		panelPersonnage.add(miss.affiche());
		
		Sorcier pyke = new Sorcier();
		panelPersonnage.add(pyke.affiche());
		
		Soldat soldat = new Soldat();
		panelPersonnage.add(soldat.affiche());
		
		
		return panelPersonnage;
	}
	
	
}
