package by.epamtc.korshun.task03.par1.service;

import by.epamtc.korshun.task03.par1.exception.NullFileException;
import by.epamtc.korshun.task03.par1.tool.ScanValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FillArray {

    public static int[] consoleFilling(int dimension) {
        int[] array = arrToFilling(dimension);
        for (int i = 0; i < dimension; i++) {
            array[i] = ScanValue.enterInteger();
        }
        return array;
    }

    private static int[] arrToFilling(int dimension) {
        return new int[dimension];
    }

    public static int[] randomFilling(int dimension, int from, int to) {
        int[] array = arrToFilling(dimension);
        for (int i = 0; i < dimension; i++) {
            array[i] = from + (int) (Math.random() * to);
        }
        return array;
    }

    public static int[] fileFilling(String file) throws FileNotFoundException, NullFileException {
        if (file == null || file.isEmpty())
            throw new NullFileException("file is null");
        Scanner input = new Scanner(new File(String.valueOf(file)));
        StringBuilder beginValue = new StringBuilder();
        int count = 0;
        while (input.hasNext()) {
            beginValue.append(input.nextLine());
            count++;
        }
        String[] nextValue = beginValue.toString().split(",");
        int[] array = new int[count];
        for (int i = 0; i < count; i++)
            array[i] = Integer.parseInt(nextValue[i]);
        return array;
    }
}
