import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta implements Iconta {
	private List<Conta> listaContaCorrente = new ArrayList<>();

	public ContaPoupanca(String nome, String agencia, int conta, double saldo) {
		super(nome, agencia, conta, saldo);

	}

	@Override
	public void adicionarConta(String nome, String agencia, int conta, double saldo) {
		listaContaCorrente.add(new ContaPoupanca(nome, agencia, conta, saldo));

	}

	

	@Override
	public void impimirExtrato() {
		System.out.println(saldo);

	}

}
