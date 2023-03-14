package pro.sky.calculator;

import org.springframework.stereotype.Service;

    @Service
    public class CalculateService {
        public String calculator() {
            return "<b>Добро пожаловать в калькулятор</b>";
        }

        public int plus(int num1,int num2) {
            return (num1+num2);
        }
    }

