public class TV {

    boolean energia = false;
    int canal = 1;
    int volume = 20;

    public void botaoEnergia (){
        energia = !energia;
        if(energia){
            System.out.println("A TV Foi ligada no Canal: " + canal + "\ne no volume: " + volume);
        } else {
            System.out.println("A TV foi desligada");
        }
    }
    public void mudarCanal(int novoCanal) {
        if(energia){
        canal = novoCanal;
        System.out.println("Canal mudado para: " + canal);
        } else {
            System.out.println("A TV esta desligada");
        }
    }

    public void aumentarVolume(){
        if(energia){
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("A TV esta desligada");
        }
    }

    public void diminuirVolume(){
        if(energia){
            volume--;
            System.out.println("Volume diminuido para: " + volume);
        } else {
            System.out.println("A TV esta Desligada");
        }
    }


}
