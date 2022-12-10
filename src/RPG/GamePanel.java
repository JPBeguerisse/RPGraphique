package RPG;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * Ce GamePanel fonctionne comme une écran de jeu
 * on yn décide donc certains paramètre d'écran
 * on implement runnable pour utilisé les thread et faire touné le jeu 
 * Le thread appele automatiquement la fonction run qui tourne
 * */
public class GamePanel extends JPanel implements Runnable {
	// SCREEN SETTINGS
	final int originalTileSize = 16;
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale;
	final int maxScreenCol =  16;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;
	
	int FPS = 60;
	Thread gameThread;
	KeyboardManager key = new KeyboardManager();
	//creation du joueur 
	Player player = new Player(null, this, key);
	
	
	int playerX = 100;
	int playerY = 100;
	int playerSpeed = 4;
	
	
	//Constructeur
	
	public GamePanel()
	{
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(key);
		this.setFocusable(true);
	}

	public void startGameThread()
	{
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		double drawInterval = 1000000000/FPS; //tus les 0.016 seconde on désine l'écran
		double nextDrawTime = System.nanoTime() + drawInterval;
		
		 while(gameThread != null)
		 {
			 //On va faire 2 chose dans  ce boucle
			//1 mis à jour des informations de position dans le map
			 // tant que le jeu tourne on update puis on repaint le graphique
			
			 
			 
			 update();
			 
			 repaint();
			 
			 
			 
			try {
				 double remainingTime = nextDrawTime - System.nanoTime();
				 remainingTime = remainingTime/1000000;
				 
				 if(remainingTime < 0)
				 {
					 remainingTime = 0;
				 }
				 
				Thread.sleep((long) remainingTime);
				
				nextDrawTime += drawInterval;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
	
	public void update()
	{
		player.update();
	}
	
	//methode standars pour déssiner des chose sur le JPanel
	public void paintComponent(Graphics g)
	{
		 super.paintComponent(g);
		 
		 // on creer un petit rectange avec lescordonnées 100 , 100 dans le map
		 Graphics2D g2 = (Graphics2D)g;
		 
		 player.draw(g2);
		 
		 g2.dispose(); 
	}
}
