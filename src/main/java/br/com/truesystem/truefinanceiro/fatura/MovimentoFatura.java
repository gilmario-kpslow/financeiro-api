package br.com.truesystem.truefinanceiro.fatura;

import br.com.truesystem.truefinanceiro.core.generic.GenericEntity;
import br.com.truesystem.truefinanceiro.movimento.MovimentoFinanceiro;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author gilmario
 */
@Entity
public class MovimentoFatura extends GenericEntity implements Serializable {

    @JoinColumn(referencedColumnName = "id", name = "fatura_info_id", nullable = true)
    @ManyToOne
    private FaturaInfo fatura;
    @JoinColumn(referencedColumnName = "id", name = "movimento_id", nullable = true)
    @ManyToOne
    private MovimentoFinanceiro movimentoFinanceiro;

    public FaturaInfo getFatura() {
        return fatura;
    }

    public void setFatura(FaturaInfo fatura) {
        this.fatura = fatura;
    }

    public MovimentoFinanceiro getMovimentoFinanceiro() {
        return movimentoFinanceiro;
    }

    public void setMovimentoFinanceiro(MovimentoFinanceiro movimentoFinanceiro) {
        this.movimentoFinanceiro = movimentoFinanceiro;
    }

}
