package by.epamtc.korshun.task03.par1.service;

import by.epamtc.korshun.task03.par1.entity.Array;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static by.epamtc.korshun.task03.par1.service.SearchNumbers.*;
import static org.junit.Assert.*;

public class SearchNumbersTest {

    @Test
    public void isPrimeTestWithZero() {
        int number = 0;
        boolean expected = false;
        boolean actual = isPrime(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isPrimeTestWithNegative() {
        int number = -3;
        boolean expected = false;
        boolean actual = isPrime(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isPrimeTestCorrect() {
        int number = 3;
        boolean expected = true;
        boolean actual = isPrime(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isFibonacciTestWithNegative() {
        int number = -3;
        boolean expected = false;
        boolean actual = isFibonacci(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isFibonacciTestWithZero() {
        int number = 0;
        boolean expected = true;
        boolean actual = isFibonacci(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isFibonacciTestCorrect() {
        int number = 21;
        boolean expected = true;
        boolean actual = isFibonacci(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isDifferentDigitsTestWithAllSame() {
        int number = 111;
        boolean expected = false;
        boolean actual = isDifferentDigits(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isDifferentDigitsTestWithTwoSame() {
        int number = 112;
        boolean expected = false;
        boolean actual = isDifferentDigits(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isDifferentDigitsTestWithTwoSameDifPosition() {
        int number = 121;
        boolean expected = false;
        boolean actual = isDifferentDigits(number);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void isDifferentDigitsTestWithCorrectCondition() {
        int number = 123;
        boolean expected = true;
        boolean actual = isDifferentDigits(number);
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void getFibonacciTestCorrect() throws NullArrayException {
        int[] arrayOfInt = new int[]{0,1,4,4,9,12,1};
        Array array = new Array(arrayOfInt);
        int[] expected = new int[]{0,1,1};
        int[] actual = getFibonacci(array);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }
    @Test
    public void getFibonacciTestEmptyArr() throws NullArrayException {
        int[] arrayOfInt = new int[]{-1,-1,-1,-12,4};
        Array array = new Array(arrayOfInt);
        int[] expected = new int[]{};
        int[] actual = getFibonacci(array);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void getPrimeTestEmpty() throws NullArrayException{
        int[] arrayOfInt = new int[]{-1,-1,-1,-12,4};
        Array array = new Array(arrayOfInt);
        int[] expected = new int[]{};
        int[] actual = getPrime(array);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }
    @Test
    public void getPrimeTestCorrect() throws NullArrayException{
        int[] arrayOfInt = new int[]{0,1,2,3,4,5};
        Array array = new Array(arrayOfInt);
        int[] expected = new int[]{2,3,5};
        int[] actual = getPrime(array);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void getDigitNumbersCorrectTest() throws NullArrayException {
        int[] arrayOfInt = new int[]{99,100,123,124,122};
        Array array = new Array(arrayOfInt);
        int[] expected = new int[]{123,124};
        int[] actual = getDigitNumbers(array);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }
    @Test
    public void getDigitNumbersTestEmpty() throws NullArrayException {
        int[] arrayOfInt = new int[]{99,100,122,144,112};
        Array array = new Array(arrayOfInt);
        int[] expected = new int[]{};
        int[] actual = getDigitNumbers(array);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }
}