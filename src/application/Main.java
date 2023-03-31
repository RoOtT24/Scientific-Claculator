package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// CursorStack<String> inputs = new CursorStack<>();
			Group root = new Group();

			TextField txt1 = new TextField();
			txt1.setLayoutX(10);
			txt1.setLayoutY(5);
			txt1.setPrefSize(360, 50);
			txt1.setFont(new Font(20));
			txt1.setEditable(false);

			TextField txt2 = new TextField();
			txt2.setLayoutX(10);
			txt2.setLayoutY(58);
			txt2.setPrefSize(360, 50);
			txt2.setFont(new Font(20));
			txt2.setEditable(false);

			TextField txt3 = new TextField();
			txt3.setLayoutX(10);
			txt3.setLayoutY(111);
			txt3.setPrefSize(360, 35);
			txt3.setFont(new Font(15));
			txt3.setEditable(false);

			Button b1 = new Button("sin");
			b1.setLayoutX(5);
			b1.setLayoutY(150);
			b1.setPrefSize(50, 30);
			b1.setFont(new Font(15));
			b1.setStyle("-fx-background-color:#ADD8E6;");
			b1.setTextFill(Color.BLACK);

			Button b2 = new Button("cos");
			b2.setLayoutX(58);
			b2.setLayoutY(150);
			b2.setPrefSize(50, 30);
			b2.setFont(new Font(15));
			b2.setStyle("-fx-background-color:#ADD8E6;");
			b2.setTextFill(Color.BLACK);

			Button b3 = new Button("tan");
			b3.setLayoutX(111);
			b3.setLayoutY(150);
			b3.setPrefSize(50, 30);
			b3.setFont(new Font(15));
			b3.setStyle("-fx-background-color:#ADD8E6;");
			b3.setTextFill(Color.BLACK);

			Button b4 = new Button("(");
			b4.setLayoutX(164);
			b4.setLayoutY(150);
			b4.setPrefSize(50, 30);
			b4.setFont(new Font(15));
			b4.setStyle("-fx-background-color:FLORALWHITE;");

			Button b5 = new Button(")");
			b5.setLayoutX(217);
			b5.setLayoutY(150);
			b5.setPrefSize(50, 30);
			b5.setFont(new Font(15));
			b5.setStyle("-fx-background-color:FLORALWHITE;");

			Button b6 = new Button("!");
			b6.setLayoutX(274);
			b6.setLayoutY(150);
			b6.setPrefSize(50, 30);
			b6.setFont(new Font(15));
			b6.setStyle("-fx-background-color:#ADD8E6;");
			b6.setTextFill(Color.BLACK);

			Button b7 = new Button("OFF");
			b7.setLayoutX(326);
			b7.setLayoutY(150);
			b7.setPrefSize(50, 30);
			b7.setFont(new Font(15));
			b7.setStyle("-fx-background-color:	CADETBLUE;");

			Button b8 = new Button("\u03c0");
			b8.setLayoutX(5);
			b8.setLayoutY(185);
			b8.setPrefSize(50, 40);
			b8.setFont(new Font(15));
			b8.setStyle("-fx-background-color:#ADD8E6;");

			Button b9 = new Button("y^x");
			b9.setLayoutX(58);
			b9.setLayoutY(185);
			b9.setPrefSize(50, 40);
			b9.setFont(new Font(13));
			b9.setStyle("-fx-background-color:#ADD8E6;");
			b9.setTextFill(Color.BLACK);

			Button b10 = new Button("7");
			b10.setLayoutX(113);
			b10.setLayoutY(185);
			b10.setPrefSize(50, 40);
			b10.setFont(new Font(15));
			b10.setStyle("-fx-background-color:black;");
			b10.setTextFill(Color.WHITE);

			Button b11 = new Button("8");
			b11.setLayoutX(166);
			b11.setLayoutY(185);
			b11.setPrefSize(50, 40);
			b11.setFont(new Font(15));
			b11.setStyle("-fx-background-color:black;");
			b11.setTextFill(Color.WHITE);

			Button b12 = new Button("9");
			b12.setLayoutX(219);
			b12.setLayoutY(185);
			b12.setPrefSize(50, 40);
			b12.setFont(new Font(15));
			b12.setStyle("-fx-background-color:black;");
			b12.setTextFill(Color.WHITE);

			Button b13 = new Button("\u00F7");
			b13.setLayoutX(274);
			b13.setLayoutY(185);
			b13.setPrefSize(50, 40);
			b13.setFont(new Font(15));
			b13.setStyle("-fx-background-color:	SILVER;");

			Button b14 = new Button("(-)");
			b14.setLayoutX(328);
			b14.setLayoutY(185);
			b14.setPrefSize(50, 40);
			b14.setFont(new Font(15));
			b14.setStyle("-fx-background-color:FLORALWHITE;");

			Button b15 = new Button("x" + "\u00B2");
			b15.setLayoutX(5);
			b15.setLayoutY(228);
			b15.setPrefSize(50, 40);
			b15.setFont(new Font(15));
			b15.setStyle("-fx-background-color:#ADD8E6;");
			b15.setTextFill(Color.BLACK);

			Button b16 = new Button("\u221A" + "x");
			b16.setLayoutX(58);
			b16.setLayoutY(228);
			b16.setPrefSize(50, 40);
			b16.setFont(new Font(15));
			b16.setStyle("-fx-background-color:#ADD8E6;");

			Button b17 = new Button("4");
			b17.setLayoutX(114);
			b17.setLayoutY(228);
			b17.setPrefSize(50, 40);
			b17.setFont(new Font(15));
			b17.setStyle("-fx-background-color:black;");
			b17.setTextFill(Color.WHITE);

			Button b18 = new Button("5");
			b18.setLayoutX(167);
			b18.setLayoutY(228);
			b18.setPrefSize(50, 40);
			b18.setFont(new Font(15));
			b18.setStyle("-fx-background-color:black;");
			b18.setTextFill(Color.WHITE);

			Button b19 = new Button("6");
			b19.setLayoutX(220);
			b19.setLayoutY(228);
			b19.setPrefSize(50, 40);
			b19.setFont(new Font(15));
			b19.setStyle("-fx-background-color:black;");
			b19.setTextFill(Color.WHITE);

			Button b20 = new Button("X");
			b20.setLayoutX(274);
			b20.setLayoutY(228);
			b20.setPrefSize(50, 40);
			b20.setFont(new Font(15));
			b20.setStyle("-fx-background-color:	SILVER;");

			Button b21 = new Button("CA");
			b21.setLayoutX(328);
			b21.setLayoutY(228);
			b21.setPrefSize(50, 40);
			b21.setFont(new Font(15));
			b21.setStyle("-fx-background-color:pink;");

			Button b22 = new Button("e^x");
			b22.setLayoutX(5);
			b22.setLayoutY(270);
			b22.setPrefSize(50, 40);
			b22.setFont(new Font(15));
			b22.setStyle("-fx-background-color:#ADD8E6;");
			b22.setTextFill(Color.BLACK);

			Button b23 = new Button("LN");
			b23.setLayoutX(58);
			b23.setLayoutY(270);
			b23.setPrefSize(50, 40);
			b23.setFont(new Font(15));
			b23.setStyle("-fx-background-color:#ADD8E6;");
			b23.setTextFill(Color.BLACK);

			Button b24 = new Button("1");
			b24.setLayoutX(115);
			b24.setLayoutY(270);
			b24.setPrefSize(50, 40);
			b24.setFont(new Font(15));
			b24.setStyle("-fx-background-color:black;");
			b24.setTextFill(Color.WHITE);

			Button b25 = new Button("2");
			b25.setLayoutX(168);
			b25.setLayoutY(270);
			b25.setPrefSize(50, 40);
			b25.setFont(new Font(15));
			b25.setStyle("-fx-background-color:black;");
			b25.setTextFill(Color.WHITE);

			Button b26 = new Button("3");
			b26.setLayoutX(221);
			b26.setLayoutY(270);
			b26.setPrefSize(50, 40);
			b26.setFont(new Font(15));
			b26.setStyle("-fx-background-color:black;");
			b26.setTextFill(Color.WHITE);

			Button b27 = new Button("-");
			b27.setLayoutX(274);
			b27.setLayoutY(270);
			b27.setPrefSize(50, 40);
			b27.setFont(new Font(15));
			b27.setStyle("-fx-background-color:	SILVER;");

			Button b28 = new Button("C");
			b28.setLayoutX(328);
			b28.setLayoutY(270);
			b28.setPrefSize(50, 40);
			b28.setFont(new Font(15));
			b28.setStyle("-fx-background-color:pink;");

			Button b29 = new Button("LOG");
			b29.setLayoutX(5);
			b29.setLayoutY(312);
			b29.setPrefSize(50, 40);
			b29.setFont(new Font(15));
			b29.setStyle("-fx-background-color:#ADD8E6;");
			b29.setTextFill(Color.BLACK);

			Button b30 = new Button("1/x");
			b30.setLayoutX(58);
			b30.setLayoutY(312);
			b30.setPrefSize(50, 40);
			b30.setFont(new Font(15));
			b30.setStyle("-fx-background-color:#ADD8E6;");
			b30.setTextFill(Color.BLACK);

			Button b31 = new Button("0");
			b31.setLayoutX(115);
			b31.setLayoutY(312);
			b31.setPrefSize(50, 40);
			b31.setFont(new Font(15));
			b31.setStyle("-fx-background-color:black;");
			b31.setTextFill(Color.WHITE);

			Button b32 = new Button(".");
			b32.setLayoutX(169);
			b32.setLayoutY(312);
			b32.setPrefSize(50, 40);
			b32.setFont(new Font(15));
			b32.setStyle("-fx-background-color:FLORALWHITE;");

			Button b33 = new Button("%");
			b33.setLayoutX(222);
			b33.setLayoutY(312);
			b33.setPrefSize(49, 40);
			b33.setFont(new Font(15));
			b33.setStyle("-fx-background-color:	SILVER;");

			Button b34 = new Button("+");
			b34.setLayoutX(274);
			b34.setLayoutY(312);
			b34.setPrefSize(50, 40);
			b34.setFont(new Font(15));
			b34.setStyle("-fx-background-color:	SILVER;");

			Button b35 = new Button();
			b35.setLayoutX(328);
			b35.setLayoutY(312);
			b35.setPrefSize(50, 40);
			b35.setFont(new Font(15));
			/*
			 * Image img35 = new Image("back1.jpg"); ImageView view35 = new
			 * ImageView(img35); view35.setFitHeight(15); view35.setPreserveRatio(true);
			 * b35.setGraphic(view35);
			 */ b35.setStyle("-fx-background-color:pink;");

			Button b36 = new Button("=");
			b36.setLayoutX(5);
			b36.setLayoutY(370);
			b36.setPrefSize(370, 5);
			b36.setFont(new Font(45));
			b36.setStyle("-fx-background-color:	CADETBLUE;");
			
			

			b31.setOnAction(e -> {
				if (b31.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("0");
				}
			});

			b24.setOnAction(e -> {
				if (b24.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("1");
				}
			});

			b25.setOnAction(e -> {
				if (b25.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("2");
				}
			});

			b26.setOnAction(e -> {
				if (b26.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("3");
				}
			});

			b17.setOnAction(e -> {
				if (b17.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("4");
				}
			});

			b18.setOnAction(e -> {
				if (b18.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("5");
				}
			});

			b19.setOnAction(e -> {
				if (b19.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("6");
				}
			});

			b10.setOnAction(e -> {
				if (b10.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("7");
				}
			});

			b11.setOnAction(e -> {
				if (b11.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("8");
				}
			});

			b12.setOnAction(e -> {
				if (b12.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("9");
				}
			});

			b1.setOnAction(e -> {
				if (b1.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("sin(");
				}
			});

			b2.setOnAction(e -> {
				if (b2.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("cos(");
				}
			});

			b3.setOnAction(e -> {
				if (b3.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("tan(");
				}
			});

			b4.setOnAction(e -> {
				if (b4.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("(");
				}
			});

			b5.setOnAction(e -> {
				if (b5.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText(")");
				}
			});

			b6.setOnAction(e -> {
				if (b6.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("!");
				}
			});

			b8.setOnAction(e -> {
				if (b8.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("\u03c0");

				}
			});

			b9.setOnAction(e -> {
				if (b9.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("^");
				}
			});

			b13.setOnAction(e -> {
				if (b13.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("\u00F7");
				}
			});

			b14.setOnAction(e -> {
				if (b14.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					
					txt1.appendText("-");
				}
			});

			b15.setOnAction(e -> {
				if (b15.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("^2");
				}

			});

			b16.setOnAction(e -> {
				if (b16.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("\u221A(");
				}
			});

			b20.setOnAction(e -> {
				if (b20.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("X");
				}
			});

			b22.setOnAction(e -> {
				if (b22.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("e(");
				}
			});

			b23.setOnAction(e -> {
				if (b23.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("LN(");
				}
			});

			b27.setOnAction(e -> {
				if (b27.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("-");
				}
			});

			b29.setOnAction(e -> {
				if (b29.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("LOG(");
				}
			});

			b30.setOnAction(e -> {
				if (b30.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					String text = txt1.getText();
					txt1.clear();
					txt1.appendText("1\u00F7");
					txt1.appendText("(");
					txt1.appendText(text);
					txt1.appendText(")");
				}
			});

			b32.setOnAction(e -> {
				if (b32.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText(".");
				}
			});

			b33.setOnAction(e -> {
				if (b33.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("%");
				}
			});

			b34.setOnAction(e -> {
				if (b34.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.appendText("+");
				}
			});

			b35.setOnAction(e -> {
				if (b35.isArmed() && !txt1.getText().equalsIgnoreCase("SYNTEX ERROR")) {
					txt1.setText(txt1.getText().substring(0, txt1.getText().length() - 1)); // remove the last input
				}
			});

			b7.setOnAction(e -> {
				if (b7.isArmed()) {
					javafx.application.Platform.exit();
				}
			});

			b21.setOnAction(e -> {
				if (b21.isArmed()) {
					txt1.clear();
					txt2.clear();
					txt3.clear();
				}
			});

			b28.setOnAction(e -> {
				if (b28.isArmed()) {
					txt1.clear();
					txt2.clear();
					txt3.clear();
				}
			});

			b36.setOnAction(e -> {
				if (b36.isArmed() && !txt1.getText().isBlank() && !txt1.getText().equals("SYNTEX ERROR")) {
					;
					String s = txt1.getText().trim();
					try {
						s = spaceSplitter(s).trim();

						if (s == null)
							txt1.setText("SYNTEX ERROR");

						else {
							if (!paranthasisChecker(s))
								txt1.setText("SYNTEX ERROR");
							else {

								s = postfix(s);
								txt2.setText(s);
								txt3.setText(Double.toString(evaluate(s)));

							}
						}

					} catch (Exception x) {
						txt1.setText("SYNTEX ERROR");
					}
				}

			});

			root.getChildren().addAll(txt1, txt2, txt3, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14,
					b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34,
					b35, b36);
			Scene scene = new Scene(root, 380, 490);
			scene.setFill(Color.GRAY);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("CALCULATOR");
			// primaryStage.getIcons().addAll(new Image("calculator.jpg"));
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public boolean paranthasisChecker(String s) {
		CursorStack<String> stack = new CursorStack<>();

		s = "( " + s + " )";
		String[] tokens = s.trim().split(" ");

		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals(")")) {
				if (stack.isEmpty())
					return false;
				while (!stack.pop().equals("("))
					if (stack.isEmpty())
						return false;
					else
						continue;
			} else
				stack.push(tokens[i]);
		}

		if (!stack.isEmpty())
			return false;

		return true;

	}

	public int Prec(String ch) {

		if (ch.equals("+") || ch.equals("-") || ch.equals("%"))
			return 1;

		else if (ch.equals("X") || ch.equals("\u00F7"))
			return 2;

		else if (ch.equals("^") || ch.equals("") || ch.equals("sin") || ch.equals("cos") || ch.equals("tan")
				|| ch.equals("LN") || ch.equals("LOG") || ch.equals("\u221A") || ch.equals("\u00B2") || ch.equals("!"))
			return 3;

		return -1;

	}

	// The main method that converts
	// given infix expression
	// to postfix expression.
	public String postfix(String s) {

		// initializing empty String for result
		String result = new String("");

		// initializing empty stack
		CursorStack<String> stack = new CursorStack<>();
		String[] exp = s.trim().split(" ");
		boolean minus = false ;
		for (int i = 0; i < exp.length; ++i) {
			String c = exp[i];

			if(c.charAt(0) == '-' && c.length()>1) {
				
			while(c.charAt(0) == '-') {
				if(minus) 
					minus = false ;
				else
				minus = true ;
				c = c.substring(1) ;
			}}
			
			// If the scanned character is an
			// operand, add it to output.
			if (Character.isDigit(c.charAt(0)) || c.charAt(0) == '.' || c.charAt(0) == 'π' ) {
				if(minus) {
					minus = false ;
				result +="-"+ c + " ";}
				else
					result += c+" " ;
			
			}

			// If the scanned character is an '(',
			// push it to the stack.
			else if (c.equals("("))
				stack.push(c);

			// If the scanned character is an ')',
			// pop and output from the stack
			// until an '(' is encountered.
			else if (c.equals(")")) {
				while (!stack.isEmpty() && !stack.peek().equals("("))
					result += stack.pop() + " ";

				stack.pop();
			} else // an operator is encountered
			{
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
					result += stack.pop() + " ";
				}
				stack.push(c);
			}
		}

		// pop all the operators from the stack
		while (!stack.isEmpty()) {	
			if (stack.peek() == "(")
				return "SYNTEX ERROR";
			result += stack.pop() + " ";
		}

		return result;
	}

	//////////////////////////////////////////////////////////////////////////////
	public double evaluate(String s) { // postfix
		String[] tokens = s.trim().split(" ");
		double val1, val2;
		CursorStack<Double> stack = new CursorStack<>();
		for (int i = 0; i < tokens.length; ++i) {
			if (tokens[i].equals("π"))
				stack.push(Math.PI);
			else if (isNumeric(tokens[i])) // If Its A Number Then Push
				stack.push(Double.parseDouble(tokens[i])); // ignore

			else if (tokens[i].equals("÷")) { // - , * , / , + , ^ , %
				val1 = stack.pop();
				val2 = stack.pop();
				if (val1 != 0)
					stack.push(val2 / val1);
			}

			else if (tokens[i].equals("-")) {
				val1 = stack.pop();
				val2 = stack.pop();
				stack.push(val2 - val1);
			}

			else if (tokens[i].equals("+")) {
				val1 = stack.pop();
				val2 = stack.pop();
				stack.push(val2 + val1);
			}

			else if (tokens[i].equals("X")) {
				val1 = stack.pop();
				val2 = stack.pop();

				stack.push(val2 * val1);
			}

			else if (tokens[i].equals("%")) {
				val1 = stack.pop();
				val2 = stack.pop();
				if (val1 != 0)
					stack.push(val2 % val1);
			}

			else if (tokens[i].equals("^")) {
				val1 = stack.pop();
				val2 = stack.pop();
				stack.push(Math.pow(val2, val1));
			}

			else if (tokens[i].equals("sin")) { // log , LN , Fac , cos , tan , sqrt
				val1 = stack.pop();
				stack.push(Math.sin(Math.toRadians(val1)));
			}

			else if (tokens[i].equals("cos")) {
				val1 = stack.pop();
				stack.push(Math.cos(Math.toRadians(val1)));

			}

			else if (tokens[i].equals("tan")) {
				val1 = stack.pop();
				if (Math.cos(val1) != 0)
					stack.push(Math.tan(Math.toRadians(val1)));
			}

			else if (tokens[i].equals("√")) {
				val1 = stack.pop();
				stack.push(Math.sqrt(val1));
			}

			else if (tokens[i].equals("LOG")) {
				val1 = stack.pop();
				stack.push(Math.log10(val1));
			}

			else if (tokens[i].equals("LN")) {
				val1 = stack.pop();
				stack.push(Math.log(val1));
			}

			else if (tokens[i].equals("e")) {
				val1 = stack.pop();
				stack.push(Math.exp(val1));
			}

			else if (tokens[i].equals("!")) {
				val1 = stack.pop();
				stack.push(fac(val1));
			}
				
		} // end for
		return stack.pop();
	}

	///////////////////////////////
	/*
	 * A Method To Check If The String Is A Number Or Not
	 */
	//////////////////////////////
	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	//////////////////////////////////////////////////////////////////////////////////
	public String spaceSplitter(String s) {
		;
		StringBuilder result = new StringBuilder();
		boolean dot = false ;
		for (int i = 0; i < s.length(); ++i) {

			if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.') {
				if (s.charAt(i) == '.') { dot = true ;
					if (	!	(i > 0 && Character.isDigit(s.charAt(i - 1))) || !(i+1 <s.length() && Character.isDigit(s.charAt(i+1)) ) )
						return null;
					result.append(s.charAt(i));
					++i ;
				}
				while (i < s.length() && (Character.isDigit(s.charAt(i)) || (s.charAt(i) == '.'))) {
					if(s.charAt(i) == '.' && dot)
						return null ;
					result.append(s.charAt(i));
					++i;
				}dot = false ;
				result.append(" "); // spacing between strings
				--i; // This decrement is to prevent skipping the value when increment in for loop
			} else if (Character.isAlphabetic(s.charAt(i))) {

				/*
				 * To check if there is no operator if not then the operator is X Multiplication
				 * 
				 */
				// if (s.charAt(i) != 'X')
				if (i != 0 && s.charAt(i) != 'X'
						&& (Character.isDigit(s.charAt(i - 1)) || s.charAt(i - 1) == ')' || s.charAt(i - 1) == 'π'))
					result.append("X ");
				if (s.charAt(i) == 'e' || s.charAt(i) == 'π')
					if (s.charAt(i) == 'π' && (i + 1) < s.length()) {
						if ((s.charAt(i + 1) == '(' || Character.isDigit(s.charAt(i + 1))))
							result.append(s.charAt(i) + " X ");
						else
							result.append(s.charAt(i) + " ");
						
					} else {
						result.append(s.charAt(i) + " ");
					}
				////////////////////////////////////////
				/*
				 * LN & LOG
				 */
				/////////////////////////////////////////
				else if (s.charAt(i) == 'L') {

					result.append(s.charAt(i));
					++i;
					if (s.charAt(i) == 'N')
						result.append(s.charAt(i) + " ");

					/*
					 * LOG
					 */
					else {
						result.append(s.charAt(i));
						++i;
						result.append(s.charAt(i) + " ");

					}
					////////////////////////////////////
					/*
					 * Multiplication
					 */
					///////////////////////////////////
				} else if (s.charAt(i) == 'X') {
					result.append(s.charAt(i) + " ");
				}

				/*
				 * Sin , Cos , tan
				 */

				else {
					result.append(s.charAt(i));
					++i;
					result.append(s.charAt(i));
					++i;
					result.append(s.charAt(i) + " ");

				}

				//////////////////////////
				/*
				 * "(" OR "(-)"
				 */
				//////////////////////////
			} else if (s.charAt(i) == '(') { 

				 if(i > 0 && Character.isDigit( s.charAt(i-1))) 
					result.append("X " +s.charAt(i) + " ") ;
				
				
					else {
					result.append(s.charAt(i) + " ");
				}

			}
			
			
			else if(s.charAt(i) == ')' && (i+1 < s.length() && (Character.isDigit(s.charAt(i+1)) || s.charAt(i+1) == '(') ))
				result.append(s.charAt(i) + " X ") ;
			else if(s.charAt(i) == '-' ) {
				if(i== 0|| i>0 && (s.charAt(i-1) == 'X' || s.charAt(i-1) == '+' || s.charAt(i-1) == '%' || s.charAt(i-1) == '÷'  || s.charAt(i-1) == '-'))
					result.append(s.charAt(i)) ;
				else result.append(s.charAt(i) + " ");
					
				
			}

			/*
			 * sqrt
			 */

			else if (s.charAt(i) == '√') {

				/*
				 * To check if there is no operator if not then the operator is X Multiplication
				 * 
				 */
				///////////////////////////////////////////
				if (i > 0 && (Character.isDigit(s.charAt(i - 1)) || s.charAt(i - 1) == ')' || s.charAt(i - 1) == 'π'
						|| s.charAt(i - 1) == '.'))
					result.append("X ");

				//////////////////////////////////////////

				result.append(s.charAt(i) + " "); // √
			}
			// will be back
			else if (s.charAt(i) == '!') {
				if (i == 0
						|| (!Character.isDigit(s.charAt(i - 1)) && !(s.charAt(i - 1) == ')') && !(s.charAt(i) == 'π')))
					return null;
				result.append(s.charAt(i) + " ");
			} else
				result.append(s.charAt(i) + " ");

		}
		return result.toString().trim(); // to remove the last space
	}

	public double fac(double number) {
		double factorial = 1;
		for (int i = 1; i <= number; ++i) {
			factorial *= i;
		}
		return factorial;
	}

}