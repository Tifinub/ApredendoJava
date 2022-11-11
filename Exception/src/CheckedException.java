import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String arquivo = "arquivo.txt";
        try {
            imprimirArquivo(arquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do Arquivo");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado");

        }

        System.out.println("Roda da mesma maneira");

    }

    public static void imprimirArquivo(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();

    }
}
