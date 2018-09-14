package ru.mmm.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++)
            if (data[0][0] != data[i][i]) {

                for (int j = 0; j < data.length; j++)
                    if (data[0][data.length - 1] != data[j][data.length - 1 - j]) {
                        result = false;
                        break;
                    }

            }
            return result;
        }
    }





