package by.epamtc.korshun.task03.par2.service;

import java.util.Comparator;

public class MinElement implements Comparator<int[] > {
    @Override
    public int compare(int[] a, int[] b){
        int minElementsFirst = findMinElement(a);
        int minElementsSecond = findMinElement(b);

        int result = 0;
        if(minElementsFirst  > minElementsSecond)
            result = 1;
        else if(minElementsSecond > minElementsFirst )
            result =  -1;
        return result;
    }

    private int findMinElement(int[] array) {
        int[] arr = array;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
