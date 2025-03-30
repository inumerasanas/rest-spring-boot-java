package inumerasanas.com.github.rest_sprint_boot_java.controllers;


import inumerasanas.com.github.rest_sprint_boot_java.exception.UnsupportedMathOperationException;
import inumerasanas.com.github.rest_sprint_boot_java.math.SimpleMath;
import inumerasanas.com.github.rest_sprint_boot_java.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    //http:localhost:8080/math/sum/3/5
    @RequestMapping ("/sum/{numberOne}/{numberTwo}")
    public double sum (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception  {
        if (!NumberConverter.isNumeric(numberOne)  || !NumberConverter.isNumeric((numberTwo)))
            throw  new UnsupportedMathOperationException("Por favor insira um número válido!");
        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }


    //http:localhost:8080/math/subtraction/3/5
    @RequestMapping ("/subtraction/{numberOne}/{numberTwo}")
    public double subtraction (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception  {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric((numberTwo)))
            throw  new UnsupportedMathOperationException("Por favor insira um número válido!");
        return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    //http:localhost:8080/math/division/3/5
    @RequestMapping ("/division/{numberOne}/{numberTwo}")
    public double division (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric((numberTwo)))
            throw new UnsupportedMathOperationException("Por favor insira um numero válido!");
        return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    //http:localhost:8080/math/multiplication/3/5
    @RequestMapping ("/multiplication/{numberOne}/{numberTwo}")
    public double multiplication (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric((numberTwo)))
            throw new UnsupportedMathOperationException("Por favor insira um numero válido!");
        return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    //http:localhost:8080/math/mean/3/5
    @RequestMapping ("/mean/{numberOne}/{numberTwo}")
    public double mean (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception{
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric((numberTwo)))
            throw new UnsupportedMathOperationException("Por favor insira um numero válido!");
        return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    //http:localhost:8080/math/squareroot/64
    @RequestMapping ("/squareroot/{numberOne}")
    public double squareroot (
            @PathVariable("numberOne") String numberOne
    )throws Exception{
        if (!NumberConverter.isNumeric(numberOne))
            throw new UnsupportedMathOperationException("Por favor insira um numero válido!");
        return math.squareroot(NumberConverter.convertToDouble(numberOne));
    }



}
