package problemas;

import java.util.Scanner;

// - Notas e Moedas
public class BEE1021 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, resto, qtdNotas100, qtdNotas50, qtdNotas20, qtdNotas10, qtdNotas5, qtdNotas2,
                qtdMoedas1, qtdMoedas050, qtdMoedas025, qtdMoedas010, qtdMoedas005, qtdMoedas001;

        valor = (int)Math.round(entrada.nextDouble() * 100);

        qtdNotas100 = valor / 10000;
        resto = valor % 10000;
        qtdNotas50 = resto / 5000;
        resto = resto % 5000;
        qtdNotas20 = resto / 2000;
        resto = resto % 2000;
        qtdNotas10 = resto / 1000;
        resto = resto % 1000;
        qtdNotas5 = resto / 500;
        resto = resto % 500;
        qtdNotas2 = resto / 200;
        resto = resto % 200;
        qtdMoedas1 = resto / 100;
        resto = resto % 100;
        qtdMoedas050 = resto / 50;
        resto = resto % 50;
        qtdMoedas025 = resto / 25;
        resto = resto % 25;
        qtdMoedas010 = resto / 10;
        resto = resto % 10;
        qtdMoedas005 = resto / 5;
        resto = resto % 5;
        qtdMoedas001 = resto;

        System.out.println("NOTAS:");
        System.out.println(qtdNotas100 + " nota(s) de R$ 100.00");
        System.out.println(qtdNotas50 + " nota(s) de R$ 50.00");
        System.out.println(qtdNotas20 + " nota(s) de R$ 20.00");
        System.out.println(qtdNotas10 + " nota(s) de R$ 10.00");
        System.out.println(qtdNotas5 + " nota(s) de R$ 5.00");
        System.out.println(qtdNotas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(qtdMoedas1 + " moeda(s) de R$ 1.00");
        System.out.println(qtdMoedas050+ " moeda(s) de R$ 0.50");
        System.out.println(qtdMoedas025 + " moeda(s) de R$ 0.25");
        System.out.println(qtdMoedas010 + " moeda(s) de R$ 0.10");
        System.out.println(qtdMoedas005 + " moeda(s) de R$ 0.05");
        System.out.println(qtdMoedas001 + " moeda(s) de R$ 0.01");

        entrada.close();
    }
}