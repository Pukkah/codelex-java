package io.codelex.oop.imperialtometric;

import java.math.BigDecimal;

public class KilometersToMiles extends UnitConverter {

    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal(0.621371192);
    }

}
