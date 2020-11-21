package view;

import java.util.Scanner;
import model.Calcular;

public class Joguinho {

	static Scanner ler = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
		Joguinho.jogar();

	}

	public static void jogar() {
		System.out.println("Informe o nível de dificuldade desejado[1,2,3,4]");
		int dificuldade = Joguinho.ler.nextInt();
		Joguinho.calc = new Calcular(dificuldade);
		System.out.println("Qual o resultado dessa operação?");
		// somar
		if (calc.getOperacao() == 0) {
			System.out.println(calc.getV1() + " + " + calc.getV2());
			int resposta = Joguinho.ler.nextInt();
			if (calc.somar(resposta)) {
				Joguinho.pontos++;
				System.out.println("Voce tem " + Joguinho.pontos + " ponto(s)");
			}
		}
		// Subtrair
		else if (calc.getOperacao() == 1) {
			System.out.println(calc.getV1() + " - " + calc.getV2());
			int resposta = Joguinho.ler.nextInt();
			if (calc.diminuir(resposta)) {
				Joguinho.pontos++;
				System.out.println("Voce tem " + Joguinho.pontos + " ponto(s)");
			}
		}
		// Multiplicar
		else if (calc.getOperacao() == 2) {
			System.out.println(calc.getV1() + " * " + calc.getV2());
			int resposta = Joguinho.ler.nextInt();
			if (calc.multiplicar(resposta)) {
				Joguinho.pontos++;
				System.out.println("Voce tem " + Joguinho.pontos + " ponto(s)");
			}
		}
		System.out.println("Deseja continuar? [1- Sim, 2- Não]");
		int continuar = Joguinho.ler.nextInt();
		if (continuar == 1) {
			Joguinho.jogar();
		} else if (continuar == 2) {
			System.out.println("Você fez " +Joguinho.pontos+" ponto(s)");
			System.out.println("Até a próxima");
			System.exit(0);
		}

	}

}
