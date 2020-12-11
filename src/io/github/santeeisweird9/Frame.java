package io.github.santeeisweird9;

import javax.swing.*;

@SuppressWarnings("serial")
public class Frame extends JPanel{
	static String title = "Calculator";
	static int frameWidth = 900;
	static int frameHeight = 900;
	
	static JFrame frame = new JFrame(title);
	
	
	public void frame() {
		frame.setSize(frameWidth, frameHeight);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
	}
}
