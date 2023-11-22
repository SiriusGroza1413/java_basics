import javax.swing.JOptionPane;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        String number = JOptionPane.showInputDialog(null, "Introduce un numero divisible por 2");

        if(Integer.parseInt(number) % 2 == 0){
            JOptionPane.showMessageDialog(null, "Es divisible por 2");
        } else {
            JOptionPane.showMessageDialog(null, "No es divisible por 2");
        }
        
    }
}
