import java.util.Scanner;

import Estrutura.Carro;
import Relacoes.Heranca.*;
// import Relacoes.Associacoes.*;
// import Relacoes.Interfaces.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha: \n"+
                            "Estrutura: 1 \n"+
                            "Heranca: 2 ");
                            
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1: Estrutura();
                
                break;
        
            default:
                break;
            
            case 2: heranca();
                break;
        }

        scan.close();


    }

public static void Estrutura() {

        String[] cores = {"Branco", "Preto", "Vermelho"};
        String[] modelos = {"Mercedes", "Toyota", "Ferarri"};

        double valorGasolina =  5.30;  

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setCor(cores[0]);
        carro1.setModelo(modelos[0]);
        carro1.setTanqueTotal(45);

        carro2.setCor(cores[1]);
        carro2.setModelo(modelos[1]);
        carro2.setTanqueTotal(50);

        System.out.println("Carro 1 cor: " + carro1.getCor());
        System.out.println("Carro 1 modelo: " + carro1.getModelo());
        System.out.println("Carro 1 Tanque: " + carro1.getTanqueTotal());
        System.out.println("Custo para encher o tanque do Carro 1: " + carro1.totalValorTanque(valorGasolina));

        System.out.println("\nCarro 2 cor: " + carro2.getCor());
        System.out.println("Carro 2 modelo: " + carro2.getModelo());
        System.out.println("Carro 2 Tanque: " + carro2.getTanqueTotal());
        System.out.println("Custo para encher o tanque do Carro 2: " + carro2.totalValorTanque(valorGasolina));
    }

    public static void heranca() {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
        
    }

