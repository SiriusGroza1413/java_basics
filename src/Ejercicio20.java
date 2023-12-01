import javax.swing.JOptionPane;

public class Ejercicio20 {
    
    public static void main(String[] args) {

        int impares = 0;
        int pares = 0;
        
        int inputNum = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero cualquiera"));

        for (int i = 1; i <= inputNum; i++) {
            if (i % 2 == 0) {
                pares = pares + i;
            } else {
                impares = impares + i;
            }
        }

        System.out.println("La suma de pares fue de: " + pares);
        System.out.println("La suma de impares fue de: " + impares);
    }
}
