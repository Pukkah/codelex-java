package io.codelex.oop.imperialtometric;

import java.math.BigDecimal;

public class InchesToCentimeters extends UnitConverter {

    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal(2.54);
    }

}
