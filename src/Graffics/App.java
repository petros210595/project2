package Graffics;


import java.awt.BorderLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.JFrame;


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

