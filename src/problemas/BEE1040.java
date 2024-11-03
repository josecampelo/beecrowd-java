package problemas;

import java.util.Scanner;

// - Flores de Fogo
public class BEE1040 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, notaExame, media;
        int pesoN1, pesoN2, pesoN3, pesoN4, pesoTotal;

        pesoN1 = 2;
        pesoN2 = 3;
        pesoN3 = 4;
        pesoN4 = 1;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();
        nota4 = entrada.nextDouble();

        pesoTotal = pesoN1 + pesoN2 + pesoN3 + pesoN4;
        media = ((nota1 * pesoN1) + (nota2 * pesoN2) + (nota3 * pesoN3) + (nota4 * pesoN4)) / pesoTotal;

        System.out.printf("Media: %.1f%n", Math.floor(media * 10) / 10);

        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if(media < 5.0){
            System.out.println("Aluno reprovado.");
        }else {
            System.out.println("Aluno em exame.");
            notaExame = entrada.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            media = (media + notaExame) / 2.0;

            if(media >= 5.0){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", Math.floor(media * 10) / 10);
        }

        entrada.close();
    }
}