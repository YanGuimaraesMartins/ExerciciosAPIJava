package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZExercicio13 {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		List<Integer> filtro = numeros.stream()
				.filter(n -> 5 < n && n < 10)
				.collect(Collectors.toList());

		System.out.println(filtro);
	}
}
