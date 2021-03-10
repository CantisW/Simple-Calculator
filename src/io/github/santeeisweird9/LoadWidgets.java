package io.github.santeeisweird9;

public class LoadWidgets {
	static Frame Frame = new Frame();
	static Buttons Buttons = new Buttons();
	static Textbox Textbox = new Textbox();
	

	public static void main(String[] args) {
		Frame.frame();
		Frame.historyPanel();
		Frame.frame.add(Textbox.text);
		Frame.frame.add(Buttons.zero);
		Frame.frame.add(Buttons.one);
		Frame.frame.add(Buttons.two);
		Frame.frame.add(Buttons.three);
		Frame.frame.add(Buttons.four);
		Frame.frame.add(Buttons.five);
		Frame.frame.add(Buttons.six);
		Frame.frame.add(Buttons.seven);
		Frame.frame.add(Buttons.eight);
		Frame.frame.add(Buttons.nine);
		Frame.frame.add(Buttons.add);
		Frame.frame.add(Buttons.subtract);
		Frame.frame.add(Buttons.multiply);
		Frame.frame.add(Buttons.divide);
		Frame.frame.add(Buttons.equals);
		Frame.frame.add(Buttons.history);
		History.CreateFile();
		History.ReadHistory();
	}

}
