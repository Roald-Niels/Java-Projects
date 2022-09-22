//Roald Niels Medendorp
//Substring or not
//09-20-2022
//Bellevue University - CSD 320

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
      
        //User enters first string
        System.out.print("Enter string s1: ");
        String s1 = in.nextLine();
      
        //User enters second string
        System.out.print("Enter string s2: ");
        String s2 = in.nextLine();
      
        //Programs checks if string 1 is a substring of string 2  
 
        if (s2.indexOf(s1) != -1) {
          System.out.printf("%s is a substring of %s%n", s1, s2);
        }
        else{
            System.out.printf("%s is not a substring of %s%n", s1, s2);
      }
       //Program checks if string 2 is a substring of string 1

            if (s1.indexOf(s2) != -1) {
            System.out.printf("%s is a substring of %s%n", s2, s1);
        }
        else{
            System.out.printf("%s is not a substring of %s%n", s2, s1);
        }
    }
}
