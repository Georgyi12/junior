package ru.mmm.max;

public class Max {


    public int max(int first, int second)
    {

        return first > second ? first : second;
    }


    public int max(int first, int second, int third){


        int temp = this.max(first, second);

        temp = this.max(first, third);

        temp = this.max(second, third);


        return temp;

    }
}

