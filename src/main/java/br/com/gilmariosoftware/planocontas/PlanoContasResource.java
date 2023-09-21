package br.com.gilmariosoftware.planocontas;

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
public class PlanoContasResource extends GenericResource<PlanoContas, PlanoContasResponse> {

    @Inject
    PlanoContasService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed(value = {"USER"})
    public List<PlanoContasResponse> listarTodos() {
        return service.listarTodos();
    }

    @POST
    @RolesAllowed(value = {"USER"})
    public Optional<PlanoContasResponse> create(PlanoContasRequest request) {
        return service.salvar(request);
    }

    PlanoContasService getService() {
        return this.service;
    }

}
