import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        int totalHours = Integer.parseInt(JOptionPane.showInputDialog("Introduce horas totales de este mes"));

        int totalPay = totalHours * 15;

        JOptionPane.showMessageDialog(null, "El sueldo de este mes segun tus horas corresponde a " + "$" + totalPay);
    }
}
