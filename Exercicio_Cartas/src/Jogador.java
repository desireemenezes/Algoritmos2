
public class Jogador {
	private int totalPontos;
	private Carta[] cartas; // maximo de 5 cartas
	
	public Jogador() {
		totalPontos = 0;
		cartas = new Carta[5];
	}
	
	public void recebe(Carta carta) {
		int posicao = 0;
		while (cartas[posicao] != null && posicao < cartas.length)
		{
			posicao++;
		}
		if (posicao < cartas.length) {
			cartas[posicao] = carta;
		}
	}

	public Carta getCarta(int i) {
		return cartas[i];
	}

	public Carta jogar() {
		for (int i = 0; i < cartas.length; i++) {
			if (cartas[i] != null) {
				Carta c = cartas[i];
				cartas[i] = null;
				return c;
			}
		}
		return null;
	}
}
