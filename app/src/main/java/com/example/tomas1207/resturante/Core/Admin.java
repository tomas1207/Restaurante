package com.example.tomas1207.resturante.Core;

public class Admin {
    private String Nome;
    private Boolean AdminsCHeck;

    public   boolean  AdminCheck(Pessoas pessoas){
        if(pessoas.getAdmin() == true ){
            this.AdminsCHeck = true;
            return true;
        }
        return false;
    }
    //TODO:Add admins gestao, como as noticas e add a form de admin, Remover e add admins,Check de sms para os admins
}
