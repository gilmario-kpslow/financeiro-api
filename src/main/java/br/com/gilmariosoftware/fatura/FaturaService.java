package br.com.gilmariosoftware.fatura;

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
public class FaturaService extends ServiceGeneric<Fatura, FaturaResponse, FaturaRequest> {

    @Inject
    FaturaRepository repository;

    @Override
    protected JpaRepository getRepository() {
        return repository;
    }

    @Override
    public Optional<FaturaResponse> salvar(FaturaRequest request) {
        Fatura fatura = toEntity(request);
        fatura.setUsuario(getUsuarioLogado().orElseThrow());
        return toResponse(repository.save(fatura));
    }

    @Override
    public Class<Fatura> getClassEntity() {
        return Fatura.class;
    }

    @Override
    public Class<FaturaResponse> getClassResponse() {
        return FaturaResponse.class;
    }

    @Override
    public List<FaturaResponse> listarTodos() {
        return repository.findByUsuario(getUsuarioLogado().orElseThrow()).stream().map(this::toResponse).map(a -> a.get()).toList();
    }

}
