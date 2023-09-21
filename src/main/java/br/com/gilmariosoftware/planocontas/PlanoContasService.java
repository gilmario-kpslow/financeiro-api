package br.com.gilmariosoftware.planocontas;

import br.com.gilmariosoftware.generic.ServiceGeneric;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gilmario
 */
@RequestScoped
public class PlanoContasService extends ServiceGeneric<PlanoContas, PlanoContasResponse, PlanoContasRequest> {

    @Inject
    PlanoContasRepository repository;

    @Override
    protected JpaRepository getRepository() {
        return repository;
    }

    @Override
    public Class<PlanoContas> getClassEntity() {
        return PlanoContas.class;
    }

    @Override
    public Class<PlanoContasResponse> getClassResponse() {
        return PlanoContasResponse.class;
    }

    @Override
    public List<PlanoContasResponse> listarTodos() {
        return repository.findByUsuario(getUsuarioLogado().orElseThrow()).stream().map(this::toResponse).map(Optional::get).toList();
    }

}
