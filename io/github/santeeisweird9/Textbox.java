package io.github.santeeisweird9;

import java.awt.Font;

import javax.swing.JTextArea;

public class Textbox {
	static JTextArea text = new JTextArea();
	
	static Font font = new Font("SansSerif", Font.BOLD, 20);
	
	static final int textWidth = 400;
	static final int textHeight = 50;
	
	static String guiText;
	
	public static void clear() {
		guiText = null;
		text.setText(guiText);
	}
	
	public static void changeText() {
		text.setText(guiText);
	}
	
	public static void LoadScreen() {
		text.setBounds(175, 100, textWidth, textHeight);
		text.setEditable(false);
		text.setFont(font);
	}
}
