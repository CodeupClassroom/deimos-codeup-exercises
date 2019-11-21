import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");

        String str = sc.next();
        System.out.println(str);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
//        System.out.println("Gimme a number...");
//        int num = sc.nextInt();
//
//        System.out.println("Gimme three words...");
//        String str1 = sc.next();
//        String str2 = sc.next();
//        String str3 = sc.next();
//
//        System.out.printf("%s %s %s%n", str1, str2, str3);
//
//        sc.nextLine();
//        System.out.println("Gimme a sentence...");
//        String sent = sc.nextLine();
//
//        System.out.printf("You entered: %s%n", sent);
//
//        System.out.println("~~~~~~~~~~~~~~~");
//        System.out.println("What is the length of the room?");
//        String lengthStr = sc.nextLine();
//        float length = Float.parseFloat(lengthStr);
//        System.out.println("What is the width of the room?");
//        String widthStr = sc.nextLine();
//        float width = Float.parseFloat(widthStr);
//
//        System.out.printf("The perimeter of the classroom is: %.2f unit(s).%n", 2 * width + 2 * length);
//        System.out.printf("The area of the classroom is: %.2f unit(s) squared.%n", width * length);
//
//    }
}
