import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String[] letras = new String[6];

        int quantidadeConsoantes = 0;

        for(int x = 0; x < letras.length; x++){
            
            System.out.print("Digite uma letra: ");

            letras[x] = scan.next();


        }


        System.out.print("Consoantes: ");

        for(String letra : letras){

            if( !(letra.equalsIgnoreCase("a") | 
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))){
            System.out.print(letra + " ");
            quantidadeConsoantes++;
            } 
        }

        System.out.println("\nUm total de " + quantidadeConsoantes + " Consoantes");

        scan.close();
        
    }
    
}
