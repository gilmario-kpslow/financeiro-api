package br.com.gilmariosoftware.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author gilmario
 * @param <T>
 */
@NoRepositoryBean
public interface GenericRepository<T extends GenericEntity> extends JpaRepository<T, Long> {

}
