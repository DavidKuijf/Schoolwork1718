import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;


public class Panel extends JFrame {
	
	private void result() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane = new JTextPane();
		getContentPane().add(textPane, BorderLayout.CENTER);

	}

	private JPanel contentPane;
	private String globalstring = "";
	private double firstnumber = 0;
	private double secondnumber = 0;
	private String operator = "";
	
	double solution(double numberone, double numbertwo, String modifier) {
		double ans = 0;
		switch(modifier){
			case "+":
				ans = numberone + numbertwo;
				break;
			case "-":
				ans = numberone - numbertwo;
				break;
			case "*":
				ans = numberone * numbertwo;
				break;
			case "/":
				ans = numberone / numbertwo;
				break;
			case "^":
				ans = Math.pow(numberone,numbertwo);
				break;
			case "\u221A":
				ans = Math.sqrt(numbertwo);
				break;
				
		}
		return ans;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel frame = new Panel();
					frame.setVisible(true);
					result frame2 = new result();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 5, 664, 115);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTextArea txt = new JTextArea();
		txt.setEditable(false);
		panel_1.add(txt);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 120, 401, 358);
		contentPane.add(panel);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				globalstring += "1";
				txt.setText(globalstring);
			}
		});
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		panel.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				globalstring += "2";
				txt.setText(globalstring);
			}
		});
		panel.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += "3";
				txt.setText(globalstring);
			}
		});
		panel.add(button3);
		
		JButton buttonplus = new JButton("+");
		buttonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += " + ";
				txt.setText(globalstring);
			}
		});
		panel.add(buttonplus);
		
		JButton buttonpow = new JButton("^");
		buttonpow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += " ^ ";
				txt.setText(globalstring);
			}
		});
		panel.add(buttonpow);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += "4";
				txt.setText(globalstring);
			}
		});
		panel.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += "5";
				txt.setText(globalstring);
			}
		});
		panel.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += "6";
				txt.setText(globalstring);
			}
		});
		panel.add(button6);
		
		JButton buttonminus = new JButton("-");
		buttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += " - ";
				txt.setText(globalstring);
			}
		});
		panel.add(buttonminus);
		
		JButton buttonsqrt = new JButton("\u221A");
		buttonsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += " \\u221A ";
				txt.setText(globalstring);
			}
		});
		panel.add(buttonsqrt);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += "7";
				txt.setText(globalstring);
			}
		});
		panel.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += "8";
				txt.setText(globalstring);
			}
		});
		panel.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += "9";
				txt.setText(globalstring);
			}
		});
		panel.add(button9);
		
		JButton buttonmulti = new JButton("*");
		buttonmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += " * ";
				txt.setText(globalstring);
			}
		});
		panel.add(buttonmulti);
		
		JButton buttondivide = new JButton("/");
		buttondivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += " / ";
				txt.setText(globalstring);
			}
		});
		panel.add(buttondivide);
		
		JButton buttonclear = new JButton("clear");
		buttonclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring = "";
				txt.setText(globalstring);
			}
		});
		panel.add(buttonclear);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += "0";
				txt.setText(globalstring);
			}
		});
		panel.add(button0);
		
		JButton buttonenter = new JButton("enter");
		buttonenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring = txt.getText();
				Scanner input = new Scanner(globalstring);
				firstnumber = input.nextDouble();
				operator = input.next();
				secondnumber = input.nextDouble();
				double ans = solution(firstnumber,secondnumber,operator);
				txt.setText(Double.toString(ans));					
				
			}
		});
		panel.add(buttonenter);
		
		JButton buttonempty = new JButton("empty");
		panel.add(buttonempty);
		
		JButton buttonperiod = new JButton(".");
		buttonperiod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				globalstring += ".";
				txt.setText(globalstring);
			}
		});
		panel.add(buttonperiod);
	}
}
