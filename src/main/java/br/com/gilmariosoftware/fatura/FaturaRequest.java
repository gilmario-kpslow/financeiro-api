package br.com.gilmariosoftware.fatura;

import br.com.gilmariosoftware.generic.GenericRequest;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class FaturaRequest extends GenericRequest {

    private LocalDate diaVencimento;
    private String nome;
    private BigDecimal limite;

}
