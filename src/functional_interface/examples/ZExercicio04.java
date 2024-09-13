package functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ZExercicio04 {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> soPares = new ArrayList<>();
		
		Consumer<Integer> filtraPares = numero ->{
			if (numero % 2 == 0) {
				soPares.add(numero);
			}
		};
		numeros.forEach(filtraPares);
		System.out.println(soPares);
		
	}
}