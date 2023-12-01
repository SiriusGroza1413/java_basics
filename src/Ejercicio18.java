import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String args[]) {

        Scanner tool = new Scanner(System.in);

        int currentNum = 0; // 4
        int maxNum = 0; // 2
        int minNum = 0;
        int total = 0;
        int positiveTotal = 0;
        int negativeTotal = 0;
        double average = 0;

        int counter = 0;

        System.out.println("Introduce numeros, -1 para finalizar y sumar");
        do {

            currentNum = tool.nextInt();

            if (currentNum != -1) {

                if (minNum > currentNum) {
                    minNum = currentNum;
                }

                if (maxNum < currentNum) {
                    maxNum = currentNum;
                }

                total = total + currentNum;

                if (currentNum > 0) {
                    positiveTotal = positiveTotal + currentNum;
                } else {
                    negativeTotal = negativeTotal + currentNum;
                }

            }

            counter++;

        } while (currentNum != -1);

        average = (double) total / (counter - 1);

        System.out.println("El numero mayor es: " + maxNum);
        System.out.println("El numero menor es: " + minNum);
        System.out.println("La suma de los numeros es " + total);
        System.out.println("La suma de los negativos es " + negativeTotal);
        System.out.println("La suma de los positivos es " + positiveTotal);
        System.out.println("La media de los numeros es " + average);

        tool.close();
    }
}
