package br.com.gilmariosoftware.contacorrente;

import br.com.gilmariosoftware.generic.GenericResponse;
import br.com.gilmariosoftware.usuario.UsuarioResponse;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class ContaCorrenteResponse extends GenericResponse {

    private Long id;
    private String nome;
    private UsuarioResponse usuario;
    private BigDecimal saldo;
}
