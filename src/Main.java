
public class Main {

	public static void main(String[] args) {
		
		Cliente leonardo = new Cliente();
		leonardo.setNome("Leonardo Giroto Garcia");
		
		Conta cc = new ContaCorrente(leonardo);
		Conta poupanca = new ContaPoupanca(leonardo);
		
		cc.deposito(100);
		
		cc.transferencia(42, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
