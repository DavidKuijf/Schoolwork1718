import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static void Opdracht1en2(){
		int[] arrayone = new int[500];
		int[] arraytwo = new int[500];
		int[] arraythree = new int[500];
		int som1 = 0; 
		int som2 = 0; 
		int som3 = 0;
		
		for(int i = 0 ; i < 500; i++) {
			arrayone[i] = i;
			arraytwo[i]	= i+1;
			arraythree[i] = 500-i;
		}
		System.out.println("arrayone:");
		for(int i =0 ; i < 500; i++) {
			System.out.println(arrayone[i]);
			som1 = som1 + arrayone[i];
		}
		System.out.println("de som is: " + som1);
		
		System.out.println("arraytwo:");
		for(int i =0 ; i < 500; i++) {
			System.out.println(arraytwo[i]);
			som2 = som2 + arraytwo[i];
		}
		System.out.println("de some is: " + som2);
		
		System.out.println("arrayone:");
		for(int i =0 ; i < 500; i++) {
			System.out.println(arraythree[i]);
			som3 = som3 + arraythree[i];
		}
		System.out.println("de some is: " + som3);
	}

	static void deadswitch(int mistakes) {
		switch(mistakes) {
		case 1:{
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		}
		case 2:{
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("----");
			break;
		}
		case 3:{
			System.out.println("---------");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("----");
			break;
			
		}
		case 4:{
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("----");
			break;
		}
		case 5:{
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|	o");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("----");
			break;
		}
		case 6:{
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|      \\o");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("----");
			break;
		}
		case 7:{
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|      \\o/");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("----");
			break;
		}
		case 8:{
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|      \\o/");
			System.out.println("|	O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("----");
			break;
		}
		case 9:{
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|      \\o/");
			System.out.println("|	O");
			System.out.println("|      /");
			System.out.println("|");
			System.out.println("----");
			break;
		}
		case 10:{
			System.out.println("---------");
			System.out.println("|	|");
			System.out.println("|      \\o/");
			System.out.println("|	O");
			System.out.println("|      / \\");
			System.out.println("|");
			System.out.println("----");
			System.out.println("you died");
			break;
		}
		}
    	
	}
	static void Galgje() {
		Scanner input = new Scanner(System.in);
		char[] mysteryarray = {'a','p','e','n','k','o','p'};
		char[] guessedarray= {'.','.','.','.','.','.','.'};
		int mistakes = 0;
		boolean won = false;
		boolean lost = false;
		
		while(won == false && lost == false) {
			int hits = 0;
			int misses = 0;
			int wonyet = 0;
			System.out.println("Please enter a single character");
			char inputchar = (char)input.nextLine().charAt(0);
			for(int i = 0; i < mysteryarray.length; i++) {
				if(inputchar == mysteryarray[i]) {
					guessedarray[i] = mysteryarray[i];
					hits++;
				}
				else {
					misses++;
				}
			}
			if (misses >= mysteryarray.length) {
				mistakes++;
				deadswitch(mistakes);
			}
			for(int i = 0; i < mysteryarray.length; i++) {
				if (guessedarray[i] == '.') {
					wonyet++;
				}
			}
			if(wonyet == 0) {
				won = true;
				System.out.println("you win");
			}
			if(mistakes >= 10) {
				lost = true;
				System.out.println("you die");
			}
			
			String answer = new String(guessedarray);
			System.out.println(answer);	
		}
	
		}
	static void Opdracht10() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of your matrix");
		int matrixsize = input.nextInt();
		int current = 0;
		int[][] array = new int[matrixsize][matrixsize];
		
		for (int i = 0; i < matrixsize; i++) {
			for(int a = 0; a <matrixsize; a++) {
				current++;
				array[i][a]=current;
			}
		}
		
		for (int i = 0 ; i < array.length; i++) {
			System.out.print("\n");
			for (int a = 0; a < array.length; a++) {
				System.out.print(array[i][a]+",\t");
			}
			System.out.println("");
		}
		
		for (int i = 0 ; i < array.length; i++) {
			System.out.print("\n");
			for (int a = 0; a < array.length; a++) {
				System.out.print(array[a][i]+",\t");
			}
			System.out.println("");
		}
		
		//System.out.println("\n"+Arrays.deepToString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Opdracht1en2();
		Galgje();
		//Opdracht10();
	}

}
