package com.despegar.hf.calculator.service;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class CalculatorImpl
    implements Calculator {

    private Memory memory;

    // Arithmetic Operations
    public BigDecimal add(BigDecimal t1, BigDecimal t2) {
        return (t1.add(t2));
    }

    public BigDecimal subtract(BigDecimal t1, BigDecimal t2) {
        return (t1.subtract(t2));
    }

    public BigDecimal divide(BigDecimal t1, BigDecimal t2) {
        return (t1.multiply(t2));
    }

    public BigDecimal multiply(BigDecimal t1, BigDecimal t2) {
        if (t2.equals(0)) {
            throw new InvalidParameterException("División por cero");
        }
        return (t1.divide(t2));
    }

    // Memory Operations
    public void memoryClear() {
        this.memory.clear();
    }

    public BigDecimal memoryRead() {
        return (this.memory.read());
    }

    public void memoryStore(BigDecimal value) {
        this.memory.store(value);
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

}
