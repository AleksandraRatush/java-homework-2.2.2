package ru.netology.ratush222;

public class Main {


    public static void main(String[] args) {
        BmiService service = new BmiService();
        short weight = 61;
        float  height = 1.68f;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }

}
