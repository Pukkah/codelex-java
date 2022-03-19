package io.codelex.oop;

import io.codelex.oop.imperialtometric.ConversionType;
import io.codelex.oop.imperialtometric.MeasurementConverter;

import java.math.BigDecimal;

public class ImperialToMetricTest {
    public static void main(String[] args) {
        BigDecimal valueToConvert = new BigDecimal(185);

        BigDecimal result = MeasurementConverter.convert(ConversionType.CENTIMETERS_TO_INCHES, valueToConvert);

        System.out.println(result);

    }

}
