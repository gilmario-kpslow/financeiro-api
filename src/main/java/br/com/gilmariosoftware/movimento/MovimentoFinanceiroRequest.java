package br.com.gilmariosoftware.movimento;

import br.com.gilmariosoftware.contacorrente.Conta;
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
public class MovimentoFinanceiroRequest extends GenericRequest {

    private String descricao;
    private BigDecimal valorOriginal;
    private BigDecimal valorPago;
    private TipoMovimento tipoMovimento;
    private Conta contaCorrente;

}
