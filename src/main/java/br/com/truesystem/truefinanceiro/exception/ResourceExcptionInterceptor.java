package br.com.truesystem.truefinanceiro.exception;

import javax.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author gilmario
 */
@ControllerAdvice
public class ResourceExcptionInterceptor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public final ResponseEntity<MensagemException> handleUserNotFoundException(ConstraintViolationException ex, WebRequest request) {
        MensagemException errorDetails = new MensagemException(ex.getMessage(), request.getDescription(false), StatusMensagem.ERRO);
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<MensagemException> exception(Exception ex, WebRequest request) {
        logger.trace(ex);
        MensagemException errorDetails = new MensagemException(ex.getMessage(), request.getDescription(false), StatusMensagem.ERRO);
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

//    @ExceptionHandler(Exception.class)
//    public final ResponseEntity<MensagemException> exception(Exception ex, WebRequest request) {
//        logger.trace(ex);
//        MensagemException errorDetails = new MensagemException(ex.getMessage(), request.getDescription(false), StatusMensagem.ERRO);
//        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
}
