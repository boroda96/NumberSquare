package ru.netology.sqr.javaqamvn.services;

public class SqrtService {

    public int calcSqrt(int minimum, int maximum) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minimum && i * i <= maximum) {
                number++;
            }

        }
        return number;
    }
}