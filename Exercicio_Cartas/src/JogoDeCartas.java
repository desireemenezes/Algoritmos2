
public class JogoDeCartas {

	public static void main(String[] args) {
		Baralho baralho = new Baralho();
		Jogador[] jogadores = new Jogador[4];
		Carta[] mesa = new Carta[4];
		
		jogadores[0] = new Jogador();
		
		baralho.inicializar();
		baralho.embaralhar();
		
		inicializarJogo(baralho, jogadores);
		
		console.exibir(jogadores);
		console.exibir(mesa);
		
		Carta carta = jogadores[0].jogar();
		mesa[0] = carta;
		
		console.exibir(jogadores);
		console.exibir(mesa);
		
	}

	private static void inicializarJogo(Baralho baralho,
			                            Jogador[] jogadores)
	{
		int j = 0;
		while (jogadores[j] != null) {
			for (int i = 0; i < 5; i++) {
				jogadores[j].recebe(baralho.comprar());
			}
			j++;
		}
	}

}
