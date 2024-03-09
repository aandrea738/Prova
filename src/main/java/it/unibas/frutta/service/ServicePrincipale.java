package it.unibas.frutta.service;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class ServicePrincipale {

    public String login(String username){
        return "Username " + username + " corettamente loggato";
    }
}
