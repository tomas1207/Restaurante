package com.example.tomas1207.resturante;

public class Pessoas {
    private String Nome;
    private String Sobrenome;
    private Integer Idade;
    private Boolean IsAdmin;

    public Pessoas(String nome, String sobrenome, Integer idade, Boolean isAdmin) {
        Nome = nome;
        Sobrenome = sobrenome;
        Idade = idade;
        IsAdmin = isAdmin;
    }


    public String getNome() {
        return Nome;
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
}
