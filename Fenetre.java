package com.play.tests;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Fenetre extends JFrame
{
	
	public static final String NAME = "tests";
	public static final int HEIGHT = 400;
	public static final int WIDTH = 400;
	public static Scene scene;
	public final Image image = new ImageIcon(getClass().getResource("/images/gason2.png")).getImage();
	
	public Fenetre()
	{
		this.setTitle(NAME);
		this.setSize(WIDTH,HEIGHT);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(image);
		scene = new Scene();
		this.setContentPane(scene);
		this.setVisible(true);
	}

}
