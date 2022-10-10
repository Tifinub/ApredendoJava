import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        String nome = "";
        int idade; 

        while(!(nome.equals("0"))){

            System.out.println("Digite seu Nome: ");
            nome = scan.next();
            
            System.out.println("Digite sua Idade: ");
            idade = scan.nextInt();

            System.out.println("Seu nome é: " + nome);

            System.out.println("Sua idade é: " + idade);

        }
        scan.close();
    }
}
