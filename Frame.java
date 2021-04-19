package io.github.santeeisweird9;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

@SuppressWarnings("serial")
public class Frame extends JPanel{
	static String title = "Calculator";
	static int frameWidth = 800;
	static int frameHeight = 900;
	
	static JFrame frame = new JFrame(title);
	static JPanel main = new JPanel();
	static JPanel panel = new JPanel();
	static JScrollPane scrolling = new JScrollPane();
	
	public static void frame() {
		frame.setSize(frameWidth, frameHeight);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void panel() {
		main.setSize(frameWidth, frameHeight);
		main.setVisible(true);
		main.setLayout(null);
		frame.add(main);
	}
	
	public static void historyPanel() {
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.setSize(300, frameHeight);
		panel.setVisible(false);
		scrolling.setLocation(800,0);
		scrolling.setSize(285, frameHeight);
		scrolling.setViewportView(panel);
		scrolling.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrolling.getVerticalScrollBar().setUnitIncrement(16);
		frame.add(scrolling);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
