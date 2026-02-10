package br.com.dio.desafio.dominio.fabio;

public class ContaPoupanca  extends Conta{

    public void aplicarRendimento(){
        setSaldo(getSaldo() * 1.02);
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
        }else {
            System.out.println("Saldo insuficiente na poupança");
        }
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + getNumero() + " saldo: R$ " + getSaldo();
    }
}
