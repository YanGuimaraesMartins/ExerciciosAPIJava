package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ZExercicio02 {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		
		final int[] somaTotal = {0};
		Consumer<Integer> somaPares = numero -> {
			if (numero % 2 == 0) {
				somaTotal[0] += numero;
			}
		};
		
		numeros.forEach(somaPares);
		System.out.println("A soma total é: " + somaTotal[0]);

	}
}
