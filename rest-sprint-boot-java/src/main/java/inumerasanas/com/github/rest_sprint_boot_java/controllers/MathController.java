package inumerasanas.com.github.rest_sprint_boot_java.controllers;


import inumerasanas.com.github.rest_sprint_boot_java.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    //http:localhost:8080/math/sum/3/5
    @RequestMapping ("/sum/{numberOne}/{numberTwo}")
    public double sum (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception  {
        if (!isNumeric(numberOne)  || !isNumeric((numberTwo)))
            throw  new UnsupportedMathOperationException("Por favor insira um número válido!");
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }


    //http:localhost:8080/math/subtraction/3/5
    @RequestMapping ("/subtraction/{numberOne}/{numberTwo}")
    public double subtraction (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception  {
        if (!isNumeric(numberOne) || !isNumeric((numberTwo)))
            throw  new UnsupportedMathOperationException("Por favor insira um número válido!");
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    //http:localhost:8080/math/division/3/5
    @RequestMapping ("/division/{numberOne}/{numberTwo}")
    public double division (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception{
        if (!isNumeric(numberOne) || !isNumeric((numberTwo)))
            throw new UnsupportedMathOperationException("Por favor insira um numero válido!");
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    //http:localhost:8080/math/multiplication/3/5
    @RequestMapping ("/multiplication/{numberOne}/{numberTwo}")
    public double multiplication (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception{
        if (!isNumeric(numberOne) || !isNumeric((numberTwo)))
            throw new UnsupportedMathOperationException("Por favor insira um numero válido!");
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    //http:localhost:8080/math/mean/3/5
    @RequestMapping ("/mean/{numberOne}/{numberTwo}")
    public double mean (
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    )throws Exception{
        if (!isNumeric(numberOne) || !isNumeric((numberTwo)))
            throw new UnsupportedMathOperationException("Por favor insira um numero válido!");
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    //http:localhost:8080/math/squareroot/64
    @RequestMapping ("/squareroot/{numberOne}")
    public double squareroot (
            @PathVariable("numberOne") String numberOne
    )throws Exception{
        if (!isNumeric(numberOne))
            throw new UnsupportedMathOperationException("Por favor insira um numero válido!");
        return Math.sqrt(convertToDouble(numberOne));
    }


    private double convertToDouble(String strNumber) throws IllegalArgumentException {

        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperationException("Por favor insira um número válido!");
        String number = strNumber.replace(",", "."); //Trocar virgula por ponto
        return Double.parseDouble(number);

    }

    private boolean isNumeric (String strNumber){
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); //Trocar virgula por ponto
        return (number.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
}
