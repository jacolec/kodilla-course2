import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class RpsRunner {

    public static void main(String[] args) {

        System.out.println("Welcome to ROCK-PAPER-SCISSORS game!" + "\n" + "\n" +
                "Controls: " + "\n" +
                "[1] - rock" + "\n" +
                "[2] - paper" + "\n" +
                "[3] - scissors" + "\n" + "\n" +
                "[x] - quit game" + "\n" +
                "[n] = new game" + "\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String userName = input.nextLine();
        User user = new User(userName);
        System.out.println("Your name: " + user.getName().toUpperCase());
        Computer computer = new Computer("Computer");
        computer.information();
        int rounds = user.process();
        int x = 1;
        while (x < rounds+1) {
            System.out.println("Round " + x);
            System.out.println("Make your move: [1]-rock or [2]-paper or [3]-scissors:");
            Scanner scan = new Scanner(System.in);
            String game = scan.nextLine();
            if (game.equals("x")) {
                return;
            } else if (game.equals("n")) {
                main(args);
            }
            int u = scan.nextInt();
            System.out.println("Player " + user.getName().toUpperCase() + " move: " + u);

            if ((u > 1) || (u <3)) {
                Random random = new Random();
                int c = random.nextInt(3-1+1)+1;
                System.out.println(computer.getName().toUpperCase() + " move: " + c);
                if (((u == 1) && (c == 3)) ||
                        ((u == 3) && (c == 2)) ||
                        ((u == 2) && (c == 1))) {
                    System.out.println("Player " + user.getName().toUpperCase() + " wins!");
                } else if (u==c) {
                    System.out.println("Game is a tie!");
                } else if ((u < 1) || (u > 3)) {
                    System.out.println("Incorrect control input! Please try again.");
                } else {
                    System.out.println("The " + computer.getName().toUpperCase() + " wins!");
                }
            }
            x++;
        }
    }
}
