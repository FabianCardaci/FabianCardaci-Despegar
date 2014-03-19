package com.despegar.hf.calculator.config;

import org.springframework.context.annotation.Bean;

import com.despegar.hf.calculator.service.Calculator;
import com.despegar.hf.calculator.service.CalculatorImpl;
import com.despegar.hf.calculator.service.MemoryImpl;

public class CalculatorConfig {

    @Bean
    public Calculator calculatorService() {
        CalculatorImpl calculatorImpl = new CalculatorImpl();
        MemoryImpl memoryImpl = new MemoryImpl();
        calculatorImpl.setMemory(memoryImpl);
        return (calculatorImpl);
    }
}
