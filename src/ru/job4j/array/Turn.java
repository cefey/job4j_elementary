package ru.job4j.array;

import org.w3c.dom.ls.LSOutput;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int n = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[n - i];
            array[n - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        int[] arr2 = new int[10];
        System.out.println("Ввели массив ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        arr2 = back(arr);
        System.out.println();
        System.out.println("На выходе получили ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
