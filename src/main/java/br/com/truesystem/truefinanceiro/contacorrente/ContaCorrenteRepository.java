package br.com.truesystem.truefinanceiro.contacorrente;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

/**
 *
 * @author gilmario
 */
@Repository
public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Long> {

}
