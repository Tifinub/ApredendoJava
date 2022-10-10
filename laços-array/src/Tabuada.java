import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int tabuada;
        int contador;
        System.out.print("Selecione um numero para Tabuada: ");
        tabuada = scan.nextInt();

        scan.close();

        for(contador = 1; contador <= 10; contador++){
            System.out.println(tabuada + " x " + contador + " = " + tabuada*contador);
        }

        


    }
}
