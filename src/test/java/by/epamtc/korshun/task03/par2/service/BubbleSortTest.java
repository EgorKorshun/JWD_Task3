package by.epamtc.korshun.task03.par2.service;

import by.epamtc.korshun.task03.par1.exception.ArraySizeException;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static by.epamtc.korshun.task03.par2.service.BubbleSort.bubbleSort;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSortTest() throws NullArrayException, ArraySizeException {
        int [][] arrayForTest = {{1},{123,12},{23,3,},{1}};
        MaxElement maxElements = new MaxElement();
        bubbleSort(arrayForTest,maxElements,true);
        int [][] expected= new int[][]{{1},{1},{23,3},{123,12}};
        int[][] actual = arrayForTest;
        Assert.assertTrue(Arrays.equals(actual,expected));
    }
    @Test(expected = NullArrayException.class)
    public  void  bubbleSortTestExc() throws NullArrayException, ArraySizeException {
        int[][] array = {};
        MinElement minElements = new MinElement();
        bubbleSort(array,minElements,true);
    }
}