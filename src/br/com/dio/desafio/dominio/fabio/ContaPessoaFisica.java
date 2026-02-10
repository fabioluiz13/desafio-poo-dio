package br.com.dio.desafio.dominio.fabio;

public class ContaPessoaFisica extends Conta {


    @Override
    public void sacar(double valor) {
        double taxa = 1.50;

        if (valor  + taxa <= getSaldo()) {
            setSaldo(getSaldo() - (valor  + taxa));
        }else {
            System.out.println("Saldo insuficiente para PF");
        }
    }

    @Override
    public String toString() {
        return "Conta Pessoa Fisica: " + getNumero() + " , Saldo: " + getSaldo();
    }
}
