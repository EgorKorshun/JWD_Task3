package by.epamtc.korshun.task03.par1.runner;

import by.epamtc.korshun.task03.par1.entity.Array;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;
import by.epamtc.korshun.task03.par1.service.*;
import by.epamtc.korshun.task03.par1.tool.ScanValue;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println("enter capacity of array");
        int capacity =ScanValue.enterInteger();
        if(capacity<0){
            capacity = ScanValue.enterInteger();
        }
        System.out.println("enter filling boundaries");
        int[] arrayOfInt = FillArray.randomFilling(capacity,ScanValue.enterInteger(),ScanValue.enterInteger());
        System.out.println(Arrays.toString(arrayOfInt));
        Array array  = new Array(arrayOfInt);
        try {
            System.out.println("what type of sort do you prepare?\n1 - select sort\n2 - " +
                    "bubble sort\n3 - insertion sort\n\nenter 1 - 3");

            switch (ScanValue.enterInteger()){
                case 1:
                    Sort.selectSort(array);
                    break;
                case 2:
                    Sort.bubbleSort(array);
                    break;
                case 3:
                    Sort.insertionSort(array);
                    break;
                default:
                    System.out.println("at this rate - quick sort");
                    Sort.quickSort(array.getArray(),0, array.getArray().length-1);
                    break;
            }
            System.out.println(Arrays.toString(array.getArray()));
            System.out.println("enter value to search");
            System.out.println(SearchElement.searchBinary(array, ScanValue.enterInteger()));
            System.out.println("max element is "+ MinMaxElement.searchMax(array));
            System.out.println("min element is "+ MinMaxElement.searchMin(array));
            System.out.println("fibonacci numbers: "+Arrays.toString(SearchNumbers.getFibonacci(array)));
            System.out.println("prime numbers: "+Arrays.toString(SearchNumbers.getPrime(array)));
            System.out.println("three digit numbers: "+Arrays.toString(SearchNumbers.getDigitNumbers(array)));


        } catch (NullArrayException e) {
            e.printStackTrace();
        }
    }
}
