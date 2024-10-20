package problemas;

import java.util.Scanner;

// - Cálculo Simples
public class BEE1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigoPeca1, codigoPeca2, numeroPecas1, numeroPecas2;
        double valorPeca1, valorPeca2, valorTotalPeca;
        String[] entradaPeca1, entradaPeca2;

        entradaPeca1 = entrada.nextLine().split(" ");
        entradaPeca2 = entrada.nextLine().split(" ");

        codigoPeca1 = Integer.parseInt(entradaPeca1[0]);
        numeroPecas1 = Integer.parseInt(entradaPeca1[1]);
        valorPeca1 = Double.parseDouble(entradaPeca1[2]);

        codigoPeca2 = Integer.parseInt(entradaPeca2[0]);
        numeroPecas2 = Integer.parseInt(entradaPeca2[1]);
        valorPeca2 = Double.parseDouble(entradaPeca2[2]);

        valorTotalPeca = numeroPecas1 * valorPeca1 + numeroPecas2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotalPeca);

        entrada.close();
    }
}