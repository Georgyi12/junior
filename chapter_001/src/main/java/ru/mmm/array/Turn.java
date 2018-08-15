package ru.mmm.array;

public class Turn {


    public int[] turn(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }


    public int odd(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;

            int rst = 0;
            if (array.length % 2 != 0) {
                //int rst;
                //return array.length;
                rst = rst + array.length;
            }
        }
        return array.length;

    }
}