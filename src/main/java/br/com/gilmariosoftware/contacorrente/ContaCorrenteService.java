package br.com.gilmariosoftware.contacorrente;

import br.com.gilmariosoftware.generic.ServiceGeneric;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gilmario
 */
@RequestScoped
public class ContaCorrenteService extends ServiceGeneric<ContaCorrente, ContaCorrenteResponse> {

    @Inject
    ContaCorrenteRepository repository;

    @Override
    protected JpaRepository getRepository() {
        return repository;
    }

    @Override
    public Class<ContaCorrente> getClassEntity() {
        return ContaCorrente.class;
    }

    @Override
    public Class<ContaCorrenteResponse> getClassResponse() {
        return ContaCorrenteResponse.class;
    }

    @Override
    protected Optional<ContaCorrenteResponse> toResponse(ContaCorrente t) {
        return super.toResponse(t);
    }

}
