package by.epamtc.korshun.task03.par1.service;

import by.epamtc.korshun.task03.par1.entity.Array;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;
import org.junit.Assert;
import org.junit.Test;


import static by.epamtc.korshun.task03.par1.service.MinMaxElement.searchMax;
import static by.epamtc.korshun.task03.par1.service.MinMaxElement.searchMin;
import static org.junit.Assert.*;

public class MinMaxElementTest {

    @Test
    public void searchMinTestWithNegative() throws NullArrayException {
        int[] arrayOfInt = new int[] {-123,-12,-2,-3,-43,-8,-1,-5};
        Array array = new Array(arrayOfInt);
        int expected =-123;
        int actual = searchMin(array);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void searchMinTestWithIdentical() throws NullArrayException {
        int[] arrayOfInt = new int[] {2,2,2,2,2,2};
        Array array = new Array(arrayOfInt);
        int expected =2;
        int actual = searchMin(array);
        Assert.assertEquals(actual,expected);
    }
    @Test(expected = NullArrayException.class)
    public void searchMinTestWithEmptyArray() throws NullArrayException {
        int[] arrayOfInt = new int[]{};
        Array array = new Array(arrayOfInt);
        int expected = 0;
        int actual = searchMin(array);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void searchMaxTestWithNegative() throws NullArrayException {
        int[] arrayOfInt = new int[] {-23,-1,-1,-12,-2,-3,-43,-8};
        Array array = new Array(arrayOfInt);
        int expected =-1;
        int actual = searchMax(array);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void searchMaxTestCorrect() throws NullArrayException {
        int[] arrayOfInt = new int[] {1,2,3,4,5,14,1,4,145,1,876};
        Array array = new Array(arrayOfInt);
        int expected =876;
        int actual = searchMax(array);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void searchMaxTestWithIdentical() throws NullArrayException {
        int[] arrayOfInt = new int[] {2,2,2,2,2,2};
        Array array = new Array(arrayOfInt);
        int expected =2;
        int actual = searchMax(array);
        Assert.assertEquals(actual,expected);
    }
    @Test(expected = NullArrayException.class)
    public void searchMaxTestWithEmptyArray() throws NullArrayException {
        int[] arrayOfInt = new int[]{};
        Array array = new Array(arrayOfInt);
        int expected = 0;
        int actual = searchMax(array);
        Assert.assertEquals(actual, expected);
    }
}