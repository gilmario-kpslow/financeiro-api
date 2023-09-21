package br.com.gilmariosoftware.planocontas;

import br.com.gilmariosoftware.generic.GenericRepository;
import br.com.gilmariosoftware.usuario.Usuario;
import java.util.List;

/**
 *
 * @author gilmario
 */
public interface PlanoContasRepository extends GenericRepository<PlanoContas> {

    List<PlanoContas> findByUsuario(Usuario usuario);
}
