package com.play.tests;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.play.tests.Bloc.Type;

public class Scene extends JPanel 
{
	
	ArrayList <Bloc> bloc = new ArrayList<Bloc>();
	Random random = new Random();
	
	Thread thread;
	Controle controle = new Controle();
	Image perso;
	Suguran suguran;

	
	public Scene()
	{
		super();
		
		suguran = new Suguran();
		
		for (int i=0;i<Fenetre.WIDTH*10 ;i+=40)
		{
			for (int j=0;j<Fenetre.HEIGHT*10;j+=40)
			{
				bloc.add(new Bloc(Type.GAZON,i,j));
				
			}
		}
		
		for (int i=0;i<Fenetre.WIDTH*10;i+=40)
		{
			for (int j=-40;j>-Fenetre.HEIGHT*10;j-=40)
			{
				bloc.add(new Bloc(Type.GAZON,i,j));
			}
		}
		
		for (int i=-40;i>-Fenetre.WIDTH*10;i-=40)
		{
			for (int j=0;j<Fenetre.HEIGHT*10;j+=40)
			{
				bloc.add(new Bloc(Type.GAZON,i,j));
			}
		}
		
		for (int i=-40;i>-Fenetre.WIDTH*10;i-=40)
		{
			for (int j=-40;j>-Fenetre.HEIGHT*10;j-=40)
			{
				bloc.add(new Bloc(Type.GAZON,i,j));
			}
		}
		
		for (int i=0;i<=1000;i++)
		{
			
			bloc.add(new Bloc(Type.ARBRE,random.nextInt(Fenetre.WIDTH*10),random.nextInt(Fenetre.HEIGHT*10)));
		}
		

		
		this.setFocusable(true);
		this.requestFocusInWindow(true);
		this.addKeyListener(controle);
		
		thread = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				while (true)
				{
					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		});
		
		thread.start();
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		
		
		for (int i=0;i<bloc.size();i++)
		{
		  g2d.drawImage(bloc.get(i).getImage(), bloc.get(i).getXBl(), bloc.get(i).getYBl(), bloc.get(i).getWidthBl(), bloc.get(i).getHeightBl()	, null);
		}
		
		g2d.drawImage(suguran.getImage(), (int)suguran.getPersoX(), (int)suguran.getPersoY(), suguran.getPersoWidth(), suguran.getPersoHeight(), null);
		
	}

	

}
