
public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("José");
		Cliente cliente2 = new Cliente("Maria");

		Banco banco = new Banco("Meu Banco");

		banco.listarContas();

		Conta conta1 = banco.criarContaCorrente(cliente1);
		Conta poupanca1 = banco.criarContaCorrente(cliente1);
		Conta conta2 = banco.criarContaCorrente(cliente2);

		conta1.depositar(150);
		conta1.transferir(100, conta2);
		conta1.transferir(20, poupanca1);

		banco.listarContas();
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
		poupanca1.imprimirExtrato();

	}

}
