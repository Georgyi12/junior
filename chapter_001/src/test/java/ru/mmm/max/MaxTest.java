package ru.mmm.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {



    @Test
    public void  max() {
        Max maxim = new Max();
        int result = maxim.max ( 1,7,2);
        assertThat (result, is( 7));



    }

}


