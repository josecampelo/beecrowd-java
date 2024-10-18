package problemas;

import java.util.Scanner;

// Média 1
public class BEE1005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, pesoA, pesoB, media;

        pesoA = 3.5;
        pesoB = 7.5;
        a = entrada.nextDouble();
        b = entrada.nextDouble();

        media = ((a * pesoA) + (b * pesoB)) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f%n", media);

        entrada.close();
    }
}