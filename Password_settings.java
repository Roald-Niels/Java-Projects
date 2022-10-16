import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final int Num_upper_letters = 1;
    final int Num_lower_letters = 6;
    final int Num_digits = 1;
    int upperCount = 0;
    int lowerCount = 0;
    int digitCount = 0;
    int letterCount =0;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your password, make sure you have the following: atleast 1 lower and upercase letter, a digit and contain 8 characters: ");
    String input = in.nextLine();
    int inputLen = input.length();
    //character
    for (int i=0;i<inputLen;i++)
    {
      char ch = input.charAt(i);
      if(Character.isUpperCase(ch));
        upperCount++;
      if (Character.isLowerCase(ch));
        lowerCount++;
      if (Character.isDigit(ch));
        digitCount++;
      }
    if(upperCount >= Num_upper_letters && lowerCount >= Num_lower_letters && digitCount >= Num_digits)
      System.out.println("Valid password");
    else {
      System.out.println("The password does not have the following: ");
      if(upperCount < Num_upper_letters)
        System.out.println("uppercase letters");
      if(lowerCount < Num_lower_letters)
        System.out.println("Not enough lowercase letters");
      if(digitCount < Num_digits)
        System.out.println("digits");
   }
  }
}