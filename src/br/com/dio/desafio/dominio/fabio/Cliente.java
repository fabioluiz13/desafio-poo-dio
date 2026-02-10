package br.com.dio.desafio.dominio.fabio;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

    private String nome;
    private Set<Conta> contas =  new HashSet<Conta>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public void abrirConta(Banco banco, Conta conta) {
        contas.add(conta);
        banco.getContas().add(conta);
    }
}
