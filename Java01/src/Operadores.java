public class Operadores {
    public static void main(String[] args) throws Exception {

        int numero1 = 8;
        int numero2 = 20;

        //Checando se algo e maior
        if(numero1 > numero2){
            System.out.print("Numero 1 é Maior\n");
        }else {
            System.out.print("Numero 2 é maior");
        }


        int x;
        int y = 0;
        
        //Usando += e ++
        for(x = 0; x < 10; x++){
            y += x;
            System.out.print("\nx: " + x + "\ny: " + y);
        }

        //Invertendo o Verdadeiro/Falso
        if(!(x > numero1)){
            System.out.print("\nNUmero 1 é maior que X");
        }else {
            System.out.print("\nx é meior que numero 1");
        }

    }
}