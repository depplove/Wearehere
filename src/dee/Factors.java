package dee;

import java.util.Random;

public class Factors {
    public static void main(String[] args) {
       factors(12);

    }
    static void factors(int num) {
        int sum = 0;
        if (num > 0) {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    System.out.print(i+" ");  // list of factors excluding the num
                }

            }
            System.out.println();
            if (sum == num) System.out.println(num + " is a perfect number."); // condition to check perfect number
            else System.out.println(num+" is not a perfect number.");
        }else System.out.println("Invalid Value");
    }
}
