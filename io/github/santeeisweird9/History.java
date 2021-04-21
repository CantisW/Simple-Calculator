package io.github.santeeisweird9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JTextArea;

public class History {
	static Font font = new Font("SansSerif", Font.BOLD, 20);
	static Dimension size = new Dimension(300,50);
	
	// ---------------
	// Purpose: Create history.txt unless it already exists
	// ---------------
	public static void CreateFile() {
		try {
			File file = new File("history.txt");
			if (file.createNewFile()) { // Check for duplicate
				System.out.println("Created history.txt!");
			} else {
				System.out.println("Could not create file.");
			}
		} catch (IOException e) {
			System.out.println("An exception has occured!");
			e.printStackTrace();
		}
	}
	
	// ---------------
	// Purpose: Write the passed String expression as history, used at end of calculations
	// ---------------
	public static void WriteHistory(String expression) {
		try {
			FileWriter writer = new FileWriter("history.txt", true);
			writer.write(expression+'\n');
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ---------------
	// Purpose: Define properties of separate TextAreas
	// ---------------
	public static void CreateTextArea(String data) {
		// This method creates the TextArea for the history UI
		JTextArea text = new JTextArea(data);
		Frame.panel.add(text);
		text.setPreferredSize(size);
		text.setEditable(false);
		text.setFont(font);
		text.setBackground(Color.white);
	}
	
	// ---------------
	// Purpose: Read the history, used at startup to create a TextArea for each piece of history
	// ---------------
	public static void ReadHistory() {
		try {
			File file = new File("history.txt");
			Scanner reader = new Scanner(file); // Instruct scanner to read from file
			while(reader.hasNextLine()) {
				String read = reader.nextLine();
				System.out.println("Read: " + read);
				CreateTextArea(read);
			}
			reader.close();
		} catch (Exception e) { // Oops! We somehow forgot how to read!
			System.out.println("An exception has occured!");
			e.printStackTrace();
		}
	}
}
