package com.despegar.hf.calculator.service;

import java.math.BigDecimal;

public class MemoryImpl
    implements Memory {

    BigDecimal buffer = new BigDecimal(0);

    public void clear() {
        this.buffer = null;
    }

    public BigDecimal read() {
        return (this.buffer);
    }

    public void store(BigDecimal value) {
        this.buffer = value;
    }



}
