// Roald Niels Medendorp
// Module 8
// 10-18-2022 Bellevue University
// Week 8 Assignment
public class Main 
// Creating method with no parameter with introduction message
{
  static void yearlyService(String fname) {
    System.out.println("Welcome to our car service!\n" + fname);
  }
  // Creating method with one parameter
  static void yearlyService(String fname, int oilFee) {
    System.out.println(fname + " + oil change fee adds $"+ oilFee);
  }
  // Creating method with two parameters
  static void yearlyService(String fname, int oilFee, int tireChange) {
    System.out.println(fname + " + oil change fee adds $"+ oilFee + " + tire rotation adds $"+ tireChange);
  }
  // Creating method with three parameters
  static void yearlyService(String fname, int oilFee, int tireChange, int couPon) {
    System.out.println(fname + " + oil change fee adds $"+ oilFee + " + tire rotation adds $"+ tireChange + " and added discount $" +couPon + " cheaper!");
  }
  // Methods with different parameter values
  public static void main(String[] args) {
    yearlyService("Regular service is $35");
    yearlyService("Regular service", 40);
    yearlyService("Regular service", 40, 20);
    yearlyService("Regular service", 40, 20 ,15);
  }
}