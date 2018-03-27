
public class console {

	public static void exibir(Jogador[] jogadores) {
		int j = 0;
		while (jogadores[j] != null) {
			imprime(jogadores[j]);
			j++;
		}
	}

	private static void imprime(Jogador jogador) {
		System.out.print("Jogador: ");
		for (int i = 0; i < 5; i++) {
			Carta carta = jogador.getCarta(i);
			if (carta != null) {
				imprime(carta);
			}
		}
		System.out.println();
	}

	private static void imprime(Carta carta) {
		System.out.print(carta.exibir() + " ");
	}

	public static void exibir(Carta[] mesa) {
		System.out.print("Mesa: ");
		for (int i = 0; i < mesa.length; i++) {
			if (mesa[i] == null) {
				System.out.print("_ ");
			} else {
				imprime(mesa[i]);
			}
		}
		System.out.println();
	}

}
