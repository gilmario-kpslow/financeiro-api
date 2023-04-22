package br.com.gilmariosoftware.generic;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gilmario
 * @param <T>
 */
public interface GenericRepository<T extends GenericEntity> extends JpaRepository<T, Long> {

}
