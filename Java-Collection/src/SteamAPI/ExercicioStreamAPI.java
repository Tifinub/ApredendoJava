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

        List<Integer> numeros2 = (List<Integer>) numeros.stream().map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

    }
}
