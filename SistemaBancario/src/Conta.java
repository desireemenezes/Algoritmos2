
public class Conta {

	private double saldo;

	public void depositar(int valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public void sacar(int valor) {
		if (isValorValido(valor) && isFundosSuficiente(valor)) {
			saldo -= valor;
		}
	}

	protected boolean isFundosSuficiente(int valor) {
		return valor <= saldo;
	}

	private boolean isValorValido(int valor) {
		return valor > 0;
	}

	public double getSaldo() {
		return saldo;
	}

}
