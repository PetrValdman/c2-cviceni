package cz.educanet.praha;

import java.util.Scanner;

public class SumSumsOfEvenAndMultipleOfOdd {

    public static int sumSumsOfEvenAndMultipleOfOdd(Scanner scanner) {
        int a;
        int b = 0;
        int c = 1;
        int result = 0;
        while(scanner.hasNext() == true) {
            a = scanner.nextInt();
            if(a%2 == 0) {
        //        System.out.println("even");
                b = b + a;
            } else {
        //        System.out.println("odd");
                c = c * a;
            }

                result = c + b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number separated by a new line");
        System.out.println(sumSumsOfEvenAndMultipleOfOdd(sc));
    }
}
