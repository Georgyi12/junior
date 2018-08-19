package ru.mmm.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        //for (int index = 0; index < data.length; index++) {
        for (int index = 0; index < data.length; index++)
            if (data[index] == value[0]) {

                result = true;
            } else  {
                result = false;
            }
                    return result;
                }
            }







