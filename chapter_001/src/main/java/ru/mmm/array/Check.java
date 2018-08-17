package ru.mmm.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == true) {
                result = true;
            }
            else if (data[index] == false) {
                result = false;
                break;
            }
        }

            return result;
    }
    }
