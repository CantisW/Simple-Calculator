package io.github.santeeisweird9;

import javax.swing.*;

@SuppressWarnings("serial")
public class Frame extends JPanel{
	static String title = "Calculator"; // Name of the program
	static int frameWidth = 800; // Initial length of the frame (x)
	static int frameHeight = 900; // Initial height of the frame (y)
	
	static JFrame frame = new JFrame(title);
	static JPanel main = new JPanel();
	static JPanel panel = new JPanel();
	static JScrollPane scrolling = new JScrollPane();
	
	// ---------------
	// Purpose: Define properties for frame
	// ---------------
	public static void frame() {
		frame.setSize(frameWidth, frameHeight);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// ---------------
	// Purpose: Define properties for panel
	// ---------------
	public static void panel() {
		main.setSize(frameWidth, frameHeight);
		main.setVisible(true);
		main.setLayout(null);
		frame.add(main);
	}
	
	// ---------------
	// Purpose: Define properties for history panel
	// ---------------
	public static void historyPanel() {
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS)); // BoxLayout ensures top to bottom placement
		panel.setSize(300, frameHeight); 
		panel.setVisible(false);
		scrolling.setLocation(800,0); // Aligns to right of main application
		scrolling.setSize(285, frameHeight);
		scrolling.setViewportView(panel);
		scrolling.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrolling.getVerticalScrollBar().setUnitIncrement(16); // Set how fast scrolling is
		frame.add(scrolling);
	}
}
