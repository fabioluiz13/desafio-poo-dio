package br.com.dio.desafio.dominio.fabio;

public abstract class Conta {

    private String numero;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor){
        if(valor>=0){
            this.setSaldo(this.getSaldo()+valor);
        }
    }
    public abstract void sacar(double valor);

    @Override
    public String toString() {
        return "Conta: " + numero + ", saldo: R$ " + saldo ;
    }
}

