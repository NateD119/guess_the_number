/*The purpose of this program is to have the user guess the number
through a random number generator( 1-100). As the user guesses, the output 
will tell the user if they are correct, too high or too low.
It will also show the number of guesses it took to guess the 
correct number
*/
package guessthenumber;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        
        
      
 
        
        Scanner input = new Scanner(System.in);
        int counter = 0;
        
       
        int answer;
        int guess;
        
        Random random = new Random();
        
        answer = random.nextInt(100)+1;
        boolean correct = false;
        
        
        
        while(!correct){
            System.out.println("Hi Friend! Guess a number between 1 and 100!");
            guess = input.nextInt();
            counter++;
           
            
            if(guess >= 1 && guess <= 100){
                if(guess > answer){
                    System.out.println("You guessed too high. Guess again!");
                    System.out.println("");
                    }
                else if(guess < answer){
                 System.out.println("You guessed too low! Guess again!");
                 System.out.println("");
            
                    }
                else if(guess == answer){
                  System.out.println("You guess correctly! You completed the game"
                       + " in " + counter + " turn(s)!");
                  correct = true;
               
                }
                else{
                System.out.println("Please enter a number 1-100");
                }
        }
        }//end while
        
        
        
        
    }//end main
    
}
