package io.github.santeeisweird9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class Buttons {
	static JButton zero = new JButton("0");
	static JButton one = new JButton("1");
	static JButton two = new JButton("2");
	static JButton three = new JButton("3");
	static JButton four = new JButton("4");
	static JButton five = new JButton("5");
	static JButton six = new JButton("6");
	static JButton seven = new JButton("7");
	static JButton eight = new JButton("8");
	static JButton nine = new JButton("9");

	static JButton add = new JButton("+");
	static JButton subtract = new JButton("-");
	static JButton multiply = new JButton("x");
	static JButton divide = new JButton("/");

	static JButton equals = new JButton("=");

	static ArrayList<Long> numbers = new ArrayList<Long>();
	static ArrayList<String> arithmetic = new ArrayList<String>();

	static long currentNum;
	static long secondNum;
	static long answer;

	static boolean isWriting = false;
	static int currentPos = -1;
	static boolean showingAnswer = false;

	final static int buttonWidth = 100;
	final static int buttonHeight = 50;

	public static void ZeroButton() {
		zero.setBounds(300, 600, buttonWidth, buttonHeight);
		zero.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 0!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "0";
						if (showingAnswer == false) {
							currentPos = currentPos + 1;
							if (currentPos != 0 && isWriting) {
								currentPos = currentPos - 1;
								String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
								num = num + "0";
								long i = Integer.parseInt(num); // convert string into int
								numbers.set(currentPos, i);
							} else {
								numbers.add(0L);
							}
						}
					}
				} else {
					Textbox.clear();
					showingAnswer = false;
				}
				Textbox.changeText();
				isWriting = true;
			}
		});
	}

	public static void OneButton() {
		one.setBounds(200, 300, buttonWidth, buttonHeight);
		one.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 1!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "1";
					} else {
						Textbox.guiText = "1";
					}
				} else {
					Textbox.clear();
				}
				Textbox.changeText();
				currentPos = currentPos + 1;
				if (showingAnswer == false) {

					if (currentPos != 0 && isWriting) {
						currentPos = currentPos - 1;
						String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
						num = num + "1";
						long i = Integer.parseInt(num); // convert string into int
						numbers.set(currentPos, i);
					} else {
						numbers.add(1L);
					}
					isWriting = true;
					showingAnswer = false;
				}
				isWriting = true;
				showingAnswer = false;
			}
		});
	}

	public static void TwoButton() {
		two.setBounds(300, 300, buttonWidth, buttonHeight);
		two.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 2!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "2";
					} else {
						Textbox.guiText = "2";
					}
				} else {
					Textbox.clear();
				}
				Textbox.changeText();
				if (showingAnswer == false) {

					currentPos = currentPos + 1;
					if (currentPos != 0 && isWriting) {
						currentPos = currentPos - 1;
						String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
						num = num + "2";
						long i = Integer.parseInt(num); // convert string into int
						numbers.set(currentPos, i);
					} else {
						numbers.add(2L);
					}
					isWriting = true;
					showingAnswer = false;
				}
				isWriting = true;
				showingAnswer = false;
			}
		});
	}

	public static void ThreeButton() {
		three.setBounds(400, 300, buttonWidth, buttonHeight);
		three.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 3!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "3";
					} else {
						Textbox.guiText = "3";
					}
				} else {
					Textbox.clear();
				}
				Textbox.changeText();
				if (showingAnswer == false) {

					currentPos = currentPos + 1;
					if (currentPos != 0 && isWriting) {
						currentPos = currentPos - 1;
						String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
						num = num + "3";
						long i = Integer.parseInt(num); // convert string into int
						numbers.set(currentPos, i);
					} else {
						numbers.add(3L);
					}
					isWriting = true;
					showingAnswer = false;
				}
				isWriting = true;
				showingAnswer = false;
			}
		});
	}

	public static void FourButton() {
		four.setBounds(200, 400, buttonWidth, buttonHeight);
		four.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 4!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "4";
					} else {
						Textbox.guiText = "4";
					}
				} else {
					Textbox.clear();
				}
				Textbox.changeText();
				if (showingAnswer == false) {

					currentPos = currentPos + 1;
					if (currentPos != 0 && isWriting) {
						currentPos = currentPos - 1;
						String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
						num = num + "4";
						long i = Integer.parseInt(num); // convert string into int
						numbers.set(currentPos, i);
					} else {
						numbers.add(4L);
					}
					isWriting = true;
					showingAnswer = false;
				}
			}
		});
	}

	public static void FiveButton() {
		five.setBounds(300, 400, buttonWidth, buttonHeight);
		five.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 5!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "5";
					} else {
						Textbox.guiText = "5";
					}
				} else {
					Textbox.clear();
				}
				Textbox.changeText();
				if (showingAnswer == false) {

					currentPos = currentPos + 1;
					if (currentPos != 0 && isWriting) {
						currentPos = currentPos - 1;
						String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
						num = num + "5";
						long i = Integer.parseInt(num); // convert string into int
						numbers.set(currentPos, i);
					} else {
						numbers.add(5L);
					}

				}
				isWriting = true;
				showingAnswer = false;
			}
		});
	}

	public static void SixButton() {
		six.setBounds(400, 400, buttonWidth, buttonHeight);
		six.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 6!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "6";
					} else {
						Textbox.guiText = "6";
					}
				} else {
					Textbox.clear();
				}
				Textbox.changeText();
				if (showingAnswer == false) {

					currentPos = currentPos + 1;
					if (currentPos != 0 && isWriting) {
						currentPos = currentPos - 1;
						String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
						num = num + "6";
						long i = Integer.parseInt(num); // convert string into int
						numbers.set(currentPos, i);
					} else {
						numbers.add(6L);
					}
				}
				isWriting = true;
				showingAnswer = false;
			}
		});
	}

	public static void SevenButton() {
		seven.setBounds(200, 500, buttonWidth, buttonHeight);
		seven.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 7!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "7";
					} else {
						Textbox.guiText = "7";
					}
				} else {
					Textbox.clear();
				}
				Textbox.changeText();
				if (showingAnswer == false) {
					currentPos = currentPos + 1;
					if (currentPos != 0 && isWriting) {
						currentPos = currentPos - 1;
						String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
						num = num + "7";
						long i = Integer.parseInt(num); // convert string into int
						numbers.set(currentPos, i);
					} else {
						numbers.add(7L);
					}
					isWriting = true;
					showingAnswer = false;
				}
				isWriting = true;
				showingAnswer = false;
			}
		});
	}

	public static void EightButton() {
		eight.setBounds(300, 500, buttonWidth, buttonHeight);
		eight.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 8!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "8";
					} else {
						Textbox.guiText = "8";
					}
				} else {
					Textbox.clear();
				}
				Textbox.changeText();
				if (showingAnswer == false) {
					currentPos = currentPos + 1;
					if (currentPos != 0 && isWriting) {
						currentPos = currentPos - 1;
						String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
						num = num + "8";
						long i = Integer.parseInt(num); // convert string into int
						numbers.set(currentPos, i);
					} else {
						numbers.add(8L);
					}
					isWriting = true;
					showingAnswer = false;
				}
				isWriting = true;
				showingAnswer = false;
			}
		});
	}

	public static void NineButton() {
		nine.setBounds(400, 500, buttonWidth, buttonHeight);
		nine.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button 9!");
				if (showingAnswer == false) {
					if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
						Textbox.guiText = Textbox.guiText + "9";
					} else {
						Textbox.guiText = "9";
					}
				} else {
					Textbox.clear();
				}
				Textbox.changeText();
				if (showingAnswer == false) {
					currentPos = currentPos + 1;
					if (currentPos != 0 && isWriting && !showingAnswer) {
						currentPos = currentPos - 1;
						String num = String.valueOf(numbers.get(currentPos)); // This is terrible.
						num = num + "9";
						long i = Integer.parseInt(num); // convert string into int
						numbers.set(currentPos, i);
					} else {
						numbers.add(9L);
					}
					isWriting = true;
					showingAnswer = false;
				}
				isWriting = true;
				showingAnswer = false;
			}
		});
	}

	public static void AddButton() {
		add.setBounds(500, 300, buttonWidth, buttonHeight);
		add.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button +!");
				if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
					Textbox.guiText = Textbox.guiText + "+";
				}
				Textbox.changeText();
				arithmetic.add("+");
				isWriting = false;
			}
		});
	}

	public static void SubtractButton() {
		subtract.setBounds(500, 400, buttonWidth, buttonHeight);
		subtract.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button -!");
				if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
					Textbox.guiText = Textbox.guiText + "-";
				}
				Textbox.changeText();
				arithmetic.add("-");
				isWriting = false;
			}
		});
	}

	public static void MultiplyButton() {
		multiply.setBounds(500, 500, buttonWidth, buttonHeight);
		multiply.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button x!");
				if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
					Textbox.guiText = Textbox.guiText + "x";
				}
				Textbox.changeText();
				arithmetic.add("x");
				isWriting = false;
			}
		});
	}

	public static void DivideButton() {
		divide.setBounds(500, 600, buttonWidth, buttonHeight);
		divide.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button /!");
				if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {
					Textbox.guiText = Textbox.guiText + "/";
				}
				Textbox.changeText();
				arithmetic.add("/");
				isWriting = false;
			}
		});
	}

	public static void EqualsButton() {
		equals.setBounds(500, 700, buttonWidth, buttonHeight);
		equals.addActionListener(new ActionListener() { // On button clicked
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked button =!");
				if (Textbox.guiText != null && !Textbox.guiText.isEmpty()) {

				}
				for (int i = 1; i < arithmetic.size() + 1; i++) {
					if (i == 1) {
						currentNum = numbers.get(i - 1);
					} else {
						currentNum = answer;
					}
					secondNum = numbers.get(i);
					String currentArithmetic = arithmetic.get(i - 1);
					if (currentArithmetic.contentEquals("+")) {
						answer = Calculate.Add(currentNum, secondNum);
					}
					if (currentArithmetic.contentEquals("-")) {
						answer = Calculate.Subtract(currentNum, secondNum);
					}
					if (currentArithmetic.contentEquals("x")) {
						answer = Calculate.Multiply(currentNum, secondNum);
					}
					if (currentArithmetic.contentEquals("/")) {
						answer = Calculate.Divide(currentNum, secondNum);
					}

				}
				String ans = String.valueOf(answer);
				Textbox.guiText = ans;
				showingAnswer = true;
				Textbox.changeText();
				numbers.clear();
				arithmetic.clear();
				currentPos = -1;
			}
		});
	}

	public Buttons() {
		System.out.println("Buttons constructor called.");
		ZeroButton();
		OneButton();
		TwoButton();
		ThreeButton();
		FourButton();
		FiveButton();
		SixButton();
		SevenButton();
		EightButton();
		NineButton();
		AddButton();
		SubtractButton();
		MultiplyButton();
		DivideButton();
		EqualsButton();
	}
}
