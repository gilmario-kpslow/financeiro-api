package br.com.gilmariosoftware.movimento;

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
public class MovimentoFinanceiroService extends ServiceGeneric<MovimentoFinanceiro, MovimentoFinanceiroResponse> {

    @Inject
    MovimentoFinanceiroRepository repository;

    @Override
    protected JpaRepository getRepository() {
        return repository;
    }

    @Override
    public Class<MovimentoFinanceiro> getClassEntity() {
        return MovimentoFinanceiro.class;
    }

    @Override
    public Class<MovimentoFinanceiroResponse> getClassResponse() {
        return MovimentoFinanceiroResponse.class;
    }

    @Override
    public List<MovimentoFinanceiroResponse> listarTodos() {
        return repository.findByUsuario(getUsuarioLogado().orElseThrow()).stream().map(this::toResponse).map(Optional::get).toList();
    }

    public List<MovimentoFinanceiroResponse> getDespesas() {
        return repository.findByTipoMovimentoAndUsuario(TipoMovimento.DESPESA, getUsuarioLogado().orElseThrow()).stream().map(this::toResponse).map(Optional::get).toList();
    }

    public List<MovimentoFinanceiroResponse> getReceitas() {
        return repository.findByTipoMovimentoAndUsuario(TipoMovimento.RECEITA, getUsuarioLogado().orElseThrow()).stream().map(this::toResponse).map(Optional::get).toList();
    }
}
