/*

Shahzaib Mumtaz
02 / 05 /2024
Project-1
A program for Rock-Paper-Scissor Game.

 */


// Importing Libraries
import java.util.Random;
import java.util.Scanner;

// Main Class
public class Main
{
    public static void main(String[] args)
    {
        Scanner selection = new Scanner(System.in); // Scanner class for user input.
        
        // Declaring variables
        int user_pick;
        int computer_pick;
        char choice = 'Y';
        
        // Using While loop to let the user play as long as the user wants.
        while (choice == 'y' || choice =='Y') {

            // Getting User Input and Displaying it.
            System.out.println("Choose Any one of the following option: ");
            System.out.println("1 -> Rock ");
            System.out.println("2 -> Scissor");
            System.out.println("3 -> Paper");
            System.out.print("Enter your choice:  ");
            user_pick = selection.nextByte();

            switch (user_pick) {
                case 1:
                    System.out.println("You have choose Rock.");
                    break;

                case 2:
                    System.out.println("You have choose Scissor.");
                    break;

                case 3:
                    System.out.println("You have choose Paper.");
                    break;

                default:
                    System.out.println("Invalid number Entered.");
            }

            // Using Random class object to generate random pick for Computer
            Random random = new Random();

            computer_pick = random.nextInt(1, 4);

            switch (computer_pick) {
                case 1:
                    System.out.println("Computer have choose Rock.");
                    break;

                case 2:
                    System.out.println("Computer have choose Scissor.");
                    break;

                case 3:
                    System.out.println("Computer have choose Paper.");
                    break;
            }

            // Getting result for each possibility
            if (user_pick == 1 && computer_pick == 1) {
                System.out.println("Game is draw.");
            } else if (user_pick == 1 && computer_pick == 2) {
                System.out.println("You win the game.");
            } else if (user_pick == 1 && computer_pick == 3) {
                System.out.println("Computer wins the game.");
            } else if (user_pick == 2 && computer_pick == 1) {
                System.out.println("Computer wins the game.");
            } else if (user_pick == 2 && computer_pick == 2) {
                System.out.println("Game is draw.");
            } else if (user_pick == 2 && computer_pick == 3) {
                System.out.println("You win the game.");
            } else if (user_pick == 3 && computer_pick == 1) {
                System.out.println("You win the game.");
            } else if (user_pick == 3 && computer_pick == 2) {
                System.out.println("Computer wins the game.");
            } else if (user_pick == 3 && computer_pick == 3) {
                System.out.println("Game is draw.");
            }
            
            // Getting input from the user for While loop condition.
            System.out.print("Do you want to play again? (Y/N) ");
            choice = selection.next().charAt(0);

        }
    }
}
