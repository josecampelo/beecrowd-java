package problemas;

import java.util.Scanner;

// - Salário
public class BEE1008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroFuncionario, numeroHorasTrabalhadas;
        double valorHoraTrabalhada, salarioFuncionario;

        numeroFuncionario = entrada.nextInt();
        numeroHorasTrabalhadas = entrada.nextInt();
        valorHoraTrabalhada = entrada.nextDouble();

        salarioFuncionario = valorHoraTrabalhada * numeroHorasTrabalhadas;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n",salarioFuncionario);

        entrada.close();
    }
}