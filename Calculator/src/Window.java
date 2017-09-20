import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextPane;




public class Window extends JFrame
					implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextPane display = new JTextPane();

	
	 public  void initialize() {
		JFrame Calculatorwindow = new JFrame("Calculator");
	    //JFrame.setUndecorated(true);
		Calculatorwindow.setResizable(false);
		Calculatorwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextPane display = new JTextPane();
		Calculatorwindow.setLayout(new GridLayout(4,3));
		
		Button button1 = new Button("1");
		Button button2 = new Button("2");
		Button button3 = new Button("3");
		Button button4 = new Button("4");
		Button button5 = new Button("5");
		Button button6 = new Button("6");
		Button button7 = new Button("7");
		Button button8 = new Button("8");
		Button button9 = new Button("9");
		Button button0 = new Button("0");
		Button buttonEnter = new Button("Enter");
		Button buttonClear = new Button("Clear");
		//Button button0 = new Button("0");
		Calculatorwindow.add(button1);
		Calculatorwindow.add(button2);
		Calculatorwindow.add(button3);
		Calculatorwindow.add(button4);
		Calculatorwindow.add(button5);
		Calculatorwindow.add(button6);
		Calculatorwindow.add(button7);
		Calculatorwindow.add(button8);
		Calculatorwindow.add(button9);
		Calculatorwindow.add(button0);
		Calculatorwindow.add(buttonEnter);
		Calculatorwindow.add(buttonClear);
		Calculatorwindow.add(display);
		
		button1.addActionListener(this);
		
		//button1.addActionListener();
		
		Calculatorwindow.pack();
		Calculatorwindow.setVisible(true);
	}
	 public void actionPerformed(ActionEvent e) {
		 display.setText("aids");
		 
	 }
	}

