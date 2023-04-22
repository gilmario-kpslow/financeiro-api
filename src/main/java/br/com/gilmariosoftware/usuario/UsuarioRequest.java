package br.com.gilmariosoftware.usuario;

import br.com.gilmariosoftware.generic.GenericRequest;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class UsuarioRequest extends GenericRequest {

    private String username;
    private String password;
    private String nome;
    private String email;

}
