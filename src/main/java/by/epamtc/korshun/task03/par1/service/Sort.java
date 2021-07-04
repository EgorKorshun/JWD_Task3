package by.epamtc.korshun.task03.par1.service;

import by.epamtc.korshun.task03.par1.entity.Array;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;

public class Sort {
    public static  void selectSort(Array arrayOfInt) throws  NullArrayException{
        if(arrayOfInt==null||arrayOfInt.getArray().length==0)
            throw  new NullArrayException("array is null");
        int[] array = arrayOfInt.getArray();
        selectSortArrOfInt(array);
    }


    public static void selectSortArrOfInt(int[] arrayOfInt) throws NullArrayException {
        for (int i = 0; i < arrayOfInt.length; i++) {
            int minIndex = min(arrayOfInt, i, arrayOfInt.length);
            int tmp = arrayOfInt[i];
            arrayOfInt[i] = arrayOfInt[minIndex];
            arrayOfInt[minIndex] = tmp;
        }
    }

    private static int min(int[] array, int start, int end) throws  NullArrayException {
        if(array == null) throw  new NullArrayException("array is null");
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < end; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public  static void bubbleSort(Array arrayOfInt) throws  NullArrayException{
        if(arrayOfInt==null)
            throw  new NullArrayException("array is null");
        int [] array = arrayOfInt.getArray();
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    sorted = false;
                }
            }
        }
    }

    public static void insertionSort(Array arrayOfInt) throws NullArrayException {
        if (arrayOfInt == null)
            throw new NullArrayException("array is null");
        int[] array = arrayOfInt.getArray();
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i])
                    array[i + 1] = array[i];
                else break;
            }
            array[i + 1] = value;
        }
    }

    public static void quickSort(int[] arrayOfInt, int from, int to) throws NullArrayException {
        if(arrayOfInt ==null)throw  new NullArrayException("array is null");

        if (from < to) {

            int divideIndex = partitionToQuickSort(arrayOfInt, from, to);

            quickSort(arrayOfInt, from, divideIndex - 1);

            quickSort(arrayOfInt, divideIndex, to);
        }
    }

    private static int partitionToQuickSort(int[] arr, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

}
