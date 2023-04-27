import java.util.Scanner;

public class GuessingGame {
     public static void main(String[] args) {
          int secretNumber = (int)(Math.random() * 101); // select a random number from 1 to 100
          Scanner scanner = new Scanner(System.in); // create a Scanner object for input
          
          System.out.println("Guess the correct number!"); // print a message to start the game
          
          while (true) {
               System.out.print("Guess: "); // prompt the user to enter their guess
               int guess = scanner.nextInt(); // read the user's guess from input
               
               if (guess == secretNumber) {
                    System.out.println("Congratulations! You win!"); // show congratulations message
                    break; // exit the loop once a correct guess has been made
              } else if (guess < secretNumber) {
                    System.out.println("Try again, your guess was lower than the correct number."); // show incorrect message
              } else {
                    System.out.println("Try again, your guess was higher than the correct number."); // show incorrect message
              }
         }
      }
}