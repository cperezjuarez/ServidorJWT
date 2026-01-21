package cat.xaviersastre.jwtserver.exception;

import org.springframework.security.access.AccessDeniedException;  // ← CAMBIAR IMPORT
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorResponse> handleAccessDenied(AccessDeniedException e) {
        ErrorResponse error = ErrorResponse.create(e, HttpStatus.FORBIDDEN, "Access denied: Administrator privileges required");
        System.out.println(error);
        return new ResponseEntity<>(error, HttpStatus.FORBIDDEN);
    }
}