package br.com.gilmariosoftware.generic;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author gilmario
 */
@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = false)
public class GenericEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, updatable = false)
    private LocalDate dataCadastro;
    @Column(nullable = false, updatable = false)
    private LocalTime horaCadastro;
    @Column(nullable = false)
    private LocalDate dataAtualizacao;
    @Column(nullable = false)
    private LocalTime horaAtualizacao;
    @Column(nullable = true, length = 20)
    @Enumerated(EnumType.STRING)
    private StatusEntity status;
    @Version
    private Integer version;

    @PrePersist
    protected void setCreateTime() {
        LocalTime hora = LocalTime.now();
        LocalDate data = LocalDate.now();

        setDataCadastro(data);
        setHoraCadastro(hora);

        setDataAtualizacao(data);
        setHoraAtualizacao(hora);
    }

    @PreUpdate
    protected void setUpdateTime() {
        LocalTime hora = LocalTime.now();
        LocalDate data = LocalDate.now();

        setDataAtualizacao(data);
        setHoraAtualizacao(hora);
    }

}
