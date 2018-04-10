
public class ContaSalario implements Deposito {

	private Deposito contaAssociada;
	
	public ContaSalario(Deposito associada) {
		contaAssociada = associada;
	}
	
	@Override
	public void depositar(int valor) {
		contaAssociada.depositar(valor);
	}
	
}
