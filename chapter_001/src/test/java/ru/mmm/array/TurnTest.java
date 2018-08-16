package ru.mmm.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = turner.turn(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArray() {
        Turn turner = new Turn();
        int[] input = new int[]{3, 9, 5, 4, 8};
        int[] result = turner.turn(input);
        int[] expect = new int[]{8, 4, 5, 9, 3};
        assertThat(result, is(expect));
    }
}



