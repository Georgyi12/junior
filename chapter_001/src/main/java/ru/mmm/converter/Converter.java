package ru.mmm.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value)
    {
        return value/70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value/60;

    }

    /**
     * Конвертируем евро в рубли.
     * @param value рубли.
     * @return рубль
     */

    public int euroToRouble(int value) {
         return value * 70;
    }

    /**
     * Конвертируем доллар в рубли.
     * @param value рубли.
     * @return рубль
     */
    public int dollarToRouble(int value) {
            return value * 60;
    }

}

