
public class Teste {

	public static void main(String[] args) {
		Especial conta = new Especial();
		ContaSalario salario = new ContaSalario(conta);
		
		salario.depositar(300);
		
		System.out.println(conta.getSaldo());
	}

}
