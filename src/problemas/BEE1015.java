package problemas;

import java.util.Scanner;

// - Distância Entre Dois Pontos
public class BEE1015 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;
        String[] x1y1, x2y2;

        x1y1 = entrada.nextLine().split(" ");
        x2y2 = entrada.nextLine().split(" ");

        x1 = Double.parseDouble(x1y1[0]);
        y1 = Double.parseDouble(x1y1[1]);
        x2 = Double.parseDouble(x2y2[0]);
        y2 = Double.parseDouble(x2y2[1]);

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f%n", distancia);

        entrada.close();
    }
}