package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int n = left.length - 1;
        //актуально, если массивы одинаковой длины. По заданию об этом нет инвормации
        for (int i = n; i >= 0; i--) {
            if (left[i] == right[i]) {
                return true;
            }
        }
        return false;
    }
}