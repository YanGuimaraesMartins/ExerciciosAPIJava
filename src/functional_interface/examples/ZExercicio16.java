package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZExercicio16 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 10, 5, 4, 3);
		List<Integer> filtraPares = numeros.stream()
				.filter(n -> n % 2 ==0)
				.collect(Collectors.toList());
		List<Integer> filtraImpares = numeros.stream()
				.filter(n -> n%2 != 0)
				.collect(Collectors.toList());
		
		System.out.println("Os números pares são: "+filtraPares);
		System.out.println("Os números impares são: "+filtraImpares);
	}
}
