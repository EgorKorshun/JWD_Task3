package by.epamtc.korshun.task03.par2.runner;

import by.epamtc.korshun.task03.par1.exception.ArraySizeException;
import by.epamtc.korshun.task03.par1.exception.NullArrayException;
import by.epamtc.korshun.task03.par2.service.*;

import java.util.Arrays;

import static by.epamtc.korshun.task03.par2.service.OtherServices.enterValue;

public class Runner {
    public static void main(String[] args) {
        try {
            System.out.println("enter dimension of array: ");
            int dimension  =  enterValue();
            System.out.println("enter amount of lines");
            int[][] array = OtherServices.fillingArray(dimension);
            OtherServices.printArray(array);
            MaxElement maxElements = new MaxElement();
            MinElement minElements = new MinElement();
            SumOfElements sumOfElements = new SumOfElements();
            System.out.println("\n\t enter 1 - 3:\n" +
                    "1 - в порядке возрастания сумм элементов строк\n" +
                    "2 - в порядке возрастания максимальных элементов строк\n" +
                    "3 - в порядке возрастания минимальных элементов строк ");
            int x = enterValue();
            switch (x){
                case 1 : BubbleSort.bubbleSort(array, sumOfElements, true);
                break;
                case 2:  BubbleSort.bubbleSort(array, maxElements, true);
                break;
                case 3:  BubbleSort.bubbleSort(array, minElements, true);
                break;
                default: break;
            }
            System.out.println(Arrays.deepToString(array));

        } catch (NullArrayException | ArraySizeException e) {
            System.err.println(e);
        }
    }
}
