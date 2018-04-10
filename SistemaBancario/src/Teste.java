
public class Teste {

	public static void main(String[] args) {
		Conta conta = new Especial();
		
		conta.depositar(300);
		conta.sacar(200);
		conta.sacar(200);
		
		System.out.println(conta.getSaldo());
	}

}
