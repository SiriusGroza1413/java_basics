import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce un numero"));

        char character = obtainCharacter(num);

        if (num <= 32 || num >= 126) {
            System.out.println("Coloca un numero valido entre 33 y 125 para mostrar un caracter impreso");     
        }else{
            System.out.println("El numero " + num + " corresponde al caracter " + character);
        }
    }

    public static char obtainCharacter(int num) {
        return (char) num;
    }
}