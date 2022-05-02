package Graffics;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PlayerPanel extends JPanel{

	
	
	public PlayerPanel() 
	{
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(400,0));
		
		JButton button1= new JButton();
		JButton button2= new JButton();
		
		//button1.setBounds(100, 100, 400, 100);
		button1.setText("SelectPlayer");
		
		//button2.setBounds(100, 100, 400, 100);		
		button2.setText("Ready");
		
		
		add(button1);
		add(button2);
	}

	
	
	
}
