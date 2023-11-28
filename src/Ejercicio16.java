import javax.swing.JOptionPane;

public class Ejercicio16 {
    
    public static void main(String args[]){
        
        String op = JOptionPane.showInputDialog(
            null,
            "1: Suma \n2: Resta \n3: Multiplicacion \n4: Division \n5: Resto", "Elige una operacion",
            1
        );

        int val1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un valor numerico"));
        int val2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un segundo valor numerico"));

        switch(op){
            case "1":
                System.out.println(val1 + val2);
                break;
            case "2":
                System.out.println(val1 - val2);
                break;
            case "3":
                System.out.println(val1 * val2);
                break;
            case "4": 
                System.out.println(val1 / val2);
                break;
            case "5":
                System.out.println(val1 % val2);
                break;
            default:
                System.out.println("Algunos datos no fueron introducidos correctamente");
        }
    }

}
