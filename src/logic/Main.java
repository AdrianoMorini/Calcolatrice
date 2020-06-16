package logic;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	
	Label label;
	
	Button zero;
	Button uno;
	Button due;
	Button tre;
	Button quattro;
	Button cinque;
	Button sei;
	Button sette;
	Button otto;
	Button nove;
	Button ce;
	Button comma;
	Button add;
	Button sub;
	Button mol;
	Button div;
	Button equal;
	
	String firstNum = new String("0");
	String secondNum = new String();
	Boolean f = false;
	Boolean s = false;
	Boolean v = false;
	String op = new String();
	Double solution = new Double(0.0);
	
	@Override
	public void start(Stage primaryStage) {
			
		GridPane root = new GridPane();
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		
		label = new Label("0");
		uno = new Button("1");
		due = new Button("2");
		tre = new Button("3");
		quattro = new Button("4");
		cinque = new Button("5");
		sei = new Button("6");
		sette = new Button("7");
		otto = new Button("8");
		nove = new Button("9");
		zero = new Button("0");
		ce = new Button("CE");
		mol = new Button("x");
		div = new Button(":");
		add = new Button("+");
		sub = new Button("-");
		comma = new Button(".");
		equal = new Button("=");
		label.setText("0");
		label.setStyle("-fx-font-size: 20pt;");
		uno.setStyle("-fx-font-size: 20pt;");
		due.setStyle("-fx-font-size: 20pt;");
		tre.setStyle("-fx-font-size: 20pt;");
		quattro.setStyle("-fx-font-size: 20pt;");
		cinque.setStyle("-fx-font-size: 20pt;");
		sei.setStyle("-fx-font-size: 20pt;");
		sette.setStyle("-fx-font-size: 20pt;");
		otto.setStyle("-fx-font-size: 20pt;");
		nove.setStyle("-fx-font-size: 20pt;");
		zero.setStyle("-fx-font-size: 20pt;");
		ce.setStyle("-fx-font-size: 20pt;");
		add.setStyle("-fx-font-size: 20pt;");
		sub.setStyle("-fx-font-size: 20pt;");
		div.setStyle("-fx-font-size: 20pt;");
		mol.setStyle("-fx-font-size: 20pt;");
		equal.setStyle("-fx-font-size: 20pt;");
		comma.setStyle("-fx-font-size: 20pt;");
		
		root.setPadding(new Insets(20));
		root.setHgap(9);
	    root.setVgap(9);
	
		uno.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String one = "1";
				if (f) {
					secondNum = secondNum + one;
					label.setText(secondNum);
				} else {
					label.setText("");
					firstNum = firstNum + one;
					label.setText(firstNum);
			    }
				
			}
		});
		
		due.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String two = "2";
				if (f) {
					secondNum = secondNum + two;
					label.setText(secondNum);
				} else {
					label.setText("");
					firstNum = firstNum + two;
					label.setText(firstNum);
			    }
				
			}
		});

		tre.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				String three = "3";
				if (f) {
					secondNum = secondNum + three;
					label.setText(secondNum);
				} else {
					label.setText("");
					firstNum = firstNum + three;
					label.setText(firstNum);
			    }
		
			}
		});

		quattro.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				String four = "4";
				if (f) {
					secondNum = secondNum + four;
					label.setText(secondNum);
				} else {
					label.setText("");
					firstNum = firstNum + four;
					label.setText(firstNum);
			    }
				
			}
		});

		cinque.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				String five = "5";
				if (f) {
					secondNum = secondNum + five;
					label.setText(secondNum);
				} else {
					label.setText("");
					firstNum = firstNum + five;
					label.setText(firstNum);
			    }
		
			}
		});

		sei.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				String six = "6";
				if (f) {
					secondNum = secondNum + six;
					label.setText(secondNum);
				} else {
					label.setText("");
					firstNum = firstNum + six;
					label.setText(firstNum);
			    }
		
			}
		});

		sette.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				String seven = "7";
				if (f) {
					secondNum = secondNum + seven;
					label.setText(secondNum);
				} else {
					label.setText("");
					firstNum = firstNum + seven;
					label.setText(firstNum);
			    }
		
			}
		});

		otto.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				String eight = "8";
				if (f) {
					secondNum = secondNum + eight;
					label.setText(secondNum);
				} else {
					label.setText("");
					firstNum = firstNum + eight;
					label.setText(firstNum);
			    }
		
			}
		});

		nove.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				String nine = "9";
				if (f) {
					secondNum = secondNum + nine;
					label.setText(secondNum);
				} else {
					label.setText("");
					firstNum = firstNum + nine;
					label.setText(firstNum);
			    }
		
			}
		});

		zero.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				String ziro = "0";
				if (f) {
					secondNum = secondNum + ziro;
					label.setText(secondNum);
				} else {
					firstNum = firstNum + ziro;
					label.setText(firstNum);
			    }
				
			}
		});

		add.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				if (!f && !firstNum.equals("")) {
					op = "addizione";
					f = true;
					s = true;
					v = false;
					label.setText("");
				} else {
					//do nothing
				}
		
			}
		});

		sub.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
				if (!f && !firstNum.equals("")) {
					op = "sottrazione";
					f = true;
					s = true;
					v = false;
					label.setText("");
				} else {
					//do nothing
				}
		
			}
		});

		mol.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if (!f && !firstNum.equals("")) {
					op = "moltiplicazione";
					f = true;
					s = true;
					v = false;
					label.setText("");
				} else {
					//do nothing
				}
				
			}
		});

		div.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if (!f && !firstNum.equals("")) {
					op = "divisione";
					f = true;
					s = true;
					v = false;
					label.setText("");
				} else {
					//do nothing
				}
				
			}
		});
		
		comma.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String vir = ".";
					if (f) {
						if (!v && !secondNum.equals("")) {
							secondNum = secondNum + vir;
							label.setText(secondNum);
							v = true;
						} else {
							//do nothing
						}
					} else {
						if (!v && !firstNum.equals("")) {
							firstNum = firstNum + vir;
							label.setText(firstNum);
							v = true;
						} else {
							//do nothing
						}
					}
				
			}
		});

		ce.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				label.setText("");
				f = false;
				s = false;
				v = false;
				firstNum = "";
				secondNum = "";
				
			}
		});
		
		equal.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if (f && s && !firstNum.equals("") && !secondNum.equals("")) {
					switch (op) {
					case "addizione":
						solution = Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
						label.setText(solution.toString());
						f = false;
						s = true;
						v = false;
						firstNum = "";
						secondNum = "";
						break;
					case "sottrazione":
						solution = Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
						label.setText(solution.toString());
						f = false;
						s = true;
						v = false;
						firstNum = "";
						secondNum = "";
						break;
					case "moltiplicazione":
						solution = Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
						label.setText(solution.toString());
						f = false;
						s = true;
						v = false;
						firstNum = "";
						secondNum = "";
						break;
					case "divisione":
						solution = Double.parseDouble(firstNum) / Double.parseDouble(secondNum);
						label.setText(solution.toString());
						f = false;
						s = true;
						v = false;
						firstNum = "";
						secondNum = "";
						break;
					default:
						break;
					}
				} else {
					//do nothing
				}
				
			}
		});
		
	
				
		
		
		
		
		
		root.add(label, 0, 0, 4, 1);
		root.addRow(1, nove, otto, sette, ce);
		root.addRow(2, sei, cinque, quattro, add, sub);
		root.addRow(3, tre, due, uno, mol, div);
		root.addRow(4, zero, comma);
		root.add(equal,2,5,4,1);
		
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
