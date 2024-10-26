package problemas;

import java.util.Scanner;

// - Cédulas
public class BEE1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, resto, qtdNotas100, qtdNotas50, qtdNotas20, qtdNotas10, qtdNotas5, qtdNotas2, qtdNotas1;

        valor = entrada.nextInt();

        qtdNotas100 = valor / 100;
        resto = valor % 100;
        qtdNotas50 = resto / 50;
        resto = resto % 50;
        qtdNotas20 = resto / 20;
        resto = resto % 20;
        qtdNotas10 = resto / 10;
        resto = resto % 10;
        qtdNotas5 = resto / 5;
        resto = resto % 5;
        qtdNotas2 = resto / 2;
        resto = resto % 2;
        qtdNotas1 = resto;

        System.out.println(valor);
        System.out.println(qtdNotas100 + " nota(s) de R$ 100,00");
        System.out.println(qtdNotas50 + " nota(s) de R$ 50,00");
        System.out.println(qtdNotas20 + " nota(s) de R$ 20,00");
        System.out.println(qtdNotas10 + " nota(s) de R$ 10,00");
        System.out.println(qtdNotas5 + " nota(s) de R$ 5,00");
        System.out.println(qtdNotas2 + " nota(s) de R$ 2,00");
        System.out.println(qtdNotas1 + " nota(s) de R$ 1,00");

        entrada.close();
    }
}