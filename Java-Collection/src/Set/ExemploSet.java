package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conujunto e adicione notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(8.1, 7.8, 5.6, 7.8, 3.5, 2.2));
        System.out.println(notas);

        System.out.println("Confira se o numero 5.6 esta no conjuto: " + notas.contains(5.6));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos Valores: " + soma);

        System.out.println("Exiba a media dos Valores: " + (soma / notas.size()));

        System.out.println("Remova a nota 3.5: ");
        notas.remove(3.5d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7");

        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba na ordem de entrada");

        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(8.1, 7.8, 5.6, 7.8, 3.5, 2.2));

        System.out.println(notas2);

        System.out.println("Exiba em ordem crescenete natural: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

    }
}
