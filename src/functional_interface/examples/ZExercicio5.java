package functional_interface.examples;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ZExercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> somaMaior5 = new ArrayList<>();
        final int[] somaTotal = {0};
        
        Consumer<Integer> filtraMaior = numero -> {
            if (numero > 5) {
                somaMaior5.add(numero);
                somaTotal[0] += numero;
            }
        };
        
        Function<Integer, Double> calcularMedia = tamanho -> tamanho > 0 ? (double) somaTotal[0] / tamanho : 0.0;

        numeros.forEach(filtraMaior);
        
        double media = calcularMedia.apply(somaMaior5.size());
        System.out.println("Média dos números maiores que 5: " + media);
    }
}
