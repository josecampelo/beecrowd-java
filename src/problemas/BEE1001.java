package problemas;

import java.util.Scanner;

// - Extremamente Básico
public class BEE1001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, x;

        a = entrada.nextInt();
        b = entrada.nextInt();

        x = a + b;

        System.out.println("X = " + x);

        entrada.close();
    }
}