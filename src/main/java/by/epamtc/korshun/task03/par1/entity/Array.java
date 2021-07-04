package by.epamtc.korshun.task03.par1.entity;

import by.epamtc.korshun.task03.par1.exception.ArraySizeException;

import java.util.Arrays;


public class Array {
    private static final int MIN_SIZE = 0;
    private int[] arrayOfInt;

    public Array() {
        this.arrayOfInt = new int[MIN_SIZE];
    }

    public Array(int[] arrayOfInt) {
        this.arrayOfInt = arrayOfInt;
    }

    public Array(int dimension) {
        int[] arrayOfInt = new int[dimension];
    }

    public int getElement(int index) throws ArraySizeException {

        if (index < 0 || index > this.arrayOfInt.length - 1)
            throw new ArraySizeException("Index is out of the array`s size");

        return this.arrayOfInt[index];
    }

    public void setElement(int element, int index) throws ArraySizeException {

        if (index < 0 || index > this.arrayOfInt.length - 1)
            throw new ArraySizeException("Index is out of the array`s size");

        this.arrayOfInt[index] = element;
    }

    public int[] getArrayOfInt() {
        return arrayOfInt;
    }

    public int[] getArray() {
        return Arrays.copyOf(arrayOfInt,arrayOfInt.length);
    }

    @Override
    public int hashCode() {
        return 17 * this.arrayOfInt.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        if (this.arrayOfInt.length != array1.arrayOfInt.length) return false;

        for (int i = 0; i < this.arrayOfInt.length; i++) {
            if (this.arrayOfInt[i] != array1.arrayOfInt[i])
                return false;
        }
        return true;
    }

    @Override
    public String toString() {

        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.println(arrayOfInt[i]);
        }
        System.out.println();

        return " arrayOfInt of "+ getClass().getSimpleName();
    }
}
