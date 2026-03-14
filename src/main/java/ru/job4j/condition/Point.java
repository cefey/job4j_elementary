package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double d1 = x2 - x1;
        d1 = Math.pow(d1, 2);
        double d2 = y2 - y1;
        d2 = Math.pow(d2, 2);
        double result = Math.sqrt(d1 + d2);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 4, 2, 6);
        System.out.println("result (3, 4) to (2, 6 ) " + result);
    }
}