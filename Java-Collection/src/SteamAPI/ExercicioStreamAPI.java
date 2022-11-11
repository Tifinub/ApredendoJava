package SteamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {

        List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos da lista");
        numeros.forEach(System.out::println);

        System.out.println("Colete 5 Numero da lista: ");
        numeros.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme String em Inteiro: ");

        List<Integer> numeros2 = (List<Integer>) numeros.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        System.out.println(numeros2);

        System.out.println("Imprima numeros pares e maiores que 2");
        numeros2.stream().filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Mostre a media dos numeros: ");

        numeros.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Remova os Valores impares: ");
        numeros2.removeIf(i -> i % 2 != 0);
        System.out.println(numeros2);
    }
}
