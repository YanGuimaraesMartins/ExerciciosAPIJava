package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ZExercicio11 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		
		Function<Integer, Double> quadrados = numero -> Math.pow(numero, 2) ;
		
		double somaQuadrados = numeros.stream()
				
				.mapToDouble(quadrados::apply)			
				.sum();
		
		System.out.println("A soma dos quadrados é: "+somaQuadrados);
	}
}
