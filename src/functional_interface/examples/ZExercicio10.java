package functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ZExercicio10 {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12, 13);
		List<Integer> agrupados = new ArrayList();

		Consumer<Integer> verificaDivisao = numero -> {
			if (numero % 2 == 1) {
				if (numero % 3 == 0 || numero % 5 == 0) {
					agrupados.add(numero);
				}
			}
		};

		numeros.forEach(verificaDivisao);
		agrupados.sort(null);
		System.out.println(agrupados);

	}
}
