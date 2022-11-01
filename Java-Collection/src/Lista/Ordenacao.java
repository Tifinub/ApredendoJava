package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>() {
            {
                add(new Gato("Abae", 7, "Amarelo"));
                add(new Gato("Enzo", 1, "Branco"));
                add(new Gato("Lirou", 2, "Cinza"));
            }
        };

        System.out.println("Ordem de inserção: ");
        System.out.println(gatos);

        System.out.println("Ordem Aleatoria: ");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Ordem Natural: ");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Ordem por Idade: ");
        // Collections.sort(gatos ,new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Ordem por Cor: ");
        // Collections.sort(gatos ,new ComparatorCor());
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Ordem por Nome/Cor/Idade: ");
        // Collections.sort(gatos ,new ComparatorNomeCorIdade());
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return ("{Nome='" + nome + "', idade='" + idade + "', cor='" + cor + "'}");
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.nome);
    }

}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());

        if (nome != 0) {
            return nome;
        }

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getNome());

        if (nome != 0) {
            return cor;
        }

        return Integer.compare(gato1.getIdade(), gato2.getIdade());

    }

}
