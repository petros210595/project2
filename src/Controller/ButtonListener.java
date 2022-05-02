package Controller;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
	 private Container theGuiContainer;

	public ButtonListener(Container initContainer) { 
	 theGuiContainer = initContainer;
	 }
	public void actionPerformed1(ActionEvent event) {
	 System.out.println(event.getActionCommand());
	 theGuiContainer.setBackground(Color.red);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}