package com.play.tests;

import java.awt.Image;

public class Personnage 
{
	
	private double persoX, persoY;
	private int persoWidth, persoHeight;
	
	public Personnage(double persoX, double persoY, int persoWidth, int persoHeight)
	{
		this.persoX = persoX;
		this.persoY = persoY;
		this.persoWidth = persoWidth;
		this.persoHeight = persoHeight;
	}
	

	public void setPersoX(int persoX)
	{
		this.persoX = persoX;
	}
	
	public double getPersoX()
	{
		return this.persoX;
	}
	
	public void setPersoY(int persoY)
	{
		this.persoY = persoY;
	}
	
	public double getPersoY()
	{
		return this.persoY;
	}
	
	public void setPersoWidth(int persoWidth)
	{
		this.persoWidth = persoWidth;
	}
	public int getPersoWidth()
	{
		return this.persoWidth;
	}
	
	public void setPersoHeight(int persoHeight)
	{
		this.persoHeight = persoHeight;
	}
	
	public int getPersoHeight()
	{
		return this.persoHeight;
	}

}
