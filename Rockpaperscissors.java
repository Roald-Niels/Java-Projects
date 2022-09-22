//Roald Niels Medendorp
//Rock,Paper,Scissor Assignment
//09-15-2022
//Bellevue University - CSD 320

import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  //Creating Value rock, paper and scissors
  String[] rps = {"rock", "paper", "scissors"};
  //Creating random computer move.
  String computerMove = rps[new Random().nextInt(rps.length)];
  Scanner scanner = new Scanner(System.in);
  //Player move outside of while true block.
  String playerMove;
  //While true to make sure answers are valid or not.
  while(true) {
    System.out.println("Please enter your move: rock, paper or scissors");
    playerMove = scanner.nextLine();
    if(playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) break;
    //Response to a invalid move.
    System.out.println(playerMove + " Not a valid move");
  }
    //Computer respose to player.
    System.out.println("The computer played: " + computerMove);
    
  //Creating a response to a tie.
if (playerMove.equals(computerMove)){
  System.out.println("The game was a tie!");
}
  //Win or lose condition based on "rock" answer.
 else if (playerMove.equals("rock")) {
   if (computerMove.equals("paper")) {
     System.out.println("You lost!");
 }  else if (computerMove.equals("scissors")) {
     System.out.println("You win!");
  }}
   //Win or lose condition based on "paper" answer.
  else if (playerMove.equals("paper")) {
   if (computerMove.equals("scissors")) {
     System.out.println("You lost!");}
 }  else if (computerMove.equals("rock")) {
     System.out.println("You win!");
  }
    //Win or lose condition based on "scissors" answer.
  else if (playerMove.equals("scissors")) {
   if (computerMove.equals("rock")) {
     System.out.println("You lost!");}
 }  else if (computerMove.equals("paper")) {
     System.out.println("You win!");}
   }
  }