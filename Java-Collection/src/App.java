import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        List<Double> notas = new ArrayList<>();

        notas.add(2d);
        notas.add(4d);
        notas.add(5.5d);
        notas.add(6.5d);
        notas.add(9d);
        notas.add(3d);
        notas.add(9.5d);

        System.out.println(notas.toString());

        System.out.println("A Nota 4 esta na posicao: " + notas.indexOf(4d));

        System.out.println("Adicione 8 a posicao 4");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Exiba a 3 nota:" + notas.get(2));


        System.out.println("Substitua a nota 5.5 pela 7");
        notas.set(notas.indexOf(5.5d),7d);
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem que foram informadas");

        // for (Double nota : notas) {
        //     System.out.println(nota);            
        // }
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            Double proximo = iterator.next();
            soma += proximo;
        }
        System.out.println("Exiba a soma de todas  as notas: "+ soma);

        System.out.println("A Media das notas: "  + (soma / notas.size()));

        System.out.println("Remova o item na posicao 1: ");
        notas.remove(0);
        System.out.println(notas);
        
        System.out.println("Remova todo numero menor que 6: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double proximo = iterator2.next();
            if(proximo < 6){
                iterator2.remove();
            }
        }

        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Verifique se esta vazia: " + notas.isEmpty());

    }
}
