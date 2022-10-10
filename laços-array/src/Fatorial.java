import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero para calcular Fatorial: ");
        int numero = scan.nextInt();

        long mutiplicacao = 1;

        for(int contador = numero; contador > 0; contador--){
            mutiplicacao *= contador;
        }

        System.out.println(numero + "! = " + mutiplicacao);

        scan.close();



    }
    
}
