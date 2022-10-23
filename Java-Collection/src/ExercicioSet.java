import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ExercicioSet {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>(Arrays.asList("Vermelho", "Laranga","Amarelo", "Verde", "Azul", "Violieta"));


        System.out.println("Imprima uma em baixo da outra");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println("Quantidade de cores: " + coresArcoIris.size());

        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);

        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("Violeta", "Azul","Verde", "Amarelo", "Laranja", "Vermelho"));

        System.out.println("Ordem Alfabetica: " + coresArcoIris2);

        System.out.println("Inversa de entrada: " + coresArcoIris3);

        System.out.println("Imprima que comece com a letra V: ");
        for (String cor : coresArcoIris) {
            if(cor.startsWith("V")){
                System.out.println(cor);
            }   
        }

        System.out.println(coresArcoIris);
        System.out.println("Remova todas as cores que não começam com a letra V: ");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) iterator.remove();
        }

        System.out.println(coresArcoIris);

    }
}
