package br.com.gilmariosoftware.movimento;

import br.com.gilmariosoftware.contacorrente.ContaCorrente;
import br.com.gilmariosoftware.generic.GenericEntity;
import br.com.gilmariosoftware.usuario.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
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
    @NotNull
    @Column(length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusMovimentoFinanceiro statusMovimento;

}
