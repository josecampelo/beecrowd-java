package problemas;

import java.util.Scanner;

// - Sort Simples
public class BEE1042 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, grande, medio, pequeno;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        if(a >= b && a >= c){
            if(b >= c){
                grande = a;
                medio = b;
                pequeno = c;
            }else{
                grande = a;
                medio = c;
                pequeno = b;
            }
        }else if(b >= a && b >= c){
            if(a >= c){
                grande = b;
                medio = a;
                pequeno = c;
            }else{
                grande = b;
                medio = c;
                pequeno = a;
            }
        }else{
            grande = c;

            if(a >= b){
                medio = a;
                pequeno = b;
            }else{
                medio = b;
                pequeno = a;
            }
        }

        System.out.println(pequeno);
        System.out.println(medio);
        System.out.println(grande);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        entrada.close();
    }
}