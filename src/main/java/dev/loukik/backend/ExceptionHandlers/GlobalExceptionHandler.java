package dev.loukik.backend.ExceptionHandlers;

import dev.loukik.backend.DTO.ExceptionDto;
import dev.loukik.backend.Exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException exp) {
        ExceptionDto dto = new ExceptionDto();
        dto.setResolution(exp.getMessage());
        dto.setMessage("Invalid productId " + exp.getId() + " passed");
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }
}
