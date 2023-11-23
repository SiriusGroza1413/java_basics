import javax.swing.JOptionPane;


public class Ejercicio6 {

    public static void main(String[] args) {
        
        int num;
        int plus = 0;

        do {

            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero diferente de 1"));

            if (num <= 1) {
                System.out.println("El numero debe ser mayor a 1");
            }

        } while (num <= 1);

        for (int counter = 1; counter <= num; counter++){
            plus = plus + counter;
        }

        System.out.println("La suma total es: " + (plus));
    }

}