package by.epamtc.korshun.task03.par1.service;

import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task03.par1.service.FillArray.randomFilling;
import static org.junit.Assert.*;

public class FillArrayTest {

    @Test
    public void randomFillingTestOfCorrectDimension() {
        int dimension = 15;
        int from =0;
        int to = 30;
        int[] arrayOfTest = randomFilling(dimension,from,to);
        int count = 0;
        for(int i = 0 ; i<arrayOfTest.length; i++){
            count++;
        }
        Assert.assertTrue(count==dimension);
    }

}