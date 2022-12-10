package RPG;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * cette classee va nous permetre de gérer le déplancement de notre joueur avec le clavier
 */

public class KeyboardManager implements KeyListener {

	public boolean upPressed, downPressed, leftPressed, rightPressed;
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	//quand on appuis sur une touche
	@Override 
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//get keyCode revoie un numéro de la touche qui a été apuuyer
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W)
		{
			upPressed = true;
		}
		
		if(code == KeyEvent.VK_S)
		{
			downPressed = true;
		}
		
		if(code == KeyEvent.VK_A)
		{
			leftPressed = true;
		}
		
		if(code == KeyEvent.VK_D)
		{
			rightPressed = true;
		}
	}

	
	//quand on relache la touche
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W)
		{
			upPressed = false;
		}
		
		if(code == KeyEvent.VK_S)
		{
			downPressed = false;
		}
		
		if(code == KeyEvent.VK_A)
		{
			leftPressed = false;
		}
		
		if(code == KeyEvent.VK_D)
		{
			rightPressed = false;
		}
	}

}
