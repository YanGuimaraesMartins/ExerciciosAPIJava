package functional_interface.examples;

import java.util.Arrays;
import java.util.List;

public class ZExercicio09 {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12, 13);

		boolean seRepetem = numeros.size() == numeros.stream()

				.distinct()
				.count();
		if(seRepetem)
			System.out.println("A lista não possui números que se repetem");
		else
			System.out.println("A lista  possui números que se repetem");
	}
}
