package ru.mmm.array;


public class BubbleSort {


    public int[] sort(int[] array) {



            for(int i = array.length-1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    int result;
                    result = array[j];

                    array[j] = array[j + 1];
                    array[j + 1] = result;

                }

            }

        return array;
    }
}

