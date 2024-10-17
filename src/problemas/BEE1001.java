package problemas;

import java.util.Scanner;

public class BEE1001 {
    public static void main(String[] args) {
        int a, b, x;
        Scanner entrada = new Scanner(System.in);

        a = entrada.nextInt();
        b = entrada.nextInt();

        x = a + b;

        System.out.println("X = " + x);
    }
}