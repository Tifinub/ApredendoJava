public class Imprimir {

    // Exercisio para Sobrecarga de Metodos

    public static void nome(String nome){
        System.out.println("Seu nome é:" + nome);
    }

    public static void nome(String nome, String segundoNome){
        System.out.println("Seu nome é:" + nome + " " + segundoNome);
    }

    public static void nome(String nome, String segundoNome, int idade){
        System.out.println("Seu nome é:" + nome + " " + segundoNome + " Idade: " + idade);
    }
    

}
