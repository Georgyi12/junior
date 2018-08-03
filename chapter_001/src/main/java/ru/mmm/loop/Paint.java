package ru.mmm.loop;

/**
 * @author Georgyi Nishnianidze (mailto:parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}