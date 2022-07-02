/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vowel;

import java.util.Scanner;

/**
 *
 * @author ksemenov0
 */
public class Vowel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a letter: ");
    
        char letter;   
      
     while(input.hasNext())
      {
           letter = input.next(".").charAt(0);
           
          if(Character.isLetter(letter))
           { 
              if(Character.toLowerCase(letter) == 'a'|| Character.toLowerCase(letter) == 'e'|| Character.toLowerCase(letter) =='i'||Character.toLowerCase(letter) =='o'||Character.toLowerCase(letter) =='u')
               {
                   System.out.println( letter +" is a vowel");
               }
              else
               System.out.println( letter+" is a consonant");
           }
          else
          System.out.println(letter+ " is an invalid input");
               
           
           
           
           
           
      }
          
        
         
    }
}


