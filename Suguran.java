package com.play.tests;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Suguran extends Personnage
{
	private static double suguranX = 170;
	private static double suguranY = 170;
	
	private static int suguranHeight = 45;
	private static int suguranWidth = 45;
	
	//faire tableau images perso
	
	private Image suguranImg;
	
	public Suguran()
	{
		super(suguranX,suguranY,suguranWidth,suguranHeight);
		
		this.suguranImg = new ImageIcon(getClass().getResource("/images/spriteluffyhaut2.png")).getImage();
	}
	
	public Image getImage()
	{
		return this.suguranImg;
	}
	public void setImage(Image imageperso)
	{
		this.suguranImg = imageperso;
	}
	
	public void spriteSuguran()
	{
		
	}

}
