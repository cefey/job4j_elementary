package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Большее из двух чисел " + Max.max(3, 6));
   }

}
