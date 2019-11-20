public class MyFirstClass {

//    fer

    public static void main(String[] args) {
        String name = "hello fer";
        System.out.println(name);

        byte aNumber = 100;
        short age = 29000 + 100;
        int secondNumber = age + aNumber;
        long account = 2343242344564646324L;

        float price = 4.5f;
        double priceWithDiscount = price - 1.0f;

        char dollarSign = '$';
        char gender = 'M';

        float res = (5 / 6);

        boolean zachIsTheRoom = (aNumber == 100);

        final String nameL = "fernando";
//        nameL = "Luis";
        System.out.println(nameL);

//        Binary expression
        System.out.println("aNumber = " + (aNumber + 2));

        //        Binary expression
//        aNumber++;
        System.out.println("aNumber = " + ++aNumber);

//        Input from the terminal
        double pi = 3.14159;
        byte almostPi = (byte) pi;
        System.out.println("pi = " + pi);
        System.out.println("almostPi = " + almostPi);

//        Simulate a HTTP request
        String ageParameter = "29";
        Integer anotherNumber = 5;

        anotherNumber.byteValue();
        byte realAge = (byte) (Integer.parseInt(ageParameter) + 1);
        System.out.println("realAge = " + realAge);



    }

}