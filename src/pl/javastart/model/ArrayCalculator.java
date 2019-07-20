package pl.javastart.model;

import java.util.Scanner;

public class ArrayCalculator {

    public int[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Podaj pięć liczb");

        array[0] = scanner.nextInt();
        scanner.nextLine();
        array[1] = scanner.nextInt();
        scanner.nextLine();
        array[2] = scanner.nextInt();
        scanner.nextLine();
        array[3] = scanner.nextInt();
        scanner.nextLine();
        array[4] = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        return array;
    }

    public int sum(int[] array) {
        return (array[0] + array[2] + array[4]);
    }
}
