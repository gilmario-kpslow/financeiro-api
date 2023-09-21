package br.com.gilmariosoftware.movimento;

import br.com.gilmariosoftware.contacorrente.Conta;
import br.com.gilmariosoftware.generic.GenericResponse;
import br.com.gilmariosoftware.usuario.Usuario;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public class MovimentoFinanceiroResponse extends GenericResponse {

    private String descricao;
    private BigDecimal valorOriginal;
    private BigDecimal valorPago;
    private Usuario usuario;
    private LocalDate dataPagamento;
    private LocalTime horaPagamento;
    private TipoMovimento tipoMovimento;
    private Conta contaCorrente;
    private StatusMovimentoFinanceiro statusMovimento;
}
