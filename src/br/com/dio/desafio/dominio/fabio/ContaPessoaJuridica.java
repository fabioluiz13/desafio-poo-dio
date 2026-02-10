package br.com.dio.desafio.dominio.fabio;

public class ContaPessoaJuridica extends Conta{


    @Override
    public void sacar(double valor) {
        double taxa = 5.00;

        if (valor + taxa <= getSaldo()) {
            setSaldo(getSaldo() - (valor + taxa));
        }else {
            System.out.println("Saldo insuficiente para PJ");
        }
    }

    @Override
    public String toString() {
        return "Conta Empresa: " + getNumero() + " saldo: R$ " + getSaldo();
    }
}
