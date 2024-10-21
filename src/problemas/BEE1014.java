package problemas;

import java.util.Scanner;

// - Consumo
public class BEE1014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int distanciaTotalPercorrida;
        double totalCombustivelGasto, consumoMedio;

        distanciaTotalPercorrida = entrada.nextInt();
        totalCombustivelGasto = entrada.nextDouble();

        consumoMedio = distanciaTotalPercorrida / totalCombustivelGasto;

        System.out.printf("%.3f km/l%n", consumoMedio);

        entrada.close();
    }
}