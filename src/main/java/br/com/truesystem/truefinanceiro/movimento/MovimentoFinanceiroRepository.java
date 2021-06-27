package br.com.truesystem.truefinanceiro.movimento;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

/**
 *
 * @author gilmario
 */
@Repository
public interface MovimentoFinanceiroRepository extends JpaRepository<MovimentoFinanceiro, Long> {

}
