package br.com.gilmariosoftware.planocontas;

import br.com.gilmariosoftware.generic.GenericRequest;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class PlanoContasRequest extends GenericRequest {

    private String nome;
    private String descricao;

}
