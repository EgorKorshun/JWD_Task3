package by.epamtc.korshun.task03.par2.service;

import by.epamtc.korshun.task03.par1.exception.ArraySizeException;
import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task03.par2.service.OtherServices.fillingArray;
import static org.junit.Assert.*;

public class OtherServicesTest {


    @Test(expected = ArraySizeException.class)
    public void fillingArrayTest() throws ArraySizeException {
        int dimension =-1234;
        fillingArray(dimension);
    }


    @Test
    public void fillingArrayTestLengthWithZero() throws ArraySizeException {
        int dimension= 0;
        int  expected = 0;
        int  actual  = fillingArray(dimension).length;
        Assert.assertEquals(expected,actual);
    }
}