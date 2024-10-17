package problemas;

import java.util.Scanner;

// - Área do Círculo
public class BEE1002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n, raio, area;

        n = 3.14159;
        raio = entrada.nextDouble();

        area = raio * raio * n;

        System.out.printf("A=%.4f%n", area);

        entrada.close();
    }
}
