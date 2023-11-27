import javax.swing.JOptionPane;

public class Ejercicio14 {
    
    public static void main(String[] args){

        // declarar la contraseña
        String password = "bai";
        int counter = 0;
        String userPass = "";
        boolean isCorrect = false;

      
            while (isCorrect == false && counter < 3) { //mientras el numero de intentos sea menor a 3 y no sea correcta...

                userPass = JOptionPane.showInputDialog("Introduce la contraseña");

                if (!password.equals(userPass)) {                                                           //comparacion
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta!");
                    counter++;                                                                   //aumento el numero de intentos 
                } else {
                    isCorrect = true;                                                   //seteo el validador a true para salr del bucle
                    JOptionPane.showMessageDialog(null, "Contraseña correcta");
                }
            }

    
    }
}
