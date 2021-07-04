package by.epamtc.korshun.task03.par1.service;

import by.epamtc.korshun.task03.par1.entity.Array;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;

public class SearchNumbers {

    public static int[] addToArray(int[] arrayOfInt, int element) throws NullArrayException {
        if(arrayOfInt == null)
            throw  new NullArrayException("array is null");
        int[] newArray = new int[arrayOfInt.length + 1];
        System.arraycopy(arrayOfInt, 0, newArray, 0, arrayOfInt.length);
        newArray[arrayOfInt.length] = element;
        return newArray;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    private static  boolean isPerfectSquareForFib(int value)
    {
        int result = (int) Math.sqrt(value);
        return (result * result == value);
    }
    public static boolean isFibonacci(int number) {
        if (number >= 0) {
            return isPerfectSquareForFib(5 * number * number + 4) ||
                    isPerfectSquareForFib(5 * number * number - 4);
        }
        return false;
    }

    public static boolean isDifferentDigits(int number) {
        boolean result = false;
        int value = Math.abs(number);
        if (value >= 100 && value < 1000) {
            int digitFirst = value / 100;
            int digitSecond = value / 10 % 10;
            int digitThird = value % 10;

            if (digitFirst != digitSecond
                    && digitFirst != digitThird
                    && digitSecond != digitThird)
                result = true;
        }
        return result;
    }

    private static int[] checkArr(Array array) throws NullArrayException {
        if (array == null) {
            throw new NullArrayException();
        }
        return new int[0];
    }

    public static int[] getFibonacci(Array array) throws NullArrayException {
        int [] arrayOfNumbers = checkArr(array);
        for (int number : array.getArray()) {
            if (isFibonacci(number))
                arrayOfNumbers = addToArray(arrayOfNumbers, number);
        }
        return arrayOfNumbers;
    }

    public static int[] getPrime(Array array) throws NullArrayException {
        int [] arrayOfNumbers = checkArr(array);
        for (int number : array.getArray()) {
            if (isPrime(number))
                arrayOfNumbers = addToArray(arrayOfNumbers, number);
        }
        return arrayOfNumbers;
    }

    public static int[] getDigitNumbers(Array array) throws NullArrayException {
        int [] arrayOfNumbers = checkArr(array);
        for (int number : array.getArray()) {
            if (isDifferentDigits(number))
                arrayOfNumbers = addToArray(arrayOfNumbers, number);
        }
        return arrayOfNumbers;
    }


}
