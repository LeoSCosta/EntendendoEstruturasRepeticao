package repeticao;

import java.util.Scanner;

/*
Faça um programa que leia um conjunto de dois valores,
o primeiro presentando o nome  do aluno e
o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)

 */
public class NomeEIdade {
    Scanner entrada = new Scanner(System.in);
    String nome;
    int idade;

    public void getNomeIdade() {
        System.out.print("Nome: ");
        nome = entrada.next();

        if (!(nome.equals("0"))) {
            System.out.print("Idade: ");
            idade = entrada.nextInt();
            getNomeIdade();
        }

    }
}
