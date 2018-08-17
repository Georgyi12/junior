package ru.mmm.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index < data.length; index++) {
            if (data[0] == data[index]) {
                result = true;
            }
            else if (data[0] != data[index]) {
                result = false;
                break;
            }
        }

            return result;
    }
    }
