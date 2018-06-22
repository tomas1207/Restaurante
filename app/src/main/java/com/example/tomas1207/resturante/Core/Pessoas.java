package com.example.tomas1207.resturante.Core;

import android.net.Uri;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Pessoas {
    private String Nome, Email;
    private String Sobrenome;
    private Integer Idade;
    private Boolean IsAdmin;


    public Pessoas(String nome, String sobrenome, Integer idade, Boolean isAdmin ) {
        Nome = nome;
        Sobrenome = sobrenome;
        Idade = idade;
        IsAdmin = isAdmin;

    }

    public void getuser(){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // Name, email address, and profile photo Url
           this.setNome(user.getDisplayName());
            this.setEmail(user.getEmail());

            // Check if user's email is verified
            boolean emailVerified = user.isEmailVerified();

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            String uid = user.getUid();
        }

    }


    //region get and setter
    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer idade) {
        Idade = idade;
    }

    public Boolean getAdmin() {
        return IsAdmin;
    }

    public void setAdmin(Boolean admin) {
        IsAdmin = admin;
    }
    //endregion
}
