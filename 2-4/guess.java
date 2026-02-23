import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean kp = true;

        System.out.println("Want to play a game? --- y/n");
        String response = in.nextLine();

        if (response.equals("n")) {
            kp = false;
        }

        while (kp) {
            int targetNumber = random.nextInt(100) + 1;
            boolean won = false;
            
            System.out.println("\nGame Starting...");
            System.out.println("Guess a number (1-100) or enter 0 to exit:");

            while (!won) {
                int guess = in.nextInt();

                if (guess == 67) {
                    System.out.println("67. Really?");
                    System.out.println();
                    System.out.println("Your ancestors survived wars, famines, and the harsh realities of evolution");
                    System.out.println("just so their lineage could reach the pinnacle of human history... only for");
                    System.out.println("you to waste your intellect on a '67' meme. Your parents dreamt of a scholar");
                    System.out.println("or a leader, but instead, they got a person who thinks this is funny.");
                    System.out.println();
                    System.out.println("I'm not even mad. I'm just mourning the person you could have been.");
                    System.out.println();
                }

                // exit y/n
                if (guess == 0) {
                    System.out.println("Exiting. The number was: " + targetNumber);
                    won = true; 
                } else if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number!");
                    won = true;
                } else {
                    // low or high
                    if (guess < targetNumber) {
                        System.out.print("Too low. ");
                    } else {
                        System.out.print("Too high. ");
                    }

                    // Within 15 check
                    if (Math.abs(guess - targetNumber) <= 15) {
                        System.out.println("But you're close (within 15)!");
                    } else {
                        System.out.println("Try again.");
                    }
                }
            }

            System.out.println("Do you want to play another round? y/n");
            // Clear Buffer
            in.nextLine(); 
            String again = in.nextLine();
            
            if (again.equals("n")) {
                kp = false;
            }
        }

        System.out.println("Thanks for playing!");
        in.close();
    }
}