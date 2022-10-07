public class Usuario {
    public static void main(String[] args) throws Exception {

        TV minhaTV = new TV();

        minhaTV.botaoEnergia();

        minhaTV.aumentarVolume();
        
        minhaTV.mudarCanal(15);
        
        minhaTV.botaoEnergia();

        minhaTV.diminuirVolume();


    }
}
