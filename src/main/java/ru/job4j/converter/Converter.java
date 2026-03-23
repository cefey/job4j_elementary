package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float inputRuble = 140;
        float euroOutput = Converter.rubleToEuro(inputRuble);
        float expectedEuro = 2;
        boolean passed = expectedEuro == euroOutput;
        System.out.println("140 rubles are 2. Test result : " + passed);
        inputRuble = 180;
        float dollarOutput = rubleToDollar(inputRuble);
        float expectedDollars = 3;
        passed = expectedDollars == dollarOutput;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}