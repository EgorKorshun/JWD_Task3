package by.epamtc.korshun.task03.par1.service;

import by.epamtc.korshun.task03.par1.entity.Array;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static by.epamtc.korshun.task03.par1.service.Sort.selectSort;
import static by.epamtc.korshun.task03.par1.service.Sort.selectSortArrOfInt;

public class SortTest {

    @Test
    public void selectSortTestCorrectWithArrOfInt() throws NullArrayException {
        int [] arrayOfInt = new int[]{1,43,0,5,2,4,3};
        Array array = new Array(arrayOfInt);
        int[] expected = {0,1,2,3,4,5,43};
        selectSortArrOfInt(arrayOfInt);
        int [] actual = array.getArray();
        Assert.assertTrue(Arrays.equals(actual,expected));
    }

    @Test
    public void bubbleSortTestWithArrOfInt() throws NullArrayException {
        int [] arrayOfInt = new int[]{1,43,0,5,2,4,3};
        int[] expected = {0,1,2,3,4,5,43};
        Sort.bubbleSortForArrOfInt(arrayOfInt);
        int [] actual = arrayOfInt;
        Assert.assertTrue(Arrays.equals(actual,expected));
    }
    @Test
    public void selectSortTestCorrect() throws NullArrayException {
        int [] arrayOfInt = new int[]{1,43,0,5,2,4,3};
        Array array = new Array(arrayOfInt);
        int[] expected = {0,1,2,3,4,5,43};
        selectSort(array);
        int [] actual = array.getArray();
        Assert.assertTrue(Arrays.equals(actual,expected));
    }
    @Test
    public void insertionSortTestWithArrOfInt() throws NullArrayException {
        int [] arrayOfInt = new int[]{1,43,0,5,2,4,3};
        Sort.insertionSortForArrOFInt(arrayOfInt);
        int[] expected = {0,1,2,3,4,5,43};
        int [] actual = arrayOfInt;
        Assert.assertTrue(Arrays.equals(actual,expected));
    }
}