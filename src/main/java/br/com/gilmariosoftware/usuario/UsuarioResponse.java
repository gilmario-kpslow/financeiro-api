package br.com.gilmariosoftware.usuario;

import br.com.gilmariosoftware.generic.GenericResponse;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class UsuarioResponse extends GenericResponse {

    private Long id;
    private String nome;
    private String email;
    private String username;
}
