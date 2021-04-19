package io.github.santeeisweird9;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class Button {
	
	public static int Width = 100;
	public static int Height = 50;
	
	
	
	public static JButton CreateButton(String displayname, int x, int y, int Width, int Height, int type) {
		System.out.println("Creating button "+displayname);
		JButton button = new JButton(displayname);
		button.setBounds(x, y, Width, Height);
		switch (type) {
			case 1:
				DefineNumber(button, Integer.parseInt(displayname));
				break;
			case 2:
				DefineArithmetic(button, displayname);
				break;
			default:
				System.out.println("Undefined type for "+displayname+"! Custom button?");
		}
		System.out.println("Created!");
		return button;
	}
	
	public static void DefineNumber(JButton button, int num) {
		
	}
	
	public static void DefineArithmetic(JButton button, String arithmetic) {
		
	}
	
	public static void actionPerformed(ActionEvent e) {
		
	}
}

