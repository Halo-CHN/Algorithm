import algorithm.Fibonacci;
import algorithm.TowersOfHanoi;
import base.RAMTest;

import java.sql.Date;

public class Main {

    static {
        System.out.println("in main static block");
    }

    public static void main(String[] args) {

        new TowersOfHanoi().moveTower(6);
        //new RAMTest();

        //Date date = Date.valueOf("1946-01-01");
        //Date date1 = Date.valueOf("1964-01-01");
        //System.out.println(date1.compareTo(date1));
    }
}
