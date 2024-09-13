package functional_interface.examples;

import java.util.Arrays;
import java.util.List;

public class ZExercicio08 {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12, 13);

		int somaTotal = numeros.stream()

				.flatMapToInt(numero -> Integer.toString(numero).chars())
				.map(Character::getNumericValue)
				.sum();
				
				System.out.println("A soma de todos os dígitos da lista é: "+somaTotal);
	}
}
