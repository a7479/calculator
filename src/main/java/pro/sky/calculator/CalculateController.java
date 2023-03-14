package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calculator")
public class CalculateController {
        private final CalculateService calculateService;

        public CalculateController (CalculateService calculateService) {
            this.calculateService=calculateService;
        }
        @GetMapping()
        public String calculator() {
            return calculateService.calculator();
        }
        @GetMapping(path = "/plus")
        public String plus(@RequestParam("num1")int num1,@RequestParam("num2")int num2) {
            return num1+"+"+num2+"="+calculateService.plus(num1,num2);//?num1=5&num2=5
        }
}
