package RPG;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;


public class Player extends Entity{
	GamePanel gp;
	KeyboardManager key;
	
	// entité a rajouter sur rgp
	public Player(Personnage p, GamePanel gp, KeyboardManager key)
	{
		this.gp = gp;
		this.key = key;
		setDefaultValues();
		getPlayerImage();
	}
	
	public void setDefaultValues()
	{
		// a regler pour en bas a gauche le positionnement par dfzut du joueur
		x = 100;
		y = 100;
		speed = 4;
		direction = "down";
	}
	
	
	public void getPlayerImage()
	{
		try {
			up1 = ImageIO.read(new File("./image/boy_up_1.png"));
			down1 = ImageIO.read(new File("./image/boy_down_1.png"));
			left1 = ImageIO.read(new File("./image/boy_left_1.png"));
			right1 = ImageIO.read(new File("./image/boy_right_1.png"));

			//up1 = ImageIO.read(getClass().getResource("./image/boy_down_1.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void update()
	{
		if(key.upPressed == true)
		{
			direction = "up";
			y -= speed;
		}else if(key.downPressed == true)	
		{
			direction = "down";
			y += speed;
		}else if(key.leftPressed == true)
		{
			direction = "left";
			x -= speed;
		}else if(key.rightPressed == true)
		{
			direction = "right";
			x += speed;
		}
	}
	
	public void draw(Graphics g2)
	{		 
		 
		//g2.setColor(Color.white);
		 
		// g2.fillRect(x, y, gp.tileSize, gp.tileSize);
		 
		BufferedImage image = null;
		switch(direction)
		{
		case "up":
			image = up1;
			break;
		case "down":
			image = down1;
			break;
		case "left":
			image = left1;
			break;
		case "right":
			image = right1;
			break;
		}
		
		g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
		 
	}
}
