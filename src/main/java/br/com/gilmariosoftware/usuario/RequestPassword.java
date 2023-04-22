package br.com.gilmariosoftware.usuario;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
@Builder
public class RequestPassword {

    private Long id;
    private String password;
}
