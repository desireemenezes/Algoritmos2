
public class Especial implements Saque, Deposito {

	double saldo;
	double limite;
	
	@Override
	public void depositar(int valor) {
		saldo += valor;
	}

	@Override
	public void sacar(int valor) {
		if (valor <= saldo + limite) {
			saldo -= valor;
		}
	}

	public double getSaldo() {
		return saldo;
	}

}
