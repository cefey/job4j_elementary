package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        if ((n == 0) || (n == 1)) {
            return 1;
        }
        result = 1;
        for (int i = 2; i <= n; i++) {
          result = result * i;
        }
        return result;
    }
}
