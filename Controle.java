package com.play.tests;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controle implements KeyListener 
{
	
	private int VELOCITY = 10;
	private int v_right, v_left, v_bottom, v_top;

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			System.out.println("right");
			
			for (int i=0;i<Fenetre.scene.bloc.size();i++)
			{
				v_right = Fenetre.scene.bloc.get(i).getXBl()-VELOCITY;
				Fenetre.scene.bloc.get(i).setXBl(v_right);
				
			}
		}
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			for (int i=0;i<Fenetre.scene.bloc.size();i++)
			{
				v_left = Fenetre.scene.bloc.get(i).getXBl()+VELOCITY;
				Fenetre.scene.bloc.get(i).setXBl(v_left);
				
			}
		}
		
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			for (int i=0;i<Fenetre.scene.bloc.size();i++)
			{
				v_top = Fenetre.scene.bloc.get(i).getYBl()+VELOCITY;
				Fenetre.scene.bloc.get(i).setYBl(v_top);
				
			}
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			for (int i=0;i<Fenetre.scene.bloc.size();i++)
			{
				v_bottom = Fenetre.scene.bloc.get(i).getYBl()-VELOCITY;
				Fenetre.scene.bloc.get(i).setYBl(v_bottom);
				
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		
		
	}

}
