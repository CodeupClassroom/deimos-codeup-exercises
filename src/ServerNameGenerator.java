import java.util.Random;

public class ServerNameGenerator {
    static Random rando = new Random();
    private static String[] adj = {"muenster", "havarti", "cheddar", "provolone", "colby", "jarlsberg", "moose", "ricotta", "mozzarella", "crema"};
    private static String[] noun = {"wombat", "potoroo", "kangaroo", "koala", "bandicoot", "quoll", "opossum", "billby", "numbat", "thylacine"};

    private static String randomElement(String[] strings){
        int magicNum = rando.nextInt(strings.length);
        return strings[magicNum];
    }

    public static String makeServerName(String[] strings1, String[] strings2){
        String part1 = randomElement(strings1);
        String part2 = randomElement(strings2);
        String finalString = part1 + "-" + part2;
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println("Your server name is:");
        System.out.println(makeServerName(adj,noun));
    }
}