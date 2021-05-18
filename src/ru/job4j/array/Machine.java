package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int oddMoney = money - price; //сдача
        int size = 0; //количество монет
        for (int i = 0; i < coins.length; i++) {
            while (oddMoney - coins[i] >= 0) {
                rsl[size] = coins[i];
                oddMoney = oddMoney - coins[i];
                size++;

            }
        }
        return Arrays.copyOf(rsl, size);
    }
}