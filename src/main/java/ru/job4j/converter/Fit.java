package ru.job4j.converter;

public class Fit {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        short wheight = 168;
        double woman = womanWeight(wheight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 168 is " + woman);

    }

}
