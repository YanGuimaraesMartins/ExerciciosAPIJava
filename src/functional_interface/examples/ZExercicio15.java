package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZExercicio15 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 10, 5, 4, 3);
		List<Integer> filtraNegativos = numeros.stream()
				.filter(n -> n < 0)
				.collect(Collectors.toList());
		
		if(filtraNegativos.isEmpty())
			System.out.println("Não há números negativos");
		else
		System.out.println("Os números negativos são: "+filtraNegativos);
	}
}
