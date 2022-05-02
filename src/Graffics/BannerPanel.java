package Graffics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BannerPanel extends JPanel {
	
	
	
	public BannerPanel()
	{
		
		setLayout(new BorderLayout());
		setBackground(Color.white);
		setPreferredSize(new Dimension(1000,35));
		
		JPanel west= new JPanel();
		JPanel center= new JPanel();
		JPanel east= new JPanel();

		west.setBackground(Color.white);
		add(west,BorderLayout.WEST);
		west.setPreferredSize(new Dimension(200,35));
		
		center.setBackground(Color.white);
		add(center,BorderLayout.CENTER);
		
		east.setBackground(Color.white);
		add(east,BorderLayout.EAST);
		east.setPreferredSize(new Dimension(200,35));
		
		JButton button1= new JButton("Quit");		
		JButton button2= new JButton("Add Player");		
		JButton button3= new JButton("Done");
			
		west.add(button1);
		west.add(button2);
		center.add(button3);
	}
	
	
	
}

