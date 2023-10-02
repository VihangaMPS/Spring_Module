package lk.ijse.spring.advisor;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@CrossOrigin
@RestControllerAdvice
public class AppWiderExceptionHandler {

   /* @ExceptionHandler({Exception.class})
    public ResponseEntity exceptionHandler(Exception e){
        return  new ResponseEntity(new  ResponseUtil(500,e.getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
  //      return new  ResponseUtil(500,e.getMessage(),null);

    }*/

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    public ResponseUtil exceptionHandler(Exception e){
        return new  ResponseUtil(500,e.getMessage(),null);

    }
}
