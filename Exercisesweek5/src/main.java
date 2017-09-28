import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);
	static Scanner input2 = new Scanner(System.in);
	static void Exercise1() {
		System.out.println("Enter a name.");
		String nameVar = input.next();
		int i = 0;
		while(i < 5) {
			System.out.println(nameVar);
			i++;
		}
	}
	static void Exercise2() {
		boolean test = false;
		System.out.println("aids");
		while(test == false){
			System.out.println("Type a word");
			String in = input.next();
			if (in.equals("kip")) {
				System.out.println("zonder kop!");
				test = true;
			}
		}
	}
	static void Exercise3() {
		System.out.println("Enter new age");
		int in = input.nextInt();
		for (int i = 0 ; i < in ; i++) {
			System.out.println("Hoera!");
			
		}
	
	}
	static void Exercise4() {
		System.out.println("Enter x");
		double x = input.nextDouble();
		for (int i = 0; i <= 100; i++) {
			double result = x*i;
			System.out.println(i + " * " + x + " = " + result );
		}
	}
	static void Exercise5() {
		boolean test = false;
		System.out.println("Enter a whole number");
		int compare = input.nextInt() ;
		int number1 = 0;
		while(test == false) {
			System.out.println("Enter a whole number");
			number1 = input2.nextInt();
		
			if (number1 == compare) {
				System.out.println("Jippie!");
				test = true;
			}
			else {
				compare = number1;
			}
		}
	}
	static void Exercise6() {
		double number = 1;
		double counter = 0;
		double total = 0;
		
		while (number != 0) {
			System.out.println("Enter a number");
			number = input.nextDouble();
			total = total + number;
			if (number != 0) {
			counter++;
			}
		}
		double result = total/counter;
		System.out.println(result);
	}
	static void Exercise7() {
		String letter = "";
		while (letter.equals("z") == false) {
			System.out.println("\nenter a letter");
			letter = input.next();
			for(int i = 0; i <= 5; i++) {
				System.out.print(letter);
				
			}
		}
		System.out.println("\nDone!");
	}
	static void Exercise8()	{
		for(int i=1; i <= 10; i++ ) {
			for(int x=1; x <= 10; x++) {
				System.out.println(i + " * " + x + " = " + (i*x));
			}
			System.out.println();
		}
	}
	static void Exercise9()	{
		System.out.println("enter the size");
		int size = input.nextInt();
		String printable = "";
		for(int i=0; i<=size;i++) {
			printable = printable + "*";
			System.out.println(printable);
		}
	}
	static void Exercise10() {
		System.out.println("enter the size");
		int size = input.nextInt();
		String printable = "";
		for(int i=0; i<=size ; i++){
			while (printable.length() <= i) {
				printable = printable + "*";
			}
			while (printable.length() <= size) {
				printable = printable + " ";
			}
			String reverse = new StringBuffer(printable).reverse().toString();
			System.out.println(reverse);
			printable = "";
		}
	}
	static void Exercise11() {
		System.out.println("enter the size");	//ask the user for input
		int size = input.nextInt();				//wait for and receive input
		String printable = "";					//ready the String
		int counter = 0;						//set the + or * counter to 0
		
		for(int i=0; i<=size ; i++){			//for loop that creates the first half
			while (printable.length() <= i) {	//while the string is shorter than the current level is supposed to be do this
				if (counter%2==0){				//check whether to use + or *
					printable = printable + "*";
				}
				else {
					printable = printable + "+";
				}
				
			}
			while (printable.length() <= size) {//while the string isn't large enough add spaces
				printable = printable + " ";
			}
			counter ++;							//set the + or * counter one higher
			
			String reverse = new StringBuffer(printable).reverse().toString();	// reverse the current line
			System.out.println(reverse);
			printable = "";						// print the current line
		}
		
		for(int i=size; i >= 0; i--){			//for loop that creates the second half
			while (printable.length() <= i) {	//while the string is shorter than the current level is supposed to be do this
				if (counter%2==0){				//check whether to use + or *
					printable = printable + "*";
				}
				else {
					printable = printable + "+";
				}
			}
			while (printable.length() <= size) {//while the string isn't large enough add spaces
				printable = printable + " ";
			}
			counter ++;							//set the + or * counter one higher
			String reverse = new StringBuffer(printable).reverse().toString(); // reverse the current line
			System.out.println(reverse);
			printable = "";					// print the current line
		}
		
		
	}
	public static void main(String[] args){
		//Exercise1();
		//Exercise2();
		//Exercise3();
		//Exercise4();
		//Exercise5();
		//Exercise6();
		//Exercise7();
		//Exercise8();
		//Exercise9();
		//Exercise10();
		//Exercise11();
		// TODO Auto-generated method stub

	}

}
