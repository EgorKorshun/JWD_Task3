package by.epamtc.korshun.task03.par2.service;

import by.epamtc.korshun.task03.par1.exception.ArraySizeException;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {

    public static void bubbleSort(int[][] array, Comparator<int[]> comp, boolean order) throws NullArrayException, ArraySizeException {
        if(array == null||array.length ==0)
            throw new NullArrayException("Array is null");
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < array.length; i++) {
                if ((comp.compare(array[i], array[i - 1]) < 0) == order) {
                    swap(array,i,i-1);
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) throws NullArrayException, ArraySizeException {
        int [][] arrayForTest = {{1},{123,12},{23,3,},{1}};
        MaxElement maxElements = new MaxElement();
        bubbleSort(arrayForTest,maxElements,true);
        System.out.println(Arrays.deepToString(arrayForTest));
    }

    private static void swap(int[][] array, int line1, int line2) {
        int[] temp = array[line1];
        array[line1] = array[line2];
        array[line2] = temp;
    }
}
