import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cpuOPT;
        int playerElection;
        Scanner sc = new Scanner(System.in);

        // WELCOME MESSAGE
        welcomeMessage();
        do {
            cpuOPT = getCpuNumber();
            firstMenu();
            playerElection = sc.nextInt();
            swiEle(playerElection);
            result(playerElection, cpuOPT);
        }
        while (playerElection != 4);
        System.out.println("SEE U SOON! LETS PLAY ANOTHER DAY! :)");
    }

    private static void result(int playerElection, int cpuOPT) {
        if (playerElection == cpuOPT) {
            System.out.println("IT'S A DRAW. LETS PLAY AGAIN...");
        }
        if (playerElection == 1 && cpuOPT == 2) {
            System.out.println("YOU LOSE!... PAPER COVERS ROCK!");
        }
        if (playerElection == 1 && cpuOPT == 3) {
            System.out.println("YOU WIN!... ROCK BEATS SCISSORS!");
        }
        if (playerElection == 2 && cpuOPT == 1) {
            System.out.println("YOU WIN!... PAPER COVERS ROCK!");
        }
        if (playerElection == 2 && cpuOPT == 3) {
            System.out.println("YOU LOSE!... SCISSORS CUT PAPER!");
        }
        if (playerElection == 3 && cpuOPT == 1) {
            System.out.println("YOU LOSE!... ROCK BLUNTS SCISSORS!");
        }
        if (playerElection == 3 && cpuOPT == 2) {
            System.out.println("YOU WIN!... SCISSORS CUT PAPER!");
        }

    }

    private static void swiEle(int playerElection) {
        switch (playerElection) {
            case 1:
                System.out.println("YOU CHOOSE ROCK!");
                break;
            case 2:
                System.out.println("YOU CHOOSE PAPER!");
                break;
            case 3:
                System.out.println("YOU CHOOSE SCISSORS!");
                break;
        }
    }

    private static void welcomeMessage() {
        System.out.println("\nWELCOME TO ROCK PAPER SCISSORS GAME! LETS PLAY!");
    }

    private static void firstMenu() {
        System.out.println("CHOOSE AN OPTION:");
        System.out.println("1 - ROCK");
        System.out.println("2 - PAPER");
        System.out.println("3 - SCISSORS");
        System.out.println("4 - EXIT");
    }

    private static void pressAnyKeyToContinue() {
        System.out.println("\nPress any key to choose another option...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    // GETTING RANDOM NUMBER!
    public static int getCpuNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(3) + 1; /// +1 BECAUSE ITS STARTS FROM ZERO (LIMITE 0-3)+1.
    }
}
