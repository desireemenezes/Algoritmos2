
public class Especial extends Conta {

	private double limite = 300.0;
	private int saldo = 0;
	
	@Override
	protected boolean isFundosSuficiente(int valor) {
		return valor <= limite + getSaldo(); 
	}
}
