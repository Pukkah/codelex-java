package io.codelex.oop.imperialtometric;

import java.math.BigDecimal;

public class CentimetersToInches extends UnitConverter {

    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal(0.393700787);
    }

}
