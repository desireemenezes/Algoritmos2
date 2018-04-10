import java.util.Scanner;

public class Exercicios_aula_1 {
	
	private static final Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		exercicio1();
		exercicio2();
		exercicio3();
		exercicio4();
		exercicio5();
	}

	private static void exercicio5() {
		System.out.println("Digite um numero binario: ");
		int m = 1;
		int v = 0;
		int data = sc.nextInt();
		while (data > 0) {
			v += (data%10) * m;
			m *= 2;
			data /= 10;
		}
		System.out.println(v);
	}

	private static void exercicio4() {
		System.out.println("Digite um numero: ");
		int data = sc.nextInt();
		String result = "";
		while (data > 1) {
			result = (data % 2) + result;
			data /= 2;
		}
		result = data + result;
		System.out.println(result);
	}

	private static void exercicio3() {
		System.out.println("Digite cinco numeros: ");
		int[] data = new int[5];
		for (int i = 0; i < 5; i++) {
			data[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			int menores = 0;
			for (int j = 0; j < 5; j++) {
				if (i != j) {
					if (data[i] < data[j]) {
						menores++;
					}
				}
			}
			if (menores == 2) {
				System.out.println(data[i]);
				break;
			}
		}
	}

	private static void exercicio2() {
		System.out.println("Digite tres numeros: ");
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			int v = sc.nextInt();
			if (v < min) {
				min = v;
			}
		}
		System.out.println(min);
	}

	private static void exercicio1() {
		System.out.println("Digite um numero: ");
		int v = sc.nextInt();
		System.out.println(v*v);
	}
}
