package cz.educanet.praha;

import java.util.Scanner;

public class Cube {
    public static int sumOfAreasAndVolumes(Scanner scanner) {
        int result = 0;
        int side = 0;
        while(scanner.hasNext() == true) {
            side = scanner.nextInt();
            result = result + (6*side*side)+(side*side*side);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAreasAndVolumes(new Scanner(System.in)));
    }
}
