package br.com.truesystem.truefinanceiro.fatura;

import br.com.truesystem.truefinanceiro.core.generic.GenericEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author gilmario
 */
@Entity
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

    public FaturaInfo() {
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public BigDecimal getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(BigDecimal valorDevido) {
        this.valorDevido = valorDevido;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

}
