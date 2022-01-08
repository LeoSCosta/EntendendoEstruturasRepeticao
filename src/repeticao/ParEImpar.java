package repeticao;

import java.util.Scanner;

/*
Faça um programa que peça n numeros inteiros,
calcule e mostre a quantidade de numeros pares e impares
pare quando o valor de entrada for igual a zero.
*/
public class ParEImpar {
    Scanner entrada = new Scanner(System.in);

    public void contagem(){
        int par = 0;
        int impar = 0;
        int n;

        do  {
           System.out.print("Digite um numero: ");
           n = entrada.nextInt();
           int resto = n % 2;

           if (resto == 0) {
               ++par;
           } else {
               impar = 1 + impar;
           }

       }while (n!=0);

        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);
    }
}
