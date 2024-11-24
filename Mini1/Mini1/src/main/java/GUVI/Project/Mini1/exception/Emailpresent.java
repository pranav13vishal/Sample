package GUVI.Project.Mini1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class Emailpresent extends RuntimeException{
    private String message;

    public Emailpresent(String message) {
       super(message);
    }
}
