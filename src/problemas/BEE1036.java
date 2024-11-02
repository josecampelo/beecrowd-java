package problemas;

import java.util.Scanner;

// - Fórmula de Bhaskara
public class BEE1036 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        delta = (b * b) - (4 * a * c);

        if( a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else{
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }

        entrada.close();
    }
}