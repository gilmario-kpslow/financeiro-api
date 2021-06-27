package br.com.truesystem.truefinanceiro.contacorrente;

import br.com.truesystem.truefinanceiro.core.generic.GenericEntity;
import br.com.truesystem.truefinanceiro.usuario.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
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
public class ContaCorrente extends GenericEntity implements Serializable {

    @JoinColumn(referencedColumnName = "id", name = "usuario_id", nullable = false)
    @NotNull
    @ManyToOne
    private Usuario usuario;
    @Column(length = 255, nullable = false)
    @NotBlank
    private String nome;
    @Column(scale = 2, precision = 15, nullable = true)
    private BigDecimal saldo;

    public ContaCorrente() {
        saldo = BigDecimal.ZERO;
    }

    public ContaCorrente(Long id) {
        super(id);
        saldo = BigDecimal.ZERO;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
