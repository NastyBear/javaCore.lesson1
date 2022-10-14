package lesson3.exercise1;

import java.util.Arrays;

public class Run {

    static Integer[] array={1,2,3,4,5};

    public static void main(String[] args) {
        ArrData<Integer> arrData = new ArrData<>();
        System.out.println(Arrays.toString(arrData.ArrData(array,2,3)));
    }
}
