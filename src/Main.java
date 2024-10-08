import models.ContaCorrente;
import models.ContaPoupanca;
import models.Cliente;
import models.Conta;

public class Main {

    public static void main(String[] args) {

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.adicionarCliente();

        Cliente Lucas = new Cliente();
        Lucas.setNome("Lucas");
        Lucas.adicionarCliente();

        Cliente Edson = new Cliente();
        Edson.setNome("Edson");
        Edson.adicionarCliente();





        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
        System.out.println();

        for (Cliente cliente : Cliente.getListaClientes()) {
            System.out.println(cliente);
        }

    }
}