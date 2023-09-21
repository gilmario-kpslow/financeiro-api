package br.com.gilmariosoftware.planocontas;

import br.com.gilmariosoftware.generic.GenericResponse;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class PlanoContasResponse extends GenericResponse {

    private String descricao;
    private String nome;

}
