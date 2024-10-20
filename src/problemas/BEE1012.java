package problemas;

import java.util.Scanner;

// - Área
public class BEE1012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, pi, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRentagulo;

        pi = 3.14159;
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        areaTrianguloRetangulo = a * c / 2;
        areaCirculo = pi * Math.pow(c, 2);
        areaTrapezio = (a + b) * c / 2;
        areaQuadrado = b * b;
        areaRentagulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRentagulo);

        entrada.close();
    }
}