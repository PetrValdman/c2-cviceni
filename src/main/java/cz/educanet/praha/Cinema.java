package cz.educanet.praha;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cinema {
    static int freeSpaces(String[] seatNames, Scanner sc) {
        while (sc.hasNext()) {
            int index = getIndex(sc, seatNames);
            String name = sc.next();
            seatNames[index] = name;
        }
        return (int) Arrays.stream(seatNames).filter(Objects::isNull).count();
    }

    private static int getIndex(Scanner sc, String[] seatNames) {
        int i;
        do {
            i = sc.nextInt();
            System.out.println(i);
        } while (i < 0 || i >= seatNames.length || seatNames[i] != null);
        return i;
    }

    public static void main(String[] args) {
        int freeSpaces = freeSpaces(new String[]{"2bad2furious", null, null, "monarezio"}, new Scanner(System.in));
        System.out.println("Free spaces:" + freeSpaces);
    }
}
