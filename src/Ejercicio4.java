import javax.swing.JOptionPane;

public class Ejercicio4 {
    
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Introduce tu nombre");

        JOptionPane.showMessageDialog(null, "Bienvenido " + (name));
    }
}
