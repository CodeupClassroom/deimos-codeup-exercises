import java.util.Scanner;

public class ControlLoopsLec {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean outOfPizzaRolls = true;
        boolean outOfPepsiCherry = false;

        System.out.printf("Night ruined: %b%n", outOfPepsiCherry && outOfPizzaRolls);

        System.out.printf("Night suboptimal: %b%n", outOfPepsiCherry || outOfPizzaRolls);

        System.out.printf("Have food: %b%n", !outOfPizzaRolls);

        System.out.printf("Have drink: %b%n", !outOfPepsiCherry);

        System.out.println(sc.nextBoolean() && sc.nextBoolean());
        System.out.println(sc.nextBoolean() || sc.nextBoolean());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Did you bring enough gum for the rest of the class? How many sticks of gum do you have?");
        int sticksOfGum = sc.nextInt();

        System.out.printf("Enough gum for the class: %b%n", sticksOfGum >= 26); //Enough for all the students, Fer, and I.

        System.out.println("How much wood could a woodchuck chuck?");
        int chuckableWood = sc.nextInt();

        System.out.printf("Got 'em: %b%n", chuckableWood > 0);

        System.out.println("How many seasons of Lizzie McGuire were there?");
        int lizzieSeasons = sc.nextInt();

        System.out.printf("User knows who Hilary Duff is: %b%n", lizzieSeasons == 2);

        sc.nextLine();

        System.out.println("Who was the 1994 and 1995 NBA Finals MVP");
        String number34 = sc.nextLine();

        System.out.printf("User from Houston && Likes Basketball: %b%n", number34.equalsIgnoreCase("Hakeem Olajuwon"));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if (chuckableWood > 0) {
            System.err.println("IF a woodchuck COULD chuck wood.");
        }

        if (number34.equalsIgnoreCase("Clyde Drexler")) {
            System.out.println("He didn't join the Rockets until '95.");
        } else if (!number34.equalsIgnoreCase("Hakeem Olajuwon")){
            System.out.println("I guess we never could be friends...");
            if (lizzieSeasons == 2) {
                System.out.println("I take that back, we're cool.");
            }
        }

        switch (sticksOfGum) {
            case 26:
                System.out.println("That's just enough gum!");
                break;
            case 27:
                System.out.println("Oh, so you get two? NO GUM IN CLASS!!!");
                break;
            default:
                break;
        }

        while (!number34.equalsIgnoreCase("Hakeem Olajuwon")) {
            System.out.println("You wanna try that again? Who was the man who lead the Houston Rockets to two NBA Championships?");
            number34 = sc.nextLine();
        }

        System.out.println("In this classroom, we respect The Dream.");

        do {
            System.out.println("How much wood could a woodchuck chuck?");
            chuckableWood = sc.nextInt();
        } while (chuckableWood > 0);

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
