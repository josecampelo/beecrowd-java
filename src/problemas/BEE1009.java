package problemas;

import java.util.Scanner;

// - Salário com Bônus
public class BEE1009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double salarioFixo, totalVendasMes, salarioTotalMes, comissao;

        nome = entrada.nextLine();
        salarioFixo = entrada.nextDouble();
        totalVendasMes = entrada.nextDouble();
        comissao = 0.15;

        salarioTotalMes = salarioFixo + totalVendasMes * comissao;

        System.out.printf("TOTAL = R$ %.2f%n",salarioTotalMes);

        entrada.close();
    }
}
