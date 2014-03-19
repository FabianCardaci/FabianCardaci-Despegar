package com.despegar.hf.echo.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.despegar.hf.calculator.service.Calculator;

@Controller
public class CalculatorController {

    // Comentario modificado

    private Calculator calculatorService;

    @RequestMapping(value = "/add/{t1}/{t2}", method = RequestMethod.GET)
    public ResponseEntity<String> add(@PathVariable("t1") BigDecimal t1, @PathVariable("t2") BigDecimal t2) {
        BigDecimal result = this.calculatorService.add(t1, t2);
        return new ResponseEntity<String>(result.toString(), HttpStatus.OK);
    }

    @RequestMapping(value = "/subtract/{t1}/{t2}", method = RequestMethod.GET)
    public ResponseEntity<String> subtract(@PathVariable("t1") BigDecimal t1, @PathVariable("t2") BigDecimal t2) {
        BigDecimal result = this.calculatorService.subtract(t1, t2);
        return new ResponseEntity<String>(result.toString(), HttpStatus.OK);
    }

    @RequestMapping(value = "/multiply/{t1}/{t2}", method = RequestMethod.GET)
    public ResponseEntity<String> multiply(@PathVariable("t1") BigDecimal t1, @PathVariable("t2") BigDecimal t2) {
        BigDecimal result = this.calculatorService.multiply(t1, t2);
        return new ResponseEntity<String>(result.toString(), HttpStatus.OK);
    }

    @RequestMapping(value = "/divide/{t1}/{t2}", method = RequestMethod.GET)
    public ResponseEntity<String> divide(@PathVariable("t1") BigDecimal t1, @PathVariable("t2") BigDecimal t2) {
        BigDecimal result = this.calculatorService.divide(t1, t2);
        return new ResponseEntity<String>(result.toString(), HttpStatus.OK);
    }

    @RequestMapping(value = "/memoryStore/{value}/{t2}", method = RequestMethod.GET)
    public ResponseEntity<String> memoryStore(@PathVariable("value") BigDecimal value) {
        this.calculatorService.memoryStore(value);
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }

    @RequestMapping(value = "/memoryRead", method = RequestMethod.GET)
    public ResponseEntity<String> memoryRead() {
        BigDecimal result = this.calculatorService.memoryRead();
        return new ResponseEntity<String>(result.toString(), HttpStatus.OK);
    }

    @RequestMapping(value = "/memoryClear/{t1}/{t2}", method = RequestMethod.GET)
    public ResponseEntity<String> memoryClear(@PathVariable("t1") BigDecimal t1, @PathVariable("t2") BigDecimal t2) {
        this.calculatorService.memoryClear();
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }



    public Calculator getCalculatorService() {
        return this.calculatorService;
    }

    public void setCalculatorService(Calculator calculatorService) {
        this.calculatorService = calculatorService;
    }
}
