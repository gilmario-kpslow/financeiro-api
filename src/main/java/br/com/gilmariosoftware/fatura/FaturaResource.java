package br.com.gilmariosoftware.fatura;

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
@Path("fatura")
@DenyAll
@RequestScoped
public class FaturaResource extends GenericResource<Fatura, FaturaResponse> {

    @Inject
    FaturaService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed(value = {"USER"})
    public List<FaturaResponse> listarTodos() {
        return service.listarTodos();
    }

    @POST
    @RolesAllowed(value = {"USER"})
    public Optional<FaturaResponse> create(FaturaRequest request) {
        return service.salvar(request);
    }

    FaturaService getService() {
        return this.service;
    }

}
