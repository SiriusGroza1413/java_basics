import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {

        Scanner tool = new Scanner(System.in);

        int num = 0;

        do {
            System.out.println("Introduce un numero menor a cero");
            num = tool.nextInt();
        } while (num < 0);

        System.out.println("Numero: " + num);

        tool.close();
    }

}
