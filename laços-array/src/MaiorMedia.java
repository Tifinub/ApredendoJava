import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int contador = 0;

        int soma = 0;

        int numero;
        int maior = 0;

        do {
            System.out.println("Digite o numero: ");
            
            numero = scan.nextInt();

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }
            contador++;

        } while (contador < 5);

        int media = soma /contador;

        System.out.println("\nMedia: " + media + "\nMaior: " + maior);

        scan.close();

    }
}
