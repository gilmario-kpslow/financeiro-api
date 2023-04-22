package br.com.gilmariosoftware;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author gilmario
 */
@Path("versao")
public class VersaoResource {

    @GET
    public Versao getVersao() {
        return new Versao();
    }
}
