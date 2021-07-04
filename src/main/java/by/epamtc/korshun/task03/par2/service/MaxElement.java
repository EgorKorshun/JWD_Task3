package by.epamtc.korshun.task03.par2.service;

import java.util.Comparator;

public class MaxElement implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
        int maxElementsFirst = findMaxEl(a);
        int maxElementsSecond = findMaxEl(b);
        int resultOfCompare;
        if (maxElementsFirst > maxElementsSecond)
            resultOfCompare = 1;
        else if (maxElementsSecond > maxElementsFirst)
            resultOfCompare = -1;
        else resultOfCompare = 0;
        return resultOfCompare;
    }

    private int findMaxEl(int[] array) {
        int[] arr = array;
        int max = arr[0];
        for (int i = 1; i < array.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
