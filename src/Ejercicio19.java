import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String args[]){

        int factorial = 1;
        int inputNum = 0;

        Scanner tool = new Scanner(System.in);

        System.out.println("Introduce un numero para calcular su factorial");
        inputNum = tool.nextInt();

        tool.close();
        
        for (int i = 1; i <= inputNum; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de: " + inputNum + " es " + factorial );
    }
}
