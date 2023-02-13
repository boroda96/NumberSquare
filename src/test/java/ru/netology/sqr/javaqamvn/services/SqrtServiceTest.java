package ru.netology.sqr.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import ru.netology.javaqa.javaqamvn.services.SqrtService;

public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void rangeCalc(int expected, int minimum, int maximum) {
        SqrtService service = new SqrtService();
        int actual = service.calcSqrt(minimum, maximum);
        Assertions.assertEquals(expected, actual);
    }

}
