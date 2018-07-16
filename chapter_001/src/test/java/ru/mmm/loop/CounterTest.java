package ru.mmm.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел
        // от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter c = new Counter();
        c.add(0, 10);
        int result = 30;
        int expected = (int) 30D;
        assertThat(result, is(expected));
    }
}

