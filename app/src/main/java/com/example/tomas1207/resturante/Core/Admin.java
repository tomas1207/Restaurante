package com.example.tomas1207.resturante.Core;

public class Admin {
    private String Nome;
    private Boolean AdminsCheck;

    public boolean AdminCheck(Pessoas pessoas) {
        if (pessoas.getAdmin() == true) {
            this.AdminsCheck = true;
            return true;
        }
        return false;
    }
}