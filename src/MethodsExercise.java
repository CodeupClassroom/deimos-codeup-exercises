import java.util.Scanner;

public class MethodsExercise {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("sum(1,2) = " + sum(1, 2));
//        System.out.println(sum(1,2) == 3);
//        System.out.println(sum(-1,2) == 1);
        System.out.println("sub(1,2) = " + sub(1, 2));
        System.out.println("multiply(3,2) = " + multiply(3, 2));
        System.out.println("division(5,2) = " + division(5, 2));
        System.out.println("modulus(5,2) = " + modulus(5, 2));

        System.out.print("Enter a number between 1 and 10: ");
        System.out.println("userInput = " + getInteger(1, 10));

    }

    public static double sum(double num, double num2){
        return num + num2;
    }

    public static double sub(double num, double num2){
        return num - num2;
    }

    public static double multiply(double num, double num2){
        return num * num2;
    }

    public static double division(double num, double num2){
        return num / num2;
    }

    public static double modulus(double num, double num2){
        return num % num2;
    }

    public static int getInteger(int min, int max){
        int input = Integer.parseInt(scan.nextLine());

        if(input < min){
            System.out.println("The number is lower than the min, try again: ");
            return getInteger(min, max);
        } else if(input > max) {
            System.out.println("The number is higher than the max, try again: ");
            return getInteger(min, max);
        }

        return input;
    }


}
