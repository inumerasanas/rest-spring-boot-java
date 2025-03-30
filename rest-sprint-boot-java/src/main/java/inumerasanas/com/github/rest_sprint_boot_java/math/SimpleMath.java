package inumerasanas.com.github.rest_sprint_boot_java.math;

import inumerasanas.com.github.rest_sprint_boot_java.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {


    public Double sum (Double  numberOne, Double numberTwo)  {
        return numberOne + numberTwo;
    }

    //http:localhost:8080/math/subtraction/3/5
    public Double subtraction (Double  numberOne, Double numberTwo
    )  {
        return numberOne - numberTwo;
    }

    //http:localhost:8080/math/division/3/5
    public Double division (Double  numberOne, Double numberTwo
    )  {
        return numberOne / numberTwo;
    }

    //http:localhost:8080/math/multiplication/3/5
    public Double multiplication (Double  numberOne, Double numberTwo
    )  {
        return numberOne * numberTwo;
    }

    //http:localhost:8080/math/mean/3/5
    public Double mean (Double  numberOne, Double numberTwo
    )  {
        return (numberOne + numberTwo)/2;
    }

    //http:localhost:8080/math/squareroot/64
    public Double squareroot (Double  numberOne)  {
        return Math.sqrt(numberOne);
    }


}
