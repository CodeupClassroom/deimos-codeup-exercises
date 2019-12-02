import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {
        int num = 4;
        String[] cheeses = new String[num];
        cheeses[0] = "Muenster";
        cheeses[1] = "Swiss";
        cheeses[2] = "Spray";
        cheeses[3] = "Kraft American Singles";

//        String[] cheeses = {"Cheese", "More Cheese", "A Very Different Cheese"};


        for(String cheese : cheeses) {
            System.out.println(cheese);
        }

        for(int i = 0; i < cheeses.length; i++) {
            System.out.println(cheeses[i]);
        }

        int[] nums = new int[6];


        Arrays.fill(nums, 17);
        nums[3] = 9;

        for(int n : nums) {
            System.out.println(n);
        }

        System.out.println("~~~~~~~~~");

        int[] nums2 = Arrays.copyOf(nums, 19);

        for(int n : nums2) {
            if (n == 0) {
                n = 7;
            }
            System.out.println(n);
        }

        System.out.println(Arrays.equals(nums, nums2));


        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(cheeses);
        System.out.println(Arrays.toString(cheeses));

        System.out.println("~~~~~~~~~~~");

        char[][] ticTacToeBoard = {
                {'A','B','C'},
                {'D','E','F'},
                {'G','H','I'}
        };

        for (char[] row : ticTacToeBoard) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (char n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");

//        char[][][] yesYouCanBut = {
//                {
//                        {'A','B','C'},
//                        {'D','E','F'},
//                        {'G','H','I'}
//                },
//                {
//                        {'J','K','L'},
//                        {'M','N','O'},
//                        {'P','Q','R'}
//                },
//                {
//                        {'S','T','U'},
//                        {'V','W','X'},
//                        {'Y','Z','!'}
//                }
//        };
//
//        System.out.println(yesYouCanBut[1][2][1]);
    }
}
