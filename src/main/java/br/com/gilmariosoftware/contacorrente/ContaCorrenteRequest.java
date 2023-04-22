package br.com.gilmariosoftware.contacorrente;

import br.com.gilmariosoftware.generic.GenericRequest;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class ContaCorrenteRequest extends GenericRequest {

    private String nome;
    private BigDecimal saldo;

}
