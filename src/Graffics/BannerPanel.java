package Graffics;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BannerPanel extends JPanel {
	
	
	
	public BannerPanel()
	{
		
		setBackground(Color.white);
		
		
		JButton button1= new JButton();
		JButton button2= new JButton();
		JButton button3= new JButton();
		
		//button1.setBounds(100, 100,200, 200);
		button1.setText("Quit");
		//button1.setBounds(100, 100,200, 200);
		button2.setText("addPlayer");
		//button1.setBounds(100, 100,200, 200);
		button3.setText("Done");
			
		add(button1);
		add(button2);
		add(button3);
	}
	
	
	
}

