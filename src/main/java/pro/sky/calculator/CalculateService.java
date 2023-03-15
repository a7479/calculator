package pro.sky.calculator;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import org.springframework.stereotype.Service;

    @Service
    public class CalculateService {
        public String calculator() {
            return "<b>Добро пожаловать в калькулятор</b>";

        }



        public int plus(int num1, int num2) {

            return (num1 + num2);
        }
        public int minus(int num1, int num2) {

            return (num1 - num2);
        }
        public int multiply(int num1, int num2) {

            return (num1 * num2);
        }
        public int divide(int num1, int num2) {

            return (num1 / num2);
        }
    }



