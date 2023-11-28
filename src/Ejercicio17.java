import javax.swing.JOptionPane;

public class Ejercicio17 {

    public static void main(String args[]){

        int counter = 0;
        int num;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce cualquier numero, (-1) para pausar el contador "));
            counter++;
        } while (num != -1);

        System.out.println("Introduciste " + (counter - 1) + " numeros en total");
    }
    
}
