import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[][] matriz = new int[4][4];

        int menor = 101;
        String coluna = "";

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){

            matriz[i][j] = random.nextInt(100);
                System.out.print(matriz[i][j] + " ");

                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                    coluna = " na Linha: " + (i+1) + " Coluna: " + (j+1);                  
                }

            }
            System.out.print("\n");
        }

        System.out.println("O Menor numero é: " + menor + "\nE ele estar " + coluna);


    }
}
