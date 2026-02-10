import br.com.dio.desafio.dominio.fabio.Banco;
import br.com.dio.desafio.dominio.fabio.Cliente;
import br.com.dio.desafio.dominio.fabio.ContaPessoaFisica;
import br.com.dio.desafio.dominio.fabio.ContaPessoaJuridica;
import br.com.dio.desafio.dominio.fabio.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        ContaPessoaFisica contaPF = new ContaPessoaFisica();
        contaPF.setNumero("001");
        contaPF.depositar(1000);


        ContaPessoaJuridica contaPJ = new ContaPessoaJuridica();
        contaPJ.setNumero("002");
        contaPJ.depositar(5000);

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setNumero("003");
        poupanca.depositar(2000);

        Banco banco = new Banco();
        banco.setNome("Banco Bradesco");

        Cliente clienteJose = new Cliente();
        clienteJose.setNome("Jose");
        clienteJose.abrirConta(banco, contaPF);
        clienteJose.abrirConta(banco, poupanca);

        System.out.printf("As contas de %s são: %s%n", clienteJose.getNome(), clienteJose.getContas());

        contaPF.sacar(200);
        poupanca.aplicarRendimento();
        System.out.println();

        System.out.println("Apos operações");
        System.out.printf("As contas de %s ficaram assim: %s%n", clienteJose.getNome(), clienteJose.getContas());
        System.out.println("Saldo atual: " + contaPF.getSaldo());
        System.out.println();

        Cliente clienteJoao = new Cliente();
        clienteJoao.setNome("João");
        clienteJoao.abrirConta(banco, contaPJ);
        System.out.println();

        System.out.printf("As contas de %s é = %s %n", clienteJoao.getNome(), clienteJoao.getContas());

        contaPJ.sacar(1000);

        System.out.println("Apos operações");
        System.out.printf("As contas de %s ficaram assim: %s%n", clienteJoao.getNome(), clienteJoao.getContas());
        System.out.println("Saldo atual: " +  contaPJ.getSaldo());



    }

}
