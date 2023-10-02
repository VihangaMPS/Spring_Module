package lk.ijse.spring.advisor;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@CrossOrigin
@RestControllerAdvice
public class AppWiderExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ResponseUtil exceptionHandler(Exception e){
        return new  ResponseUtil(500,e.getMessage(),null);

    }
}
