package br.com.gilmariosoftware.fatura.movimento;

import br.com.gilmariosoftware.fatura.FaturaInfo;
import br.com.gilmariosoftware.generic.GenericEntity;
import br.com.gilmariosoftware.movimento.MovimentoFinanceiro;
import java.io.Serializable;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class MovimentoFatura extends GenericEntity implements Serializable {

    @JoinColumn(referencedColumnName = "id", name = "fatura_info_id", nullable = true)
    @ManyToOne
    private FaturaInfo fatura;
    @JoinColumn(referencedColumnName = "id", name = "movimento_id", nullable = true)
    @ManyToOne
    private MovimentoFinanceiro movimentoFinanceiro;

}
