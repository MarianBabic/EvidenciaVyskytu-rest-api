package sk.upjs.ics.evidenciavyskytu.rest.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
class UserHasDifferentIdException extends RuntimeException {

}
