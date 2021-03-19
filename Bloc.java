package com.play.tests;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bloc {
	
	private int xbloc;
	private int ybloc;
	
	private int heightbloc;
	private int widthbloc;
	
	private Image imge;
	
	public enum Type
	{
		GAZON("/images/gason2.png"),
		ARBRE("/images/arbre.png"),
		MER("/images/mer.png")
		;
		
		String url;
		
		Type(String url)
		{
			this.url = url;
		}
	}
	
	//Instance par défaut
	public Bloc(Type type, int x, int y)
	{
		this.xbloc = x;
		this.ybloc = y;
		this.heightbloc = 40;
		this.widthbloc = 40;
		
		if (type == Type.GAZON)
		{
			imge = new ImageIcon(getClass().getResource(Type.GAZON.url)).getImage();
		}
		
		if (type == Type.ARBRE)
		{
			imge = new ImageIcon(getClass().getResource(Type.ARBRE.url)).getImage();
		}
		
		if (type == Type.MER)
		{
			imge = new ImageIcon(getClass().getResource(Type.MER.url)).getImage();
		}
		
	}
	
	//Instance pérsonalisée
	public Bloc(Type type, int x, int y, int height, int width)
	{
		this.xbloc = x;
		this.ybloc = y;
		this.heightbloc = height;
		this.widthbloc = width;
		
		if (type == Type.GAZON)
		{
			imge = new ImageIcon(getClass().getResource(Type.GAZON.url)).getImage();
		}
	}

	//GETTERS AND SETTERS
	
	public Image getImage()
	{
		return this.imge;
	}
	public void setImage(Image imge)
	{
		this.imge = imge;
	}
	public int getXBl()
	{
		return this.xbloc;
	}
	public void setXBl(int xbloc)
	{
		this.xbloc = xbloc;
	}
	public int getYBl()
	{
		return this.ybloc;
	}
	public void setYBl(int ybloc)
	{
		this.ybloc = ybloc;
	}
	public int getHeightBl()
	{
		return this.heightbloc;
	}
	public void setHeightBl(int heightbloc)
	{
		this.heightbloc = heightbloc;
	}
	public int getWidthBl()
	{
		return this.widthbloc;
	}
	public void setWidthBl(int widthbloc)
	{
		this.widthbloc = widthbloc;
	}
}
