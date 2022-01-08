package repeticao;

import java.util.Scanner;

/*
Faça um program que peça uma nota, entre zero e dez.
mostre uma mensagem caso o valor seja invalido
e continue pedindo até que o usuario informe um valor valido.
 */
/*
Faça um program que leia 5 numeros
e informe o maior numero e a media desses numeros
 */
public class Nota {
    Scanner entrada = new Scanner(System.in);

    public void nota(){
        System.out.print("Nota: ");
        int aux = entrada.nextInt();
        if(!(aux >= 0 && aux <= 10)){
            System.out.println("O valor inválido!");
            System.out.println("insira um numero de 1 a 10.");
            nota();
        }
    }

    public void cincoNumeros(){
        System.out.println("Digite 5 numeros.");
        int media = 0;
        int maior = 0;
        int n;

        for(int i=1; i <= 5; i++){

            System.out.print("Digite o " + i + "° numero: ");
            n = entrada.nextInt();
            media += n;

            if(maior < n){
               maior = n;
            }
        }
        media = media/5;
        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("A media dos numeros digitados foi: " + media);
    }
}
