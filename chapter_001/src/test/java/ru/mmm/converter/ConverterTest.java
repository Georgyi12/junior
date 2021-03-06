package ru.mmm.converter;

import org.junit.Test;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(120);
        assertThat(result, is(2));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void when1DollarToRoubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarToRouble(1);
        assertThat(result, is(60));
    }

    @Test
    public void when1EuroToRoubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRouble(1);
        assertThat(result, is(70));
    }


}
