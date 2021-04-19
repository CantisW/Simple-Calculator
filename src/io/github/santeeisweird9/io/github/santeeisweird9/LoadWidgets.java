package io.github.santeeisweird9;

import javax.swing.JButton;

public class LoadWidgets {
	
	public static int Width = 100;
	public static int Height = 50;

	public static void LoadFrame() {
		Frame.frame();
		Frame.panel();
		Frame.historyPanel();
	}
	
	public static void LoadButtons() {
		// Types:
		// 1 defines a numerical value (0-9)
		// 2 defines arithmetic (addition, subtraction, etc)
		// 3 defines either a custom value or nothing. Currently a placeholder
		System.out.println("Loading buttons...");
		Frame.main.add(Button.CreateButton("1", 200, 300, Width, Height, 1));
		Frame.main.add(Button.CreateButton("2", 300, 300, Width, Height, 1));
		Frame.main.add(Button.CreateButton("3", 400, 300, Width, Height, 1));
		Frame.main.add(Button.CreateButton("4", 200, 400, Width, Height, 1));
		Frame.main.add(Button.CreateButton("5", 300, 400, Width, Height, 1));
		Frame.main.add(Button.CreateButton("6", 400, 400, Width, Height, 1));
		Frame.main.add(Button.CreateButton("7", 200, 500, Width, Height, 1));
		Frame.main.add(Button.CreateButton("8", 300, 500, Width, Height, 1));
		Frame.main.add(Button.CreateButton("9", 400, 500, Width, Height, 1));
		Frame.main.add(Button.CreateButton("0", 300, 600, Width, Height, 1));
		
		Frame.main.add(Button.CreateButton("+", 500, 300, Width, Height, 2));
		Frame.main.add(Button.CreateButton("-", 500, 400, Width, Height, 2));
		Frame.main.add(Button.CreateButton("x", 500, 500, Width, Height, 2));
		Frame.main.add(Button.CreateButton("/", 500, 600, Width, Height, 2));
		Frame.main.add(Button.CreateButton("x^y", 300, 250, Width, Height, 3));
		
		Frame.main.add(Button.CreateButton("=", 500, 700, Width, Height, 3));
		
		Frame.main.add(Button.CreateButton("History", 600, 100, Width, Height, 3));
	}
	
	
	public static void LoadTextbox() {
		System.out.println("Loading textbox...");
		Textbox.LoadScreen();
		Frame.main.add(Textbox.text);
		System.out.println("Loaded textbox!");
	}
	
	public static void main(String args[]) {
		LoadButtons();
		LoadTextbox();
		LoadFrame();
		System.out.println("All components loaded!");
	}
}
