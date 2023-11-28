import javax.swing.JOptionPane;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        String userDay = JOptionPane.showInputDialog(null, "Introduce un día de la semana");

        switch (userDay) {
            case "lunes": 
                System.out.println("Es día laboral");
                break;
            case "martes": 
                System.out.println("Es día laboral");
                break;
            case "miercoles": 
                System.out.println("Es día laboral");
                break;
            case "jueves": 
                System.out.println("Es día laboral");
                break;
            case "viernes": 
                System.out.println("Es día laboral");
                break;
            case "sabado": 
                System.out.println("No es dia laboral");
                break;
            case "domingo": 
                System.out.println("No es dia laboral");
                break;
            default:
                System.out.println("No introduciste ningun día valido");

        }
    }
}
