import java.util.Scanner;  // Import the Scanner class
//Roald Niels Medendorp
//9/7/2022
//Programming with Java - Bellevue University
//Joules energy needed to heat water
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    
    //Prompt user to input amount of water.//
    System.out.println("Enter the amount of water in Kilograms.");
    double kWater = input.nextDouble();
    System.out.println("The amount of water is: " + kWater);
    
    //prompt user to input beginning temperature.//
    System.out.println("What is the beginning teperature in Celsius?");
    double bTemperature = input.nextDouble();
    System.out.println("The beginning temperature is: "     
    +bTemperature);
    
    //Prompt user to input final temperature.//
    System.out.println("What is the desired temperature in Celsius?");
    double fTemperature = input.nextDouble();
    System.out.println("The desired temperature will be: " +fTemperature);
    
  //Final calculation
    double Joules = kWater * ( fTemperature - bTemperature ) * 4184;
    System.out.println("The energy needed is: " + Joules);
  }
}
