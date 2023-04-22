package br.com.gilmariosoftware.movimento;

import br.com.gilmariosoftware.generic.GenericResource;
import java.util.List;
import java.util.Optional;
import javax.annotation.security.DenyAll;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author gilmario
 */
@Path("movimento-financeiro")
@DenyAll
@RequestScoped
public class MovimentoFinanceiroResource extends GenericResource<MovimentoFinanceiro, MovimentoFinanceiroResponse> {

    @Inject
    MovimentoFinanceiroService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed(value = {"USER"})
    public List<MovimentoFinanceiroResponse> listarTodos() {
        return service.listarTodos();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed(value = {"USER"})
    @Path("despesas")
    public List<MovimentoFinanceiroResponse> getDespesas() {
        return service.getDespesas();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed(value = {"USER"})
    @Path("receitas")
    public List<MovimentoFinanceiroResponse> getReceitas() {
        return service.getDespesas();
    }

    @POST
    @RolesAllowed(value = {"USER"})
    public Optional<MovimentoFinanceiroResponse> create(MovimentoFinanceiroRequest request) {
        return service.salvar(request);
    }

    MovimentoFinanceiroService getService() {
        return this.service;
    }

}
