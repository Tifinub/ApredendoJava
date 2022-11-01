package Map;

import java.util.*;
import java.util.Map.Entry;

public class OrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> livros = new HashMap<>() {
            {
                put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };

        System.out.println("Informe os Livro e seus Autores: ");
        imprimirLivro(livros);

        Map<String, Livro> livros2 = new LinkedHashMap<>() {
            {
                put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }
        };

        System.out.println("\nInforme os Livros na ordem de entrada: ");
        imprimirLivro(livros2);

        Map<String, Livro> livros3 = new TreeMap<>(livros);

        System.out.println("\nInforme na ordem alfabetica: ");
        imprimirLivro(livros3);

        System.out.println("Informe na ordem alfabetica dos livro: ");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNome());
        livros4.addAll(livros.entrySet());

        for (Map.Entry<String, Livro> entries : livros4) {
            System.out.println(entries.getKey() + " Escreveu: " + entries.getValue().getNome());
        }

    }

    // ======= Metodos =======

    public static void imprimirLivro(Map<String, Livro> livros) {
        for (Map.Entry<String, Livro> entries : livros.entrySet()) {
            System.out.println(entries.getKey() + " Escreveu: " + entries.getValue().getNome());
        }
    }

}

// ======= Class =======

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Livro livro = (Livro) obj;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return ("{nome: " + nome + ", paginas: " + paginas + "}");
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }

}