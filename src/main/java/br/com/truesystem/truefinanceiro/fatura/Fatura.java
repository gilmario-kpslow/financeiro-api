package br.com.truesystem.truefinanceiro.fatura;

import br.com.truesystem.truefinanceiro.core.generic.GenericEntity;
import br.com.truesystem.truefinanceiro.usuario.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author gilmario
 */
@Entity
public class Fatura extends GenericEntity implements Serializable {

    @JoinColumn(referencedColumnName = "id", name = "usuario_id", nullable = false)
    @NotNull
    @ManyToOne
    private Usuario usuario;
    @Column(length = 255, nullable = false)
    private LocalDate diaVencimento;
    @Column(length = 255, nullable = false)
    @NotBlank
    private String nome;
    @Column(scale = 2, precision = 15, nullable = true)
    private BigDecimal limite;
    @Column(scale = 2, precision = 15, nullable = true)
    private BigDecimal limiteUtilizado;

    public Fatura() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(LocalDate diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public BigDecimal getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(BigDecimal limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
