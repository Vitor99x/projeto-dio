import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Conta implements Iconta {

	protected String nome;
	protected String agencia;
	protected int conta;
	protected double saldo;

	public Conta(String nome, String agencia, int conta, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(double saque) {
		if (saldo > saque) {
			saldo -= saque;
			System.out.println("Saque realizado com sucesso: R$" + saque);
		} else {
			System.out.println("Saque maior que saldo em conta Saldo: R$" + saldo);
		}

	}

	@Override
	public void depositar(double deposito) {
		if (deposito != 0) {
			System.out.println("Deposito feito: R$" + deposito);
		} else {
			System.out.println("Só aceitamos depositos acima de: R$0");
		}

	}
	@Override
	public void informacoesConta() {
		System.out.println("Nome:" +getNome()+"\nAgência: "+getAgencia()+"\nConta:"+getConta()+"\nSaldo: "+getSaldo());
	}
	@Override
	public void transferir(int conta, double valorTransferencia) {
		if (valorTransferencia > getSaldo()) {
			System.out.println("Valor da transferência maior que o saldo! Valor transferência: R$" + valorTransferencia
					+ " Saldo: R$" + getSaldo());
		} else {
			this.sacar(valorTransferencia);

		}

	}


}
