package io.codelex.oop.imperialtometric;

public enum ConversionType {
    METERS_TO_YARDS(new MetersToYardsConverter()),
    YARDS_TO_METERS(new YardsToMeters()),
    CENTIMETERS_TO_INCHES(new CentimetersToInches()),
    INCHES_TO_CENTIMETERS(new InchesToCentimeters()),
    KILOMETERS_TO_MILES(new KilometersToMiles()),
    MILES_TO_KILOMETERS(new MilesToKilometers());

    public final Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

}
