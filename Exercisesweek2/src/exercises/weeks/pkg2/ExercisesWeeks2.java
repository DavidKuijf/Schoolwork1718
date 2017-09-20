
package exercises.weeks.pkg2;
import java.util.Scanner;

public class ExercisesWeeks2 {
      public static void opdracht1(){
         String Aap = "Aap";
         String Noot = "Noot";
         String Mies = "Mies";
         int i = 0;
         System.out.println(Aap + System.lineSeparator() + Noot + System.lineSeparator() + Mies);
         System.out.print(Aap + " " + Noot + " " + Mies + System.lineSeparator());
        }
      public static void opdracht2(){
          int sum = 1+2+3+4+5+6+7+8+9+10;
          System.out.println(sum);
      }
      public static void opdracht3(){
          int four = 4;
          int twelve = 12;
          int product = four*twelve;
          int som = four+twelve;
          System.out.println("De som van 12 en 4 = "+ som);
          System.out.println("Het product van 12 en 4 = "+ product);
          
          
      }
      public static void opdracht4(){
          System.out.println("Whats the price of the desired item?");
          Scanner input = new Scanner(System.in);
          double price = input.nextDouble();
          double btw = 0.19;
          double pricebtw = price*btw;
          double total = price+pricebtw;
          System.out.println("Prijs = " + price + " Btw = " + pricebtw + " totaal = " + total);
          
          
      }
      public static void opdracht5(){
          System.out.println("Please enter 3 doubles");
          Scanner input = new Scanner(System.in);
          double one = input.nextDouble();
          double two = input.nextDouble();
          double three = input.nextDouble();
          double four = one + two + three;
          double five = four/3;
          System.out.println("These add up to "+ four);
          System.out.println("They average at "+ five);
      }
      public static void opdracht6(){
          double exchangerate = 1.1904;
          System.out.println("Enter your euro amount");
          Scanner input = new Scanner(System.in);
          double euros = input.nextDouble();
          double dollars = euros*exchangerate;
          System.out.println("If you exchange your euros righ now you should recieve "+ dollars + " dollars");
          
      }
      public static void opdracht7(){
          System.out.println("Please enter the points you could get and the points you got");
          Scanner input = new Scanner(System.in);
          double possible = input.nextDouble();       //100
          double actual = input.nextDouble();         //75
          double insufficient = possible/4;        //25
          double matters = possible - insufficient;//75
          double mattersactual = actual - insufficient;//50
          if(actual < insufficient){
                  System.out.println("your score is 1");//false
                  }
          else {
                  double deciscore = mattersactual/matters; //0.6666
                  double score = deciscore*9;              //6
                         score = score+1;
                  System.out.println("Your score is " + score);
                  
                  }
      }
      public static void opdracht8(){
          System.out.println("enter any amount of seconds");
          Scanner input = new Scanner(System.in);
          long total = input.nextLong();
          long hours = total/3600;
          long remainder = total%3600;
          long minutes = remainder/60;
          long seconds = remainder%60;
          System.out.println(hours + ":" + minutes + ":" + seconds);
      }
              
 

    public static void main(String[] args) {
        //opdracht1();
        //opdracht2();
        //opdracht3();
        //opdracht4();
        //opdracht5();
        //opdracht6();
        //opdracht7();
        //opdracht8();
        
        
   
   
    }
    
}
 