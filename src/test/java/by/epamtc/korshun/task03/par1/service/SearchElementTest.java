package by.epamtc.korshun.task03.par1.service;

import by.epamtc.korshun.task03.par1.entity.Array;
import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task03.par1.service.SearchElement.searchBinary;
import static by.epamtc.korshun.task03.par1.service.SearchNumbers.getFibonacci;
import static org.junit.Assert.*;

public class SearchElementTest {

    @Test
    public void searchBinaryTestCorrect() {
        int [] arrayOfInt = new int[]{1,23,4,2,1,4};
        Array array = new Array(arrayOfInt);
        int expected = 2;
        int actual = searchBinary(array,4);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void searchBinaryTestSame() {
        int [] arrayOfInt = new int[]{0,1,1,1};
        Array array = new Array(arrayOfInt);
        int expected = 1;
        int actual = searchBinary(array,1);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void searchBinaryTestWithoutValue() {
        int [] arrayOfInt = new int[]{0,0,0,0};
        Array array = new Array(arrayOfInt);
        int expected = -1;
        int actual = searchBinary(array,1);
        Assert.assertEquals(actual,expected);
    }

}