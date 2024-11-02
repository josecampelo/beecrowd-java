package problemas;

import java.util.Scanner;

// - Lanche
public class BEE1038 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo, quantidade;
        double total;

        codigo = entrada.nextInt();
        quantidade = entrada.nextInt();

        switch (codigo){
            case 1:
                total = 4.00 * quantidade;
                break;
            case 2:
                total = 4.50 * quantidade;
                break;
            case 3:
                total = 5.00 * quantidade;
                break;
            case 4:
                total = 2.00 * quantidade;
                break;
            default:
                total = 1.50 * quantidade;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        entrada.close();
    }
}