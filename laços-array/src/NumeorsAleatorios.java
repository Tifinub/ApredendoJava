import java.util.Random;

public class NumeorsAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeroAleatorios = new int[20];

        System.out.print("Numeros: ");
        for(int i = 0; i < 20; i++){
            numeroAleatorios[i] = random.nextInt(100);
            System.out.print(numeroAleatorios[i] + " ");
        }
        System.out.print("\nSucessores: ");
        for(int i = 0; i < 20; i++){
            System.out.print((numeroAleatorios[i]+1) + " ");
        }

        System.out.print("\nAntecessores: ");
        for(int i = 0; i < 20; i++){
            System.out.print((numeroAleatorios[i]-1) + " ");
        }
    }
}
