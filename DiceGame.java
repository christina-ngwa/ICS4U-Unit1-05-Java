import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random; 
/**
* This program is a guessing game.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-02-26
*/

public class DiceGame {
  /**
  * This program checks if the user guesses the correct number from 1-6.
  */
  public static void main(String[] args) throws IOException {
    
    // variables and constants
    Random rand = new Random(); 
    int randInt = rand.nextInt(6 + 1); 
    int numOfGuesses = 0;
    int guess;
    
    // Reads user input
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Welcome to the DiceRoll game.\n");
    
    // input
    while (true) {
      System.out.print("Enter your guess (1-6): ");
      try {
        guess = Integer.parseInt(br.readLine());
        // process
        if (guess > 6 || guess < 1) {
          System.err.println("Please pick from 1-6.");
        } else {
          numOfGuesses++;
          if (guess == randInt) {
            break;
          }
        }
      } catch (NumberFormatException nfe) {
        System.err.println("Invalid input. Please try again.");
      }
    }
    // output
    System.err.println("You took " + numOfGuesses + " tries to guess the "
                       + "correct number of " + guess + ".");
  }
}