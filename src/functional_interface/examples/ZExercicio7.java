package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ZExercicio7 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12, 13);
		int[] maior = { 0 };
		int[] segundoMaior = { 0 };
		int[] maiorPrimeiro = { 0 };
		int[] resultado = { 0 };

		Consumer<Integer> filtraMaiores = numero -> {
			if (numero > maior[0]) {
				segundoMaior[0] = maior[0];
				maior[0] = numero;
			} else {
				if (maiorPrimeiro[0] < maior[0]) {
					maiorPrimeiro[0] = maior[0];
					maior[0] = segundoMaior[0];
				}
				if (numero > maior[0] && numero != maiorPrimeiro[0]) {
					maior[0] = numero;
					segundoMaior[0] = maior[0];
				}
			}
			if (maior[0] < maiorPrimeiro[0])
				resultado[0] = maior[0];
			else
				resultado[0] = segundoMaior[0];

		};
		numeros.stream().forEach(filtraMaiores);
		System.out.println("O segundo maior número da lista é: " + resultado[0]);
	}
}
