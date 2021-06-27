package br.com.truesystem.truefinanceiro.movimento;

import br.com.truesystem.truefinanceiro.core.generic.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gilmario
 */
@RestController
@RequestMapping("receita")
public class MovimentoFinanceiroController extends GenericController<MovimentoFinanceiro, MovimentoFinanceiroRepository, MovimentoFinanceiroService> {

}
