package ru.mmm.loop;

public class Counter {

    public int add(int start, int finish    ) {

        double x = 0;
        int i = 0;
        for (i = 0; start <= finish; i++) {
            if (start % 2 == 0) {
                // x = 0;
                x = x + start;
            }
        }
      return (int) x;
    }
}