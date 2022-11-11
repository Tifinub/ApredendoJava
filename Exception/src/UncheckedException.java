import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        Boolean bool = true;

        while (bool) {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = (Integer.parseInt(a) / Integer.parseInt(b));
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                bool = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }
}
