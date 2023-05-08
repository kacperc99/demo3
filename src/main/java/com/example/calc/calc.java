package com.example.calc;

import static com.example.calc.resultbuilder.getResult;
import static com.example.calc.resultbuilder.getResultFromError;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calc.apiresult;


@RestController
@RequestMapping("/basic")
public class calc {

    @GetMapping("/add")
    public apiresult add(@RequestParam BigDecimal a, @RequestParam BigDecimal b ) {
        return getResult(a.add(b));
    }

    @GetMapping("/subtract")
    public apiresult subtract(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return getResult(a.subtract(b));
    }

    @GetMapping("/multiply")
    public apiresult multiply(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return getResult(a.multiply(b));
    }

    @GetMapping("/divide")
    public apiresult divide(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        if (b.equals(BigDecimal.ZERO)) {
            return getResultFromError("no division by null");
        }
        return getResult(a.divide(b, RoundingMode.HALF_EVEN));
    }
    @GetMapping("/fibbonacci")
    public apiresult divide(@RequestParam Integer a) {
        if (a.equals(BigDecimal.ZERO)) {
            return getResultFromError("can't do fibbonacci with 0");
        }
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for (int i = 2; i < a; ++i)
        {
            n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
        return getResult(n3);
    }

}
