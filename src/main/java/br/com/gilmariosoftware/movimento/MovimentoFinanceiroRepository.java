package br.com.gilmariosoftware.movimento;

import br.com.gilmariosoftware.generic.GenericRepository;
import br.com.gilmariosoftware.usuario.Usuario;
import java.util.List;

/**
 *
 * @author gilmario
 */
public interface MovimentoFinanceiroRepository extends GenericRepository<MovimentoFinanceiro> {

    List<MovimentoFinanceiro> findByUsuario(Usuario usuario);

    List<MovimentoFinanceiro> findByTipoMovimentoAndUsuario(TipoMovimento tipo, Usuario usuario);
}
