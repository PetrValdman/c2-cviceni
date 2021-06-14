package cz.educanet.praha;

import java.util.Scanner;

public class PrintedSquare {
    public static String printSquare(int side) {
        String result = "";
        for (int i = 0; i < side; i++) {
          //  System.out.print("*");
            result = result.concat("*");
        }
         //   System.out.println("");
        result = result.concat("\n");
        for (int a = 0; a < side - 2; a++) {
          //  System.out.print("*");
            result = result.concat("*");
            for (int b = 0; b < side - 2; b++) {

            //    System.out.print(" ");
                result = result.concat(" ");
            }
        //    System.out.print("*");
            result = result.concat("*");
        //    System.out.println("");
            result = result.concat("\n");
        }
        for (int i = 0; i < side; i++) {
        //    System.out.print("*");
            result = result.concat("*");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the square's side");
        String result = printSquare(sc.nextInt());
        System.out.println(result);
    }
}
