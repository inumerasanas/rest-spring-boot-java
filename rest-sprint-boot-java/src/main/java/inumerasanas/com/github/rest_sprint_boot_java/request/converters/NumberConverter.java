package inumerasanas.com.github.rest_sprint_boot_java.request.converters;

import inumerasanas.com.github.rest_sprint_boot_java.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {

        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperationException("Por favor insira um número válido!");
        String number = strNumber.replace(",", "."); //Trocar virgula por ponto
        return Double.parseDouble(number);

    }

    public static boolean isNumeric (String strNumber){
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); //Trocar virgula por ponto
        return (number.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
}
