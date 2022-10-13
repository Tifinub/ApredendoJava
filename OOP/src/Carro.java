public class Carro {

    String cor;
    String modelo;
    double tanqueTotal;

    Carro(){

    }

    Carro(String cor, String modelo, int tanqueTotal) {
        this.cor = cor;
        this.modelo = modelo;
        this.tanqueTotal = tanqueTotal;
    }

    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
       return modelo;
    }

    void setTanqueTotal(double tanqueTotal){
        this.tanqueTotal = tanqueTotal;
    }
    double getTanqueTotal(){
       return tanqueTotal;
    }

    double totalValorTanque(double valorCombustivel) {
        return tanqueTotal * valorCombustivel;
    }

}
