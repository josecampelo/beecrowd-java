package problemas;

import java.util.Scanner;

// - Gasto de Combustível
public class BEE1017 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tempo, velocidade;
        double distanciaPercorrida, quantidadeCombustivel;

        tempo = entrada.nextInt();
        velocidade = entrada.nextInt();

        distanciaPercorrida = tempo * velocidade;
        quantidadeCombustivel = distanciaPercorrida / 12;

        System.out.printf("%.3f%n", quantidadeCombustivel);

        entrada.close();
    }
}