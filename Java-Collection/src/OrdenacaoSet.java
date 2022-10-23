import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class OrdenacaoSet {
    public static void main(String[] args) {     

        System.out.println("Ordem Aleatoria: ");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got", "fantasia", 56));
            add(new Serie("spn", "suspense", 40));
            add(new Serie("b99", "comedia", 20));
        }};
        for (Serie serie : series) {
            System.out.println(serie);
        }

        System.out.println("Ordem de inserção: ");
        Set<Serie> series1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 56));
            add(new Serie("spn", "suspense", 40));
            add(new Serie("b99", "comedia", 20));
        }};
        for (Serie serie : series1) {
            System.out.println(serie);
        }
        
        System.out.println("Ordem Natural Crescente: ");
        Set<Serie> series2 = new TreeSet<>(series1);

        for (Serie serie : series2) {
            System.out.println(serie);
        }

        System.out.println("Ordem Nome/Genero/Tempo");
        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroTempo());

        series3.addAll(series1);
        
        for (Serie serie : series3) {
            
            System.out.println(serie);
        }

    }
}


class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio = 0;

    public Serie(String nome, String genero, int tempoEpisodio){
        this.nome = nome;
        this.genero = genero;
        this. tempoEpisodio = tempoEpisodio;
    }

    public String getGenero() {
        return genero;
    }
    public String getNome() {
        return nome;
    }
    public int getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return ("nome: " + nome + ", genero: " + genero + ", tempoEpisodio: " + tempoEpisodio );
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return  false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie o) {
        int tempoEp = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
        if(tempoEp != 0)return tempoEp;
        return this.getGenero().compareTo(o.getGenero());
    }
}

class ComparatorNomeGeneroTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0 ) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0 ) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());



    }
}