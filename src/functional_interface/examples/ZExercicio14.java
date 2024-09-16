package functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ZExercicio14 {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 10, 5, 4, 3);
		List<Integer> primos = new ArrayList<>();
		int[] primoMaior = {0};

		Consumer<Integer> descobrePrimos = numero -> {
			if (numero > 1) {
				boolean ePrimo = true;
				for (int i = 2; i <= Math.sqrt(numero); i++) {
					if (numero % i == 0) {
						ePrimo = false;
						break;
					} else if (numero == 2)
						primos.add(numero);
				}
				if (ePrimo)
					primos.add(numero);
				if (ePrimo && numero > primoMaior[0]) {
					primoMaior[0] = numero;
				}
			} 
		};
		
		numeros.forEach(descobrePrimos);
		System.out.println("O maior primo é: "+primoMaior[0]);
	}
}
