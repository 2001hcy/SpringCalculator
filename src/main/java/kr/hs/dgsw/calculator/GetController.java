package kr.hs.dgsw.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @Autowired
    private CalculatorService calculatorService;
    @GetMapping("/calculate/{formula}")
    public String Calculate(@PathVariable String formula) throws Exception {
        return calculatorService.Calculate(formula);
    }
}
