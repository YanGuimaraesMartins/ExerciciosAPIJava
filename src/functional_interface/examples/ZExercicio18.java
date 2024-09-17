package functional_interface.examples;

import java.util.Arrays;
import java.util.List;

public class ZExercicio18 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 10, 5, 4, 3);
		

		boolean igual = numeros.stream()
				.distinct()
				.count() == 1;
		
		if (igual == true) 
			System.out.println("Os numeros são iguais.");
		else
			System.out.println("Os números são diferentes.");
	
	}
}
