package io.codelex.notes.day06.currencyconverter;

import java.math.BigDecimal;

public class CurrencyRate {

    private String code;
    private BigDecimal rate;

    public CurrencyRate(String code, BigDecimal rate) {
        this.code = code;
        this.rate = rate;
    }

    public String getCode(){
        return code;
    }

    public BigDecimal getRate(){
        return rate;
    }

    @Override
    public String toString() {
        return code + " " + rate.toString();
    }
}
