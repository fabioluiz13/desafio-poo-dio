package br.com.dio.desafio.dominio.fabio;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    private  String nome;
    private Set<Conta> contas = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conta> getContas() {
        return contas;
    }
}
