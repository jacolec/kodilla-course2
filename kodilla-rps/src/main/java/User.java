import java.util.Scanner;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int process() {
        int rounds = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rounds you want to play?");
        rounds = scanner.nextInt();
        System.out.println("Number of rounds: " + rounds);
        return rounds;
    }
}
