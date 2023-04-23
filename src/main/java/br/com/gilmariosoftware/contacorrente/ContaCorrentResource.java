package br.com.gilmariosoftware.contacorrente;

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
@Path("conta-corrente")
@DenyAll
@RequestScoped
public class ContaCorrentResource extends GenericResource<ContaCorrente, ContaCorrenteResponse> {

    @Inject
    ContaCorrenteService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed(value = {"USER"})
    public List<ContaCorrenteResponse> listarTodos() {
        return service.listarTodos();
    }

    @POST
    @RolesAllowed(value = {"USER"})
    public Optional<ContaCorrenteResponse> create(ContaCorrenteRequest request) {
        return service.salvar(request);
    }

    ContaCorrenteService getService() {
        return this.service;
    }

}
