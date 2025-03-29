package inumerasanas.com.github.rest_sprint_boot_java.controllers;


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
    ) {
        if (!isNumeric(numberOne) || !isNumeric((numberTwo))) throw  new IllegalArgumentException();
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    private double convertToDouble(String strNumber) throws IllegalArgumentException {

        if (strNumber == null || strNumber.isEmpty()) throw new IllegalArgumentException();
        String number = strNumber.replace(",", "."); //Trocar virgula por ponto
        return Double.parseDouble(number);

    }

    private boolean isNumeric (String strNumber){
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); //Trocar virgula por ponto
        return (number.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
    //http:localhost:8080/math/subtraction/3/5
    //http:localhost:8080/math/division/3/5


}
