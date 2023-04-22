package br.com.gilmariosoftware.fatura;

import br.com.gilmariosoftware.generic.GenericRepository;
import br.com.gilmariosoftware.usuario.Usuario;
import java.util.List;

/**
 *
 * @author gilmario
 */
public interface FaturaRepository extends GenericRepository<Fatura> {

    List<Fatura> findByUsuario(Usuario usuario);

}
