package repeticao;

public class Main {
    public static void main(String[] args) {
        NomeEIdade aluno = new NomeEIdade();
        aluno.getNomeIdade();

        Nota nota = new Nota();
        nota.nota();
        nota.cincoNumeros();


        ParEImpar n = new ParEImpar();
        n.contagem();

        Calculadora calculadora = new Calculadora();
        calculadora.fatorial();
    }
}
