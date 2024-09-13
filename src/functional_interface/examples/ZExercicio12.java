package functional_interface.examples;

import java.util.Arrays;
import java.util.List;

public class ZExercicio12 {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		double produto = numeros.stream()
				.reduce(1, (a, b) -> a * b);
		System.out.println("O produto total dos números da lista é: "+produto);
	}
}
