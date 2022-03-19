package io.codelex.oop.imperialtometric;

import java.math.BigDecimal;

public class MilesToKilometers extends UnitConverter {

    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal(1.609344);
    }

}
