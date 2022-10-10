import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos Numero: ");
        int numeros = scan.nextInt();

        int count = 0;

        int numero;

        int par = 0;
        int impar = 0;

        do{
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            if((numero % 2) == 0){
                par++;
            } else {
                impar++;
            }
            count++;
        }while(numeros > count);

        System.out.println("Impares: " + impar + "\nPares: " + par);


        scan.close();

    }
}
