package problemas;

import java.util.Scanner;

// - Múltiplos
public class BEE1044 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b;

        a = entrada.nextInt();
        b = entrada.nextInt();

        if(a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

        entrada.close();
    }
}