package functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ZExercicio19 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 10, 5, 4, 3);
		List<Integer> agrupados = new ArrayList<>();

		Consumer<Integer> filtra = numero -> {
			if (numero % 3 == 0 || numero % 5 == 0)
				agrupados.add(numero);
		};
		numeros.forEach(filtra);

		double somaFiltro = agrupados.stream()
				.mapToInt(Integer::intValue)
				.sum();

		System.out.println("A soma dos valores filtrados é: " + somaFiltro);
	}

}
