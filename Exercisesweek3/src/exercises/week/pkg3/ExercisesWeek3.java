
package exercises.week.pkg3;
import java.util.*;

public class ExercisesWeek3 {
    private static void Opdracht1(){
    System.out.println("Pick two numbers");
    Scanner input = new Scanner(System.in);
    int One = input.nextInt();
    int Two = input.nextInt();
    
    if(One>Two){
        System.out.println(One + " is bigeer than " + Two);
    }
    if(Two>One){
        System.out.println(Two + " is bigger than " + One);
    }
    else{
        System.out.println("these are equal");
    }
    
    
}
    private static void Opdracht2(){
        System.out.println("Put in a number between 1 and 4");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        switch (number) {
            case 1: System.out.println("Klaveren");
            break;
            
            case 2: System.out.println("Ruiten");
            break;
            
            case 3: System.out.println("Harten");       
            break;
            
            case 4: System.out.println("Schoppen");
            break;
            
            default : System.out.println("Foutive invoer");
            break;
        }
    }
    private static void Opdracht3(){
        System.out.println("Enter 3 numbers");
        Scanner input = new Scanner(System.in);
        int One = input.nextInt();
        int Two = input.nextInt();
        int Three = input.nextInt();
        
        if(One >Three & Two>Three){
            System.out.println("The third number is the smallest of the three.");
            
        }
        else{
            System.out.println("The third number is not the smallest of the three");
        }
    }
    private static void Opdracht4(){
        System.out.println("Voer de werkuren leeftijd en storingen pre jaar in.");
        Scanner input = new Scanner(System.in);
        int Hours = input.nextInt();
        int Age = input.nextInt();
        int Trouble = input.nextInt();
        
        if(Hours > 10000){
            System.out.println("It needs to be replaced.");
        }
        if(Age > 7){
            System.out.println("It needs to be replaced.");
        }
        if(Trouble > 25){
            System.out.println("It needs to be replaced.");
        }
        else{
            System.out.println("It does not need to replaced.");
        }
        
    }
    private static void Opdracht5(){
        System.out.println("Enter a salary.");
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double raise = salary*0.05;
        if(raise < 75){
            salary = salary+75;
        }
        else{
            salary = salary+raise;
        }
        System.out.println("New salary should be "+ salary);
        
    }
    private static void Opdracht6(){
        System.out.println("Enter all the data.");
        Scanner input = new Scanner(System.in);
        String sport  = input.next();
        int Age = input.nextInt();
        int Lenght = input.nextInt();
        double fee = 00.0;
        String voetbal = "V";
        String handbal = "H";
        
        if(sport.equals(handbal)){
            fee = 225.00;                  
        }
        if(sport.equals(voetbal)){
            fee = 175.00;
        }
        if(Age > 40){
            fee = fee-25;
        }
        if(Lenght > 10){
            fee = fee-20;
        }
        System.out.println("you have to pay "+ fee);
    }
    
    
    public static void main(String[] args) {
        //Opdracht1();
        //Opdracht2();
        //Opdracht3();
        //Opdracht4();
        //Opdracht5();
        //Opdracht6();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }   
    
}
