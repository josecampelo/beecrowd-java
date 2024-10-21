package problemas;

import java.util.Scanner;

// - O Maior
public class BEE1013 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, maiorAB, maiorAC, maiorBC;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maiorAC = (a + c + Math.abs(a - c)) / 2;

        if(maiorAB > maiorAC){
            System.out.println(maiorAB + " eh o maior");
        }else{
            System.out.println(maiorAC + " eh o maior");
        }

        entrada.close();
    }
}
