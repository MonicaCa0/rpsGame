import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"Rock", "Paper", "Scissors"};
            String computer = rps[new Random().nextInt(rps.length)];


            String player;

            while (true) {
                System.out.println("Please enter your move (Rock, Paper, or Scissors)");
                player = scanner.nextLine();
                if (player.equals("Rock") || player.equals("Paper") || player.equals("Scissors")) {
                    break;
                }
                System.out.println(player + " is not a valid move.");
            }
            System.out.println("Computer played: " + computer);
            if (computer.equals(player)) {
                System.out.println("It's a Tie!");

            } else if (player.equals("Rock")) {
                if (computer.equals("Paper")) {
                    System.out.println("You Lose!");
                } else if (computer.equals("Scissors")) {
                    System.out.println("You Win!");
                }
            } else if (player.equals("Paper")) {
                if (computer.equals("Rock")) {
                    System.out.println("You Win!");
                } else if (computer.equals("Scissors")) {
                    System.out.println("You Lose!");
                }
            } else {
                if (computer.equals("Paper")) {
                    System.out.println("You Win!");
                } else if (computer.equals("Rock")) {
                    System.out.println("You Lose!");
                }
            }
            System.out.println("Play Again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) {
                System.out.println("Thanks for Playing!");
                break;
            }
        }
    }
}











