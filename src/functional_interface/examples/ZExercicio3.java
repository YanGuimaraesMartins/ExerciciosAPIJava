package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ZExercicio3 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		Consumer<Integer> verificaPositivos = numero -> {
			if (numero > 0) {
				System.out.println(numero + " É POSITIVO");
			} else if (numero < 0) {
				System.out.println(numero + " É NEGATIVO");
			} else
				System.out.println(numero + " É NEUTRO");
		};
		numeros.forEach(verificaPositivos);
	}
}
