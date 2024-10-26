package problemas;

import java.util.Scanner;

// - Idade em Dias
public class BEE1020 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idadeDias, resto, anos, meses, dias;

        idadeDias = entrada.nextInt();

        anos = idadeDias / 365;
        resto = idadeDias % 365;
        meses = resto / 30;
        resto = resto % 30;
        dias = resto;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        entrada.close();
    }
}