package br.com.gilmariosoftware.fatura;

import br.com.gilmariosoftware.generic.GenericEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Cacheable
public class FaturaInfo extends GenericEntity implements Serializable {

    @JoinColumn(referencedColumnName = "id", name = "fatura_id", nullable = false)
    @ManyToOne
    @NotNull
    private Fatura fatura;
    @NotNull
    private LocalDate vencimento;
    @Column(nullable = true)
    private LocalDate dataPagamento;
    @Column(scale = 2, precision = 15, nullable = true)
    private BigDecimal valorDevido;
    @Column(scale = 2, precision = 15, nullable = true)
    private BigDecimal valorPago;

}
