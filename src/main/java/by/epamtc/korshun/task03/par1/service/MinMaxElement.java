package by.epamtc.korshun.task03.par1.service;

import by.epamtc.korshun.task03.par1.entity.Array;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;

public class MinMaxElement {

    public static int searchMin(Array array) throws  NullArrayException{
        if(array==null || array.getArray().length==0 )
            throw new  NullArrayException("array is null");
        int [] arr = array.getArray();
        int min = array.getArray()[0];
        for (int i = 1; i<array.getArray().length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int searchMax(Array array) throws  NullArrayException{
        if(array==null || array.getArray().length==0 )
            throw new  NullArrayException("array is null");
        int [] arr = array.getArray();
        int max = arr[0];
        for (int i = 1; i < array.getArray().length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
