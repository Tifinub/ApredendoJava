import java.util.Scanner;

public class Nota {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int nota;
            
        while(true){
            nota = scan.nextInt();
            System.out.println(nota);
            if(nota <= 10 && nota >= 0) break;
            else {
                System.out.println(("Digite um numero entre 0 e 10"));
            }


        }

        scan.close();
    }
}
