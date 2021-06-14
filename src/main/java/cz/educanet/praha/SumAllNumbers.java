package cz.educanet.praha;

import java.util.Scanner;

public class SumAllNumbers {

    public static int calculate(Scanner scanner) {
        int result = 0;
        int a = 0;
        while(scanner.hasNext() == true) {
            a = scanner.nextInt();
            result = result + a;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(calculate(new Scanner(System.in)));
    }
}
