package ru.mmm.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
         {
            for (int index = 0; index < data.length; index++)
             if (data[0] != data[index]) {
                result = false;
                break;
            }
        }

            return result;
    }
    }
