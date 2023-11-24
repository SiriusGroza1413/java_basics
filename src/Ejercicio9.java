import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner tool = new Scanner(System.in);

        double iva = 0.21;

        System.out.print("Ingrese el precio del producto: ");
        double price = tool.nextDouble();

        double totalPrice = price + (price * iva);

        System.out.println("El precio total de pruducto + IVA 21% es: " + totalPrice);

        tool.close();

    }
}
