package problemas;

import java.util.Scanner;

// - Diferença
public class BEE1007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, d, diferenca;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);

        entrada.close();
    }
}