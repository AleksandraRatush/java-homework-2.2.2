package ru.netology.ratush222;


public class BmiService {

    public float calculate(short weight,  float height ) {
        return weight  / ( height * height);

    }
}
