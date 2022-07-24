import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        System.out.println("Welcome to ROCK-PAPER-SCISSORS game!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String userName = input.nextLine();
        System.out.println("How many rounds you want to play?");
        int round = input.nextInt();
        System.out.println("User: " + userName + "\n" +
                "Rounds to beat: " + round + "\n" +
                "LETS GO!");
        User user = new User(userName, round);

    }
}
