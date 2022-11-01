package Lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaExercicios01 {
    public static void main(String[] args) {
        List<Clima> listaTemperatura = new ArrayList<>() {
            {
                add(new Clima(22.9, "Janeiro"));
                add(new Clima(24.5, "Fevereiro"));
                add(new Clima(23.2, "Março"));
                add(new Clima(19.7, "Abril"));
                add(new Clima(18.3, "Maio"));
                add(new Clima(20.2, "Junho"));
            }
        };

        Iterator<Clima> iterator = listaTemperatura.iterator();

        double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next().getTemperatura();
        }

        int n = 0;
        for (int x = 0; x < 6; x++) {
            if ((listaTemperatura.get(x).getTemperatura()) > (soma / listaTemperatura.size())) {
                n++;
                System.out.print(n + " - " + listaTemperatura.get(x).getMes() + " ");
            }
        }

    }
}

class Clima {

    private double temperatura;
    private String mes;

    public Clima(double temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return ("Mes: " + mes + ", Temperatura: " + temperatura);
    }

}
