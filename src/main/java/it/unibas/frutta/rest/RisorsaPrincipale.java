package it.unibas.frutta.rest;

import io.smallrye.common.constraint.NotNull;
import it.unibas.frutta.service.ServicePrincipale;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@ApplicationScoped
public class RisorsaPrincipale {

    @Inject
    private ServicePrincipale servicePrincipale;

    @GET
    @Path('/login')
    private String Login(@NotNull String username){
        return servicePrincipale.login(username);
    }
}
