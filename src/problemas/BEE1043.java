package problemas;

import java.util.Scanner;

// - Triângulo
public class BEE1043 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, perimetro, area;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        if(a + b > c && a + c > b && b + c > a){
            perimetro = a + b + c;

            System.out.printf("Perimetro = %.1f%n", perimetro);
        }else{
            area = (a + b) * c / 2;

            System.out.printf("Area = %.1f%n", area);
        }

        entrada.close();
    }
}