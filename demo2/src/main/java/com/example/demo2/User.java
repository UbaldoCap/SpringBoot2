package com.example.demo2;

import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullFields;

public class User {
    public String nome;
    public String provincia;
    public String saluto;

    public User(String nome, String provincia, String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = saluto;
    }
}
