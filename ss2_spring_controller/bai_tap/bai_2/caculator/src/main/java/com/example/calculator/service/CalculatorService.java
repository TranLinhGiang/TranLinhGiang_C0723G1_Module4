package com.example.calculator.service;

import com.example.calculator.repository.ICalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {
    @Autowired
    private ICalculatorRepository iCalculatorRepository;

    @Override
    public String calculator(String calculator, double num1, double num2) {
        return iCalculatorRepository.calculator(calculator, num1, num2);
    }
}
