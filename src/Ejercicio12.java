import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner tool = new Scanner(System.in);

        System.out.println("Introduce el numero de ventas totales");
        int selled = tool.nextInt();

        double sum = 0;

        
        for (int i = 1; i <= selled; i++) {
            System.out.println("Ingrese el valor de la venta " + i + ":");
            double totalAmount = tool.nextDouble();
            sum = sum + totalAmount;
        } 

        System.out.println("La suma total de todas las ventas es de: $" + sum);

        tool.close();

    }
    
}
