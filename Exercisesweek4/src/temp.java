import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.math.*;
import javax.swing.JTabbedPane;

public class temp extends JFrame {
	void exercise1() {
		System.out.println("Ik ben een methode");
	}
	void exercise2(String message) {
		System.out.println("Dit is de boodschap: "+ message);
	}
	int exercise3(int one,int two) {
		int three = one+two;
		return three;
	}
	boolean exercise4(int value) {
		if (value>10) {return true;}
		else {return false;}
	}
	double convert(String opt1,String opt2,double input) {
		if(opt1.equals(opt2)) {return input;}
		switch (opt1) {
			case "Celsius":
				switch (opt2) {
				case "Celsius":
				return input;
				//break;
				
				case "Fahrenheit":
				return input*9/5+32;
				//break;
				
				case "Kelvin":
				return input+273;
				//break;
				}
			break;
			case "Fahrenheit":
				switch (opt2) {
				case "Fahrenheit":
				return input;
				//break;
				
				case "Celsius":
				return (input-32)/(9/5);
				//break;
				
				case "Kelvin":
				return (input+459.67)* 5/9;
				//break;
				}
			break;
			case "Kelvin":
				switch (opt2) {
				case "Kelvin":
				return input;
				//break;
				
				case "Celsius":
				return input-273;
				//break;
				
				case "Fahrenheit":
				return input * 9/5 - 459.67;
				//break;
			}
			default: 
			return input;
			//break;
			
		}
		return input;
		}
		
		
	
	private JPanel contentPane;
	String[] optionlist= {"Celsius","Kelvin","Fahrenheit"};
	String[] genderlist= {"Male","Female"};
	private JTextField textFieldweight;
	private JTextField textFieldBMI;
	private JTextField textFieldLenght;
	private JTextField textFieldrec;
		public temp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOpdracht1 = new JButton("Opdracht 1");
		btnOpdracht1.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		btnOpdracht1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exercise1();
			}
		});
		
		btnOpdracht1.setBounds(10, 11, 89, 23);
		contentPane.add(btnOpdracht1);
		
		JButton btnOpdracht2 = new JButton("Opdracht 2");
		btnOpdracht2.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		btnOpdracht2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exercise2("done");
			}
		});
		
		btnOpdracht2.setBounds(109, 11, 89, 23);
		contentPane.add(btnOpdracht2);
		
		JButton btnOpdracht3 = new JButton("Opdracht 3");
		btnOpdracht3.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		btnOpdracht3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(exercise3(10,23));
			}
		});
		btnOpdracht3.setBounds(208, 11, 89, 23);
		contentPane.add(btnOpdracht3);
		
		JButton btnOpdracht4 = new JButton("Opdracht 4");
		btnOpdracht4.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		btnOpdracht4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(exercise4(11));
			}
		});
		btnOpdracht4.setBounds(307, 11, 89, 23);
		contentPane.add(btnOpdracht4);
		
		JComboBox comboBox1 = new JComboBox(optionlist);
		comboBox1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		comboBox1.setBounds(10, 45, 89, 20);
		contentPane.add(comboBox1);
		comboBox1.setSelectedIndex(0);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		lblTo.setBounds(145, 48, 19, 14);
		contentPane.add(lblTo);
		
		
		JComboBox comboBox2 = new JComboBox(optionlist);
		comboBox2.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		comboBox2.setBounds(208, 45, 89, 20);
		contentPane.add(comboBox2);
		comboBox2.setSelectedIndex(0);
		
		JTextPane Solution = new JTextPane();
		Solution.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		Solution.setBounds(307, 45, 89, 54);
		contentPane.add(Solution);
		
		JButton btnConvert = new JButton("CONVERT!");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fuck = Double.parseDouble(Solution.getText());
				String str_one = comboBox1.getSelectedItem().toString();
				String str_two = comboBox2.getSelectedItem().toString();
				double answer = convert(str_one,str_two,fuck);
				Solution.setText(String.valueOf(answer));
;

				
			}
			
		});
		btnConvert.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
		btnConvert.setBounds(10, 76, 89, 23);
		contentPane.add(btnConvert);
		
		JComboBox comboBoxmf = new JComboBox(genderlist);
		comboBoxmf.setBounds(10, 110, 89, 20);
		contentPane.add(comboBoxmf);
		
		textFieldweight = new JTextField();
		textFieldweight.setBounds(112, 110, 86, 20);
		contentPane.add(textFieldweight);
		textFieldweight.setColumns(10);
		
		textFieldBMI = new JTextField();
		textFieldBMI.setEditable(false);
		textFieldBMI.setBounds(211, 110, 213, 20);
		contentPane.add(textFieldBMI);
		textFieldBMI.setColumns(10);
		
		textFieldLenght = new JTextField();
		textFieldLenght.setBounds(112, 161, 86, 20);
		contentPane.add(textFieldLenght);
		textFieldLenght.setColumns(10);
		
		JButton btnBmi = new JButton("BMI");
		btnBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double v_weight = Double.parseDouble(textFieldweight.getText());
				double v_lenght = Double.parseDouble(textFieldLenght.getText());
				double BMI = v_weight/(Math.pow(2,v_lenght));
				textFieldBMI.setText(String.valueOf(BMI));
				String str_one = comboBoxmf.getSelectedItem().toString();
				if(str_one.equals("Male")) {textFieldrec.setText("20-25");}
				if(str_one.equals("Female")) {textFieldrec.setText("19-24");}
				
				
			}
		});
		btnBmi.setBounds(10, 141, 89, 23);
		contentPane.add(btnBmi);
		
		textFieldrec = new JTextField();
		textFieldrec.setEditable(false);
		textFieldrec.setBounds(221, 141, 70, 20);
		contentPane.add(textFieldrec);
		textFieldrec.setColumns(10);
		
		JLabel lblWeight = new JLabel("weight");
		lblWeight.setBounds(118, 95, 46, 14);
		contentPane.add(lblWeight);
		
		JLabel lblLenght = new JLabel("lenght");
		lblLenght.setBounds(118, 145, 46, 14);
		contentPane.add(lblLenght);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(221, 95, 46, 14);
		contentPane.add(lblBmi);
		
		JLabel lblRecBmi = new JLabel("Rec BMI");
		lblRecBmi.setBounds(231, 164, 46, 14);
		contentPane.add(lblRecBmi);
	}
}
