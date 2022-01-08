package repeticao;

import java.util.Scanner;

public class Calculadora {
    Scanner entrada = new Scanner(System.in);

    /*
    Desenvolva um gerador de tabuada,
    capaz de gerar a tabuada de qualquer numero inteiro entre 1 e 10
    O usuario deve informar de qual numero ele deseja ver a tabuada.
    */
    public void tabuada(){
        System.out.print("Digite um numero para saber sua tabuada: ");
        int n = entrada.nextInt();
        System.out.println("A tabuada do " + n + ":");

        for (int i = 0; i <= 10; i++){
            int resultado = n*i;
            System.out.println(n + " x " + i + " = " + resultado );
        }

    }
    /*Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario*/
    public void fatorial(){

        System.out.print("Digite um numero para saber seu fatorial: ");
        int fatorial = entrada.nextInt();
        int aux = fatorial-1;
        System.out.print(fatorial);

        while (aux>0){
            fatorial = fatorial * aux;
            aux--;
        }
        if (fatorial == 0) fatorial = 1;
        System.out.print("! = " + fatorial );
    }
}
