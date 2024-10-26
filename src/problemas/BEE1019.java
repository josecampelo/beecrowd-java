package problemas;

import java.util.Scanner;

// - Conversão de Tempo
public class BEE1019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tempoSegundos, resto, horas, minutos, segundos;

        tempoSegundos = entrada.nextInt();

        horas = tempoSegundos / 3600;
        resto = tempoSegundos % 3600;
        minutos = resto / 60;
        resto = resto % 60;
        segundos = resto;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        entrada.close();
    }
}