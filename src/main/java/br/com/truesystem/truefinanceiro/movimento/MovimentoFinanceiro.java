package br.com.truesystem.truefinanceiro.movimento;

import br.com.truesystem.truefinanceiro.contacorrente.ContaCorrente;
import br.com.truesystem.truefinanceiro.core.generic.GenericEntity;
import br.com.truesystem.truefinanceiro.usuario.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author gilmario
 */
@Entity
public class MovimentoFinanceiro extends GenericEntity implements Serializable {

    @Column(length = 255, nullable = false)
    @NotBlank
    private String descricao;
    @Column(scale = 2, precision = 15, nullable = true)
    @NotNull
    private BigDecimal valorOriginal;
    @Column(scale = 2, precision = 15, nullable = true)
    private BigDecimal valorPago;
    @NotNull
    @Column(nullable = false)
    private LocalDate dataCadastro;
    @NotNull
    @Column(nullable = false)
    private LocalTime horaCadastro;
    @Column(nullable = true)
    private LocalDate dataPagamento;
    @Column(nullable = true)
    private LocalTime horaPagamento;
    @JoinColumn(referencedColumnName = "id", name = "usuario_id", nullable = false)
    @NotNull
    @ManyToOne
    private Usuario usuario;
    @Enumerated(EnumType.STRING)
    @Column(length = 30, nullable = false)
    @NotNull
    private TipoMovimento tipoMovimento;
    @JoinColumn(referencedColumnName = "id", name = "conta_corrente_id", nullable = false)
    @NotNull
    @ManyToOne
    private ContaCorrente contaCorrente;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(BigDecimal valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalTime getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(LocalTime horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalTime getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(LocalTime horaPagamento) {
        this.horaPagamento = horaPagamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

}
