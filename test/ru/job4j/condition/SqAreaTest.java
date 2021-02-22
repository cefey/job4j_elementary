package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenp8k2then2() {
        int expected = 2;
        int p = 8;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp8k3then3() {
        int expected = 3;
        int p = 8;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp10k4then4() {
        int expected = 4;
        int p = 10;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}