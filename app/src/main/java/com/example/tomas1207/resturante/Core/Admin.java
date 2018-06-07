package com.example.tomas1207.resturante.Core;

public class Admin {
    private String Nome;
    private Boolean AdminsCheck;

    public   boolean  AdminCheck(Pessoas pessoas){
        if(pessoas.getAdmin() == true ){
            this.AdminsCheck = true;
            return true;
        }
        return false;
    }
    public  void Admin(Pessoas pessoas){
        this.Nome = pessoas.getNome();
    }

    //TODO:Add admins gestao, como as noticas e add a form de admin, Remover e add admins,Check de sms para os admins
}
