
public interface Iconta {

	void adicionarConta(String nome, String agencia, int conta, double saldo);

	void sacar(double saque);

	void depositar(double deposito);

	void transferir(int conta, double valorTransferencia);

	void impimirExtrato();
	void informacoesConta();
}
