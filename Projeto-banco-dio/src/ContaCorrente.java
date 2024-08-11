
public class ContaCorrente extends Conta implements Iconta {

	public ContaCorrente(String nome, String agencia, int conta, double saldo) {
		super(nome, agencia, conta, saldo);

	}

	@Override
	public void impimirExtrato() {
		System.out.println(saldo);

	}

	@Override
	public void adicionarConta(String nome, String agencia, int conta, double saldo) {
		// TODO Auto-generated method stub

	}

	

}
