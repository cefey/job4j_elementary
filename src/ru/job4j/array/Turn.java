package ru.job4j.array;

import org.w3c.dom.ls.LSOutput;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int n = array.length - 1;  //номер последнего элемента в массиве
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[n - i];
            array[n - i] = temp;
        }
        return array;
    }
}
