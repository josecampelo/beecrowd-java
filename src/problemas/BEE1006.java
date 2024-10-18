package problemas;

import java.util.Scanner;

// - Média 2
public class BEE1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, pesoA, pesoB, pesoC, media;

        pesoA = 2;
        pesoB = 3;
        pesoC = 5;
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        media = ((a * pesoA) + (b * pesoB) + (c * pesoC)) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f%n", media);

        entrada.close();
    }
}
