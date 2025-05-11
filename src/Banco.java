import java.util.List;
import java.util.ArrayList;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public Conta criarContaCorrente(Cliente cliente) {

		if (cliente == null) {
			throw new IllegalArgumentException("Cliente não pode ser nulo");
		}

		Conta novaConta = new ContaCorrente(cliente);
		this.contas.add(novaConta);

		return novaConta;
	}

	public Conta criarContaPoupanca(Cliente cliente) {

		if (cliente == null) {
			throw new IllegalArgumentException("Cliente não pode ser nulo");
		}

		Conta novaPoupanca = new ContaPoupanca(cliente);
		this.contas.add(novaPoupanca);

		return novaPoupanca;
	}

	public void listarContas() {
		if (this.contas.isEmpty()) {
			System.out.println("Nenhuma conta cadastrada.");
		} else {
			for (Conta conta : this.contas) {
				System.out.println(conta);
			}
		}
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return this.contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
