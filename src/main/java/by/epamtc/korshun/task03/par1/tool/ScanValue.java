package by.epamtc.korshun.task03.par1.tool;

import java.util.Scanner;

public class ScanValue {

    public  static  int enterInteger(){
        Scanner scanner = new Scanner(System.in);
        int number;
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        number = scanner.nextInt();
        return  number;
    }
}
