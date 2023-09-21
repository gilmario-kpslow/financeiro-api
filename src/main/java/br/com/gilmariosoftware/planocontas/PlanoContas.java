package br.com.gilmariosoftware.planocontas;

import br.com.gilmariosoftware.generic.GenericEntity;
import br.com.gilmariosoftware.usuario.Usuario;
import java.io.Serializable;
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
public class PlanoContas extends GenericEntity implements Serializable {

    @Column(length = 30, nullable = false)
    @NotBlank
    private String nome;
    @Column(length = 255, nullable = false)
    @NotBlank
    private String descricao;
    @JoinColumn(referencedColumnName = "id", name = "usuario_id", nullable = false)
    @NotNull
    @ManyToOne
    private Usuario usuario;

}
