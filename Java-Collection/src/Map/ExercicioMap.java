package Map;

import java.util.*;

public class ExercicioMap {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };

        for (Map.Entry<String, Integer> entries : estados.entrySet()) {
            System.out.println("Estado: " + entries.getKey() + ", Populacao: " + entries.getValue());
        }

        if (!estados.containsKey("PB"))
            estados.put("PB", 4039277);

        System.out.println("\nAdicione PB");
        imprimirEstados(estados);

        System.out.println("\nExiba a populacao de PE: " + estados.get("PE"));

        Map<String, Integer> estados2 = new LinkedHashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        System.out.println("\nExiba na Ordem de insercao: ");
        imprimirEstados(estados2);

        System.out.println("\nExiba em Ordem Alfabetica de estado: ");
        Map<String, Integer> estados3 = new TreeMap<>(estados);
        imprimirEstados(estados3);

        int menorPopulacao = Collections.min(estados.values());
        int maiorPopulacao = Collections.max(estados.values());

        int soma = 0;

        System.out.println("\nExiba o Estado com a menor populacao: ");
        for (Map.Entry<String, Integer> entries : estados.entrySet()) {
            if (menorPopulacao == entries.getValue()) {
                System.out.println("O Estado com a menor Populacao é: " + entries.getKey() + " Com a Populacao de : "
                        + entries.getValue());
            }
        }

        System.out.println("\nExiba o Estado com a maior populacao: ");
        for (Map.Entry<String, Integer> entries : estados.entrySet()) {
            if (maiorPopulacao == entries.getValue()) {
                System.out.println("O Estado com a maior Populacao é: " + entries.getKey() + " Com a Populacao de : "
                        + entries.getValue());
            }
            soma += entries.getValue();
        }

        System.out.println("Exiba a Soma da populacao dos Estados: " + soma);

        System.out.println("Media dos estados: " + (soma / estados.size()));

        Iterator<Integer> iterator = estados.values().iterator();

        System.out.println(iterator.next());

    }

    public static void imprimirEstados(Map<String, Integer> estados) {
        for (Map.Entry<String, Integer> entries : estados.entrySet()) {
            System.out.println("Estado: " + entries.getKey() + ", Populacao: " + entries.getValue());
        }
    }
}
