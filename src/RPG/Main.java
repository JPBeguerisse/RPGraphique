package RPG;

/**
 * 
 */
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author The God Father
 *
 */
public class Main extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 36735883922748475L;
	private JPanel panel1;//notre premier panel
	private JPanel panel2;//le second panel
	private JButton masquerPanel1;//le bouton qui nous permettra de masquer le panel 1 si on clique déçu
	private JButton afficherPanel1;//le bouton qui nous permettra d'afficher panel 1 si on clique déçu
	private JButton masquerPanel2;//...
	private JButton afficherPanel2;//..
	private boolean etat_panel1=true;//à deafut le panel1 sera affiché
	private boolean etat_panel2=true;//à defaut le panel2 sera affiché
	
	
	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
		afficherPanel1=new JButton("Rouge [ON]");
		afficherPanel2=new JButton("Bleu [ON]");
		masquerPanel1=new JButton("Rouge [OFF]");
		masquerPanel2=new JButton("Bleu [OFF]");
		panel1=new JPanel(false);
		panel2=new JPanel(false);
		//on ajoute des textes dans les 2 panel mais cela dépend de ce qu'on veux afficher à l'écran
		JLabel label1=new JLabel("<html><head><body color='red'>Panel1 est affiché</body></html>",JLabel.RIGHT);
		JLabel label2=new JLabel("<html><head><body color='blue'>Panel2 est affiché</body></html>",JLabel.RIGHT);
		panel1.add(label1);
		panel2.add(label2);
		JPanel panel = new JPanel(false);
		panel.setLayout(new GridLayout(1,1));
		panel.add(afficherPanel1);
		panel.add(afficherPanel2);
		panel.add(masquerPanel1);
		panel.add(masquerPanel2);
		setLayout(new FlowLayout());
		add(panel1);
		add(panel2);
		add(panel);
		//on donne de l'action aux boutons
		afficherPanel1.addActionListener(this);
		afficherPanel2.addActionListener(this);
		masquerPanel1.addActionListener(this);
		masquerPanel2.addActionListener(this);
	}
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getActionCommand()==this.afficherPanel1.getText()){
			etat_panel1=true;//le panel1 sera affiché
			
		}
		if(ae.getActionCommand()==this.afficherPanel2.getText()){
			etat_panel2=true;//le panel2 sera affiché
		}
		if(ae.getActionCommand()==this.masquerPanel1.getText()){
			etat_panel1=false;//le panel1 sera masqué
		}
		if(ae.getActionCommand()==this.masquerPanel2.getText()){
			etat_panel2=false;//le panel2 sera masqué
		}
		//si les 2 états sont à true alors les 2 panel seront affichés...
		//si l'autre est à true et l'autre à false celui qui est à true sera affiché
		this.panel1.setVisible(etat_panel1);
		this.panel2.setVisible(etat_panel2);
	}
	public static void main(String args[]){
		JFrame frame= new JFrame();//on crée un e fenetre
		frame.pack();//rendre notre fenetre plus dynamique
		frame.add(new Main());//on ajoute notre panel 
		frame.setVisible(true);//on affiche notre fenetre
		frame.setSize(450,200);//la taille de la fenetre
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quitter la fenetre si on clique sur la croix rouge
	}
}