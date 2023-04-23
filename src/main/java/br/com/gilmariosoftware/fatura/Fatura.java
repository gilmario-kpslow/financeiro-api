package br.com.gilmariosoftware.fatura;

import br.com.gilmariosoftware.generic.GenericEntity;
import br.com.gilmariosoftware.usuario.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Fatura extends GenericEntity implements Serializable {

    @JoinColumn(referencedColumnName = "id", name = "usuario_id", nullable = false)
    @NotNull
    @ManyToOne
    private Usuario usuario;
    @Column(length = 255, nullable = false)
    private LocalDate diaVencimento;
    @Column(length = 255, nullable = false, unique = true)
    @NotBlank
    private String nome;
    @Column(scale = 2, precision = 15, nullable = true)
    private BigDecimal limite;
    @Column(scale = 2, precision = 15, nullable = true)
    private BigDecimal limiteUtilizado;

}
