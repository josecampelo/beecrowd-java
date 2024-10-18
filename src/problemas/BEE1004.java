package problemas;

import java.util.Scanner;

// - Produto Simples
public class BEE1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, prod;

        a = entrada.nextInt();
        b = entrada.nextInt();

        prod = a * b;

        System.out.println("PROD = " + prod);

        entrada.close();
    }
}
