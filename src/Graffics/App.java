package Graffics;

import java.awt.event.WindowListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonListener;

import Controller.ButtonListener;

public class App extends JFrame {
	
	
	 BannerPanel pBanner;
	 PlayerPanel pLeft;
	 PlayerPanel pRight;
	 HallOfFamePanel phof;
	 GamePanel pGame;
	
	
	public App() 
		{
		    super("My Application");
		    
		   
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
			setLayout(new BorderLayout(10,0));
			setSize(1500, 1000);
			setVisible(true);			
			
			pBanner = new BannerPanel();
		    pLeft = new PlayerPanel();
		    pRight = new PlayerPanel();
		    phof = new HallOfFamePanel();		    
		    pGame = new GamePanel();
			
			add(pLeft,BorderLayout.WEST);
			add(phof,BorderLayout.CENTER);
			add(pRight,BorderLayout.EAST);
			add(pBanner,BorderLayout.NORTH);
			
			addWindowListener(new MyWindowListener());
			
		}


	public static void main(String[] args)
	{
		
		App app = new App();
		
				
		
		
	}
	private class MyWindowListener extends WindowAdapter 
	{
		public void windowClosing(WindowEvent event) 
		{
			System.out.println("Here we may save data, etc.");
			System.exit(0);
		}
	}
}

