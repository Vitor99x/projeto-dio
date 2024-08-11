import java.util.ArrayList;
import java.util.List;

public class Programa {
	private List<Conta> contaCorrente = new ArrayList<Conta>();
	private List<Conta> contaPoupanca = new ArrayList<Conta>();

	public static void main(String[] args) {
		Programa programa = new Programa();

		programa.contaCorrente.add(new ContaCorrente("vitor", "bradesco", 2, 33));

		for (Conta contaCorente : programa.contaCorrente) {
			contaCorente.informacoesConta();
			contaCorente.transferir(2, 433);
			
		}
		System.out.println();
		programa.contaPoupanca.add(new ContaPoupanca("João", "Caixa", 2, 34));
		for (Conta contaPoupanca : programa.contaPoupanca) {
			contaPoupanca.informacoesConta();
			contaPoupanca.transferir(3, 33);
			

		}
	}
}
