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

    public int back(int[] array) {
        int rst = 0;
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;

            if ((array[index] % 2) == 0) {

                rst = rst + array[index];
            }

        }
        return rst;
    }
}