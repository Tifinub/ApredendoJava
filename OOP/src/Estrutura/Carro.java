package Estrutura;

public class Carro {

    String cor;
    String modelo;
    double tanqueTotal;

    public Carro(){

    }

    public Carro(String cor, String modelo, int tanqueTotal) {
        this.cor = cor;
        this.modelo = modelo;
        this.tanqueTotal = tanqueTotal;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
       return modelo;
    }

    public void setTanqueTotal(double tanqueTotal){
        this.tanqueTotal = tanqueTotal;
    }
    public double getTanqueTotal(){
       return tanqueTotal;
    }

    public double totalValorTanque(double valorCombustivel) {
        return tanqueTotal * valorCombustivel;
    }

}
