package br.com.gilmariosoftware.generic;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gilmario
 */
@Getter
@Setter
public abstract class GenericResponse {

    private Long id;
    private LocalDate dataCadastro;
    private LocalTime horaCadastro;
    private LocalDate dataAtualizacao;
    private LocalTime horaAtualizacao;
    private StatusEntity status;
    private Integer version;

}
