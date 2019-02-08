package test;

import exercise.Ex21;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;
import static org.junit.Assert.*;


public class Ex21Test {

    @org.junit.Test
    public void doConditional() {
        Ex21 ex21 = new Ex21();
        int[] arr = {2, 8, 12, 14, 18, 20, 33};
        int[] actual = ex21.doConditional(arr, 10, 20);
        int[] expected = {12, 14, 18, 20};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void randArray() {
        final int size = 4;
        final int min = 0;
        final int max = 9;

        Ex21 ex21 = new Ex21();
        int[] actual = ex21.randArray(size, min, max);
        assertEquals(actual.length, size);

        List<Integer> list = new ArrayList<>();
        Arrays.stream(actual).forEach(i -> list.add(i));
        assertThat(list, everyItem(greaterThanOrEqualTo(0)));
        assertThat(list, everyItem(lessThanOrEqualTo(9)));
    }


}