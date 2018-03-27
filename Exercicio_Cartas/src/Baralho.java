
public class Baralho {
	private Carta[] cartas; // maximo 52 
	private int proximaCarta;
	
	public Baralho() {
		cartas = new Carta[4*13];
		proximaCarta = cartas.length;
	}
	
	public void inicializar() {
		// cria baralho
		int proxima = 0;
		for (int naipe = 0; naipe < 4; naipe++) {
			for (int valor = 0; valor < 13; valor++) {
				Carta carta = new Carta(valor);
				cartas[proxima] = carta;
				proxima++;
			}
		}
	}
	
	public void embaralhar() {
		// mistura cartas
		for (int carta = 0; carta < 52; carta++) {
			int random = (int)(Math.random() * 52);
			// troca valor das variáveis de um array
			Carta auxiliar = cartas[random];
			cartas[random] = cartas[carta];
			cartas[carta] = auxiliar;
		}
		
	}

	public Carta comprar() {
		if (proximaCarta > 0) {
			proximaCarta--;
			return cartas[proximaCarta];
		} else {
			return null;
		}
	}
}
