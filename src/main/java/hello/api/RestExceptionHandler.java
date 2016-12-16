package hello.api;

import hello.dtos.ErrorDto;
import hello.exceptions.NotFoundException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by guojing on 2016/12/16.
 */
@ControllerAdvice(basePackages = "hello.api")
public class RestExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public HttpEntity<?> handleNotFoundException(Exception e){
        return new ResponseEntity<ErrorDto>(
                createErrorBody(
                        HttpStatus.NOT_FOUND.value(),
                        e.getMessage()),
                HttpStatus.NOT_FOUND);
    }

    private ErrorDto createErrorBody(int code, String msg){
        ErrorDto error = new ErrorDto(code, msg);
        return error;
    }

    @ExceptionHandler(Exception.class)
    public HttpEntity<?> handleException(Exception e) {
        return new ResponseEntity<ErrorDto>(
                createErrorBody(
                        HttpStatus.INTERNAL_SERVER_ERROR.value(),
                        e.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
