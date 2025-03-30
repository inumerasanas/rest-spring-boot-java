package inumerasanas.com.github.rest_sprint_boot_java.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {
    //classe Record funciona apenas para armazenar valores
    //aqui o erro será retornado em json


}
