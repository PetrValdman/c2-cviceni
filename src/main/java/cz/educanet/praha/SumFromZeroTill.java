package cz.educanet.praha;

import java.util.Scanner;

public class SumFromZeroTill {
    public static int sumFromZeroTill(int max){
        int a = max + 1;
        int result = 0;
        for (int i = 0; i < a; i++){
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println(sumFromZeroTill(sc.nextInt()));
    }
}
