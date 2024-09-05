package functional_interface.examples;

import java.util.Arrays; 
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zExercicio1 {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Stream<Integer> streamDeNumeros = numeros.stream();
		
		Stream<Integer> streamOrdenado = streamDeNumeros.sorted();
		
		List<Integer> numerosOrdenados = streamOrdenado.collect(Collectors.toList());
		
		System.out.println(numerosOrdenados);
	}
}
