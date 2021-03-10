package io.github.santeeisweird9;

import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JTextArea;

public class History {
	static Font font = new Font("SansSerif", Font.BOLD, 20);
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
	
	public static void WriteHistory(String expression) {
		try {
			FileWriter writer = new FileWriter("history.txt", true);
			writer.write(expression+'\n');
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void CreateTextArea(String data) {
		// This method creates the TextArea for the history UI
		JTextArea text = new JTextArea();
		Frame.panel.add(text);
		text.setSize(300, 100);
		text.setText(data);
		text.setEditable(false);
		text.setFont(font);
	}
	
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
		} catch (Exception e) {
			System.out.println("An exception has occured!");
			e.printStackTrace();
		}
	}
}
