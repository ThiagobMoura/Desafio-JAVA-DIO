

public class Main {

	public static void main(String[] args) {
		Cliente Correntista = new Cliente();
		Correntista.setNome("Joe Doe");
		
		Conta cc = new ContaCorrente(Correntista);
		Conta poupanca = new ContaPoupanca(Correntista);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
