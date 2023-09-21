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
public class ContaCorrenteService extends ServiceGeneric<Conta, ContaCorrenteResponse, ContaCorrenteRequest> {

    @Inject
    ContaCorrenteRepository repository;

    @Override
    protected JpaRepository getRepository() {
        return repository;
    }

    @Override
    public Class<Conta> getClassEntity() {
        return Conta.class;
    }

    @Override
    public Class<ContaCorrenteResponse> getClassResponse() {
        return ContaCorrenteResponse.class;
    }

    @Override
    protected Optional<ContaCorrenteResponse> toResponse(Conta t) {
        return super.toResponse(t);
    }

}
