package by.epamtc.korshun.task03.par2.service;

import java.util.Comparator;

public class SumOfElements implements Comparator<int []> {
    @Override
    public int compare(int[] a,int[] b){
        int sumElementsFirst = findSum(a);
        int sumElementsSecond = findSum(b);
        int result = 0 ;
        if(sumElementsFirst > sumElementsSecond){
            result = 1;}
        else {
            result = -1;
        }
        return result;
    }

    private int findSum(int[] array) {
        int result = 0;
        for(int numbersOfArray : array){
            result += numbersOfArray;
        }
        return result;
    }
}
