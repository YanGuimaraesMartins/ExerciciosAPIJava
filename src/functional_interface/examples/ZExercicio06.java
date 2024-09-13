package functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ZExercicio06 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12, 13);

		List<Integer> maior10 = new ArrayList<>();
		int limite = 10;
		Consumer<Integer> filtraMaior = numero -> {
			if (numero > limite) {
				maior10.add(numero);
			}
		};

		numeros.stream().forEach(filtraMaior);
		if (maior10 != null && !maior10.isEmpty())
			System.out.println("Os números maiores que " + limite + " são: " + maior10);
		else
			System.out.println("A lista não contém números maiores que: " + limite);
	}
}
