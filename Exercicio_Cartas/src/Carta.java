
public class Carta {
	private int valor;
	private int numero;

	public Carta(int numero) {
		this.numero = numero;
		if (numero > 10) {
			valor = 11;
		} else {
			valor = numero;
		}
	}

	public String exibir() {
		if (numero ==  1) return "A";
		if (numero == 10) return "X";
		if (numero == 11) return "J";
		if (numero == 12) return "Q";
		if (numero == 13) return "K";
		return "" + numero; // truque para converter int -> string
	}
}
