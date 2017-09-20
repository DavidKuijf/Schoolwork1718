/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author davici
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello,World.");
        System.out.println("How are you?");
        //This is a comment System.out.println("fuck this line");
        
        System.out.println("this is code duplication");
        System.out.println("this is code duplication");
        String FirstName;
        String LastName;
        int hour, minute;
        hour = 11;
        minute = 59;
        FirstName = "David";
        LastName = "Kuijf";
        
        System.out.println(FirstName + " " + LastName);
        System.out.println(System.currentTimeMillis());
        System.out.println(new java.util.Date());
        Scanner lezer = new Scanner(System.in);
        System.out.println("input name please?");
        String name = lezer.next();
        System.out.println("hallo: " + name);
        
                
                
        
    }
    
}
