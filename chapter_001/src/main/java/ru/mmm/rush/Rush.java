package ru.mmm.rush;

import java.util.Scanner;


public class Rush {
    public static void main(String[] args)  {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //5
        int b = scanner.nextInt();//3
        int c = scanner.nextInt();//2


        if (a != b && a != c && b == c) {
            System.out.println(1);
        } else if ((b != a)  && (a == c)) {
            System.out.println(2);
        } else if (c != a  && a == b) {
            System.out.println(3);
        }
    }
}