package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final CalculateService calculateService;


    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping()
    public String calculator() {

        return calculateService.calculator();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) String num1, @RequestParam(required = false) String num2) {
        if (num1 == null || num2 == null) {
            return "Нужно ввести значение";
        }
        return num1 + "+" + num2 + "=" + calculateService.plus(Integer.parseInt(num1), Integer.parseInt(num2));//?num1=5&num2=5}

    }
            @GetMapping(path = "/minus")
        public String minus(@RequestParam(required = false)String num1,@RequestParam(required = false)String num2) {
            if (num1 == null||num2 == null){
                        return   "Нужно ввести значение";
                } else {
                    return num1+"-"+num2+"="+calculateService.minus(Integer.parseInt(num1),Integer.parseInt(num2));//?num1=5&num2=5
                }
     }@GetMapping(path = "/multiply")
        public String multiply(@RequestParam(required = false)String num1,@RequestParam(required = false)String num2) {
            if (num1 == null||num2 == null){
                        return   "Нужно ввести значение";
                } else {
                    return num1+"*"+num2+"="+calculateService.multiply(Integer.parseInt(num1),Integer.parseInt(num2));//?num1=5&num2=5
                }
     }
     @GetMapping(path = "/divide")
        public String divide(@RequestParam(required = false)String num1,@RequestParam(required = false)String num2) {
            if (num1 == null||num2 == null){
                        return   "Нужно ввести значение";
            } else if (Integer.parseInt(num2) == 0) {
                            return "Делить на ноль нельзя";
                } else {
                    return num1+"/"+num2+"="+calculateService.divide(Integer.parseInt(num1),Integer.parseInt(num2));//?num1=5&num2=5
                }
     }

}

