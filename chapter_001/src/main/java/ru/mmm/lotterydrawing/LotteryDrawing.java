package ru.mmm.lotterydrawing;

import java.util.*;

/**
  * Эта программа демонстрирует манипуляции с массивами.
  * @ version 1. 2018.04.07
  * @ author Giorgyi Nishnianidze
  */

 public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Число номеров?");
        int k = in.nextInt();

        System.out.print("Максимальный номер?");
        int n = in.nextInt();

        // заполнение массива числами 1 2 3 . . . n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
            // Выбор k номеров и запись их в другой массив
            int[] result = new int[k];

            for (int i = 0; i < result.length; i++) {

                // Генерация случайного индекса между 0 и n - 1
                int r = (int) (Math.random() * n);

                // Выбор случайного элемента
                numbers[r] = numbers[n - 1];
                n--;

            }
            // Вывод сортированного массива
            Arrays.sort(result);
            System.out.println("Попробуйте такую комбинацию , и станете богатым!");
            for (int r : result)
                System.out.println(r);

        }

    }
