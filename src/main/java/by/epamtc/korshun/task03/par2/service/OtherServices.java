package by.epamtc.korshun.task03.par2.service;

import by.epamtc.korshun.task03.par1.exception.ArraySizeException;

import java.util.Random;
import java.util.Scanner;

public class OtherServices {

    public static int enterValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[][] fillingArray(int dimension) throws ArraySizeException {
        if (dimension < 0) throw new ArraySizeException("not correct dimension");
        Random random = new Random();
        int[][] arr = new int[dimension][];
        for (int i = 0; i < dimension; i++) {
            arr[i] = new int[enterValue()];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(30);
            }

        }
        return arr;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
