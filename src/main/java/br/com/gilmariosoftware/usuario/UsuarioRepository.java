package br.com.gilmariosoftware.usuario;

import br.com.gilmariosoftware.generic.GenericRepository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author gilmario
 */
public interface UsuarioRepository extends GenericRepository<Usuario> {

    Optional<Usuario> findByUsername(String username);

    @Query("UPDATE Usuario set password=:password WHERE id=:id")
    @Modifying
    int createPassword(@Param("id") Long id, @Param("password") String encript);

}
