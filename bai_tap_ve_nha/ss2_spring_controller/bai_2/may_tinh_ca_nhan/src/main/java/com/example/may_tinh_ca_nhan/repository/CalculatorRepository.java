package com.example.may_tinh_ca_nhan.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorRepository implements ICalculatorRepository {
    @Override
    public String calculator(String calculator, double num1, double num2) {
        String result;
        switch (calculator) {
            case "addition":
                result = String.valueOf(num1 + num2);
                break;
            case "subtraction":
                result = String.valueOf(num1 - num2);
                break;
            case "multiplication":
                result= String.valueOf(num1 * num2);
                break;
            case "division":
                result= String.valueOf(num1/num2);
                if (num2 ==0){
                   return "Khong the chia cho 0";
                }
                break;
            default:
                return "khong hop le";
        }
        return result;
    }
}
