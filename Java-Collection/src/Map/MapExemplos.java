package Map;

import java.util.*;

public class MapExemplos {
    public static void main(String[] args) {

        System.out.println("Crie um Map com modelos de carros e seu cosumo: ");
        Map<String, Double> carros = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("hb20", 16.1);
                put("moni", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carros);

        System.out.println("\nSubstitua o cosumo do Gol para 15.2: ");
        carros.put("gol", 15.2);
        System.out.println(carros);

        System.out.println("\nVerifique se o modelo tucson esta na colecao: " + carros.containsKey("tucson"));

        System.out.println("\nExiba o cosumo do uno: " + carros.get("uno"));

        // System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("\nExiba os modelos: " + carros.keySet());

        Collection<Double> consumos = carros.values();
        Double minimo = Collections.min(consumos);
        Double maximo = Collections.max(consumos);

        System.out.println("\nExiba os consumos: " + consumos);

        Set<Map.Entry<String, Double>> entradas = carros.entrySet();

        String carrosMaisEficiente = "";
        String carroMenosEficiente = "";

        System.out.println("\nExiba os Carros menos Eficientes: ");
        for (Map.Entry<String, Double> entry : entradas) {
            if (entry.getValue().equals(minimo)) {
                carroMenosEficiente = entry.getKey();
                System.out.println(carroMenosEficiente);
            }
        }

        System.out.println("\nExiba os Carros Mais Eficientes: ");
        for (Map.Entry<String, Double> entry : entradas) {
            if (entry.getValue().equals(maximo)) {
                carrosMaisEficiente = entry.getKey();
                System.out.println(carrosMaisEficiente);
            }
        }

        System.out.println("\nExiba a soma de todos os consumos: ");

        Iterator<Double> iterator = consumos.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Remova valores menores que 15.6 do consumos: ");

        Iterator<Double> iterator2 = consumos.iterator();

        while (iterator2.hasNext()) {
            if (iterator2.next() < 15.6) {
                iterator2.remove();
            }
        }
        System.out.println(carros);

        System.out.println("\nInforme na ordem que foi dada: ");
        Map<String, Double> carros2 = new LinkedHashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("hb20", 16.1);
                put("moni", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carros2);

        System.out.println("\nInforme em ordem Natural: ");
        Map<String, Double> carros3 = new TreeMap<>(carros2);
        System.out.println(carros3);

    }

}
