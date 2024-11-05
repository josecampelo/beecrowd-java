package problemas;

import java.util.Scanner;

// - Sort Simples
public class BEE1042 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, maior, medio, menor;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if(a >= b && a >= c){
            maior = a;

            if(b >= c){
                medio = b;
                menor = c;
            }else{
                medio = c;
                menor = b;
            }
        }else if(b >= a && b >= c){
            maior = b;

            if(a >= c){
                medio = a;
                menor = c;
            }else{
                medio = c;
                menor = a;
            }
        }else{
            maior = c;

            if(a >= b){
                medio = a;
                menor = b;
            }else{
                medio = b;
                menor = a;
            }
        }

        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        entrada.close();
    }
}