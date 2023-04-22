package br.com.gilmariosoftware.fatura;

import br.com.gilmariosoftware.generic.GenericResponse;
import br.com.gilmariosoftware.usuario.UsuarioResponse;
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
public class FaturaResponse extends GenericResponse {

    private Long id;
    private UsuarioResponse usuario;
    private LocalDate diaVencimento;
    private String nome;
    private BigDecimal limite;
    private BigDecimal limiteUtilizado;
}
