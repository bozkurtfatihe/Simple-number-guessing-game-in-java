/**
 * A simple number guessing game. Reach 10 points to win.
 *
 * @author Fatih Emre Bozkurt
 * @version 1.0
 */
import java.util.Scanner;
//imports scanner
public class özelp_01 {
    public static void main(String[] args) throws InterruptedException {
        //number gessing game
        Scanner sc = new Scanner(System.in);
        //creates scanner
        int numberOfAttemps = 5;
        //sets number of attemps
        int point = 0;
        System.out.println("A number is chosen between 1 - 100. Reach 10 points to win!");
        Thread.sleep(1000);
        System.out.println("You have " + numberOfAttemps + " attemps.");
        Thread.sleep(1000);
        while (true) {
        //makes it so that this happens indefinetly since there is no way to set it to false
            double number = (int) (Math.random()*100+1);
            Thread.sleep(1000);
            //sets the correctness to false            
            for (int i=0; i<numberOfAttemps;){
                //checks if i is less than numberOfAttemps and restarts forom here if not
                System.out.print("Enter guess: ");
                int guess = sc.nextInt();
                //imputs guess
                if (guess == number){;
                //checks if guess is correct
                    System.out.println("Guess is correct!");
                    point = point + numberOfAttemps-i;
                    Thread.sleep(1000);
                    System.out.printf("You earned %d points\n",numberOfAttemps-i );
                    System.out.println("You have " + point + " points.");
                    break;
                    //starts the game again if you guess correctly
                }
                else if (guess != number){
                //else if the guess is not correct
                    if (guess < number){
                        //checks if the guess is lower than the number
                        System.out.println("The number is greater than " + guess);
                        ++ i;
                    }if (guess > number){
                        //checks if the guess is larger than the number
                        System.out.println("The number is less than " + guess);
                        ++ i;
                    }
                }
                if (i == numberOfAttemps){
                System.out.print("Out of attempts GAME OVER !\n");
                //happens only if i=numberOfGuess and tells the user they are out of guesses
                sc.close();
                return;
                }
            }
            if (point >= 10){
                System.out.println("10 points reached congrats you WIN !");
                sc.close();
                return;
            }
        }
        
    }

}
