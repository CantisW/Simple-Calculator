package io.github.santeeisweird9;

import java.awt.Color;

import javax.swing.*;

@SuppressWarnings("serial")
public class Frame extends JPanel{
	static String title = "Calculator";
	static int frameWidth = 800;
	static int frameHeight = 900;
	
	static JFrame frame = new JFrame(title);
	static JPanel panel = new JPanel();
	
	public void frame() {
		frame.setSize(frameWidth, frameHeight);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
	}
	
	public void historyPanel() {
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setSize(300, frameHeight);
		panel.setVisible(false);
		frame.add(panel);
		panel.setLocation(800,0);
		panel.setBackground(Color.green);
	}
}
