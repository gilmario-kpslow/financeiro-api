package br.com.gilmariosoftware.fatura.movimento;

import br.com.gilmariosoftware.fatura.Fatura;
import br.com.gilmariosoftware.generic.GenericRepository;
import java.util.List;

/**
 *
 * @author gilmario
 */
public interface MovimentoFaturaRepository extends GenericRepository<MovimentoFatura> {

    List<MovimentoFatura> findByFatura(Fatura fatura);

}
