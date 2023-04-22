package br.com.gilmariosoftware.seguranca;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class LoginRequest {

    private String username;
    private String password;
}
