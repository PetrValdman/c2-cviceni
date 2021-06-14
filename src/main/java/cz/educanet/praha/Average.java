package cz.educanet.praha;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {

    public static double average(Scanner scanner) {
        double result = 0;
        int numOfItems = 0;
       // int a = scanner.nextInt();
      //  ArrayList<Double> array = new ArrayList<Double>();
        while(scanner.hasNext() == true) {
       // array.add(scanner.nextDouble());
        result = result + (scanner.nextDouble());
        numOfItems++;
        }
        result = result/numOfItems;
        return result;
    }

    public static void main(String[] args) {

        System.out.println(average(new Scanner(System.in)));
    }
}
