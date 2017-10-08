/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other.java.exercises;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davici
 * http://www.w3resource.com/java-exercises/basic/index.php
 */
public class OtherJavaExercises {
public static void Print(String inputstring){
    System.out.println(inputstring);
}
public static void exercise5(){
    System.out.println("Please type 2 numbers");
    Scanner input = new Scanner(System.in);
    int One = input.nextInt();
    int Two = input.nextInt();
    int Three = One*Two;
    System.out.println(Three);
}


public static void exercise6(){
    System.out.println("Inoput 2 whole numbers");
    Scanner input = new Scanner(System.in);
    int One = input.nextInt();
    int Two = input.nextInt();
    int sum = One + Two;
    int sum2 = One - Two;
    int product = One*Two;
    int product2 = One/Two;
    int mod = One%Two;
    
    System.out.println(sum + "\n" + sum2 + "\n" + product + "\n" + product2 + "\n" + mod);
    
}
public static void exercise7(){
    System.out.println("Put in a single number");
    Scanner input = new Scanner(System.in);
    int One = input.nextInt();
    int i = 0;
    while(i<11){
        int number = One*i;
        System.out.println(One + " times " +i+ " = " + number);
        i = i+1;
    }
}
public static void exercise11(){
    System.out.println("Input the radius of a circle");
    Scanner input = new Scanner(System.in);
    double Radius = input.nextDouble();
    double Circumference = Radius*2*Math.PI;
    double Area = Math.pow(Radius, 2);
    Area = Area*Math.PI;
    System.out.println("Circumference = " + Circumference + "\n" + "Area = "+ Area);
    
     
}
public static void exercisecalculator(){
    Print("What do you want?");
   
    Scanner input = new Scanner(System.in);
    double One = input.nextDouble();
    String Mod = input.next();
    double Two = input.nextDouble();
    System.out.println(One + " " + Mod + " " + Two);
    
    switch(Mod) {
        case "*" :
           System.out.println(One*Two);
        break;
        
        case "/" :
           System.out.println(One/Two);
        break;
        
        case "%" :
           System.out.println(One%Two);
        break;
        
        case "^" :
           System.out.println(Math.pow(One,Two));
        break;
        
        case "+" :
           System.out.println(One+Two);
        break;
        
        case "-" :
           System.out.println(One-Two);
        break;
        
        default :
            System.out.println("This does noet work stop trying!");
        break;
    }
    
    
}
public static void exercise17(){
    Print("2 bineary number");
    Scanner input = new Scanner(System.in);
    String One = input.next();
    String Two = input.next();
    int Four = Integer.parseInt(One, 2);
    int Five = Integer.parseInt(Two, 2);
    int Six = Four+Five;
    String Done = Integer.toBinaryString(Six);
    System.out.println(Done);
}
public static void exercise20(){
    Print("Number please");
    Scanner input = new Scanner(System.in);
    int Number = input.nextInt();
    String Hex = Integer.toHexString(Number);
    Print(Hex);
}
public static void exercise21(){
    Print("Gimme a number");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    String octal = Integer.toString(number,8);
    Print(octal);
}
public static void exercise31(){
    System.out.println("\nJava Version: "+System.getProperty("java.version"));
    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
    System.out.println("Java Home: "+System.getProperty("java.home"));
    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
}
public static void exercise32(){
    Print("2 numbers please");
    Scanner input = new Scanner(System.in);
    int One = input.nextInt();
    int Two = input.nextInt();
    if (One == Two){
        System.out.println(One + " == " + Two);
    }
    else{
        System.out.println(One + " != " + Two);
    }
    if (One < Two){
        System.out.println(One + " < " + Two);
    }
    if (One > Two){
        System.out.println(One + " > " + Two);
    }
    
}
public static void exercise33(){
    Print("Enter a number");
    Scanner input = new Scanner(System.in);
    int One = input.nextInt();
    int i = One;
    List<Integer> digits = new ArrayList<Integer>();
    int a = 0;
    int number = 0;
    while (i > 0) {
        digits.add(i % 10);
        i /= 10;
        
    }
    while(a < digits.size()){
        number = number + digits.get(a);
        a++;
    }
    System.out.println("Final " + number);
}
public static void test() {}





               /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //exercise5();
        //exercise6();
        //exercise7();
        //exercise11();
        //exercisecalculator();
        //exercise17();
        //exercise20();
        //exercise21();
        //exercise31();
        //exercise32();
        exercise33();
}
}
