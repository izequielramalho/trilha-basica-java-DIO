package estudos.Izequiel.sintaxejava.trilhaDIO;

// import → importa recursos externos

import java.util.Scanner;

// public → acessível por todos
// class → declara a classe
public class PalavrasReservadas {

    // static → pertence à classe, não ao objeto
    // final → valor que não pode ser alterado
    static final String LINGUAGEM = "Java";

    // private → acessível só por esta classe
    private int numero = 10;

    // public → acessível por todos
    // void → método sem retorno
    public void exemplos() {

        // new → cria um objeto
        Scanner scanner = new Scanner(System.in);

        // int → número inteiro
        int idade = 19;

        // boolean → verdadeiro ou falso
        boolean ativo = true;

        // if e else → condicionais
        if (ativo) {
            System.out.println("está ativo!");
        } else {
            System.out.println("não está ativo!");
        }

        // for → loop com número fixo de repetições
        for (int i = 0; i < 3; i++) {
            System.out.println("repetição: " + i);
        }

        // while → repete enquanto condição for verdadeira
        while (idade < 21) {
            idade++;
        }

        // this → referencia a própria classe
        System.out.println(this.numero);
        System.out.println(LINGUAGEM);
    }

    // main → ponto de entrada do programa
    public static void main(String[] args) {
        PalavrasReservadas p = new PalavrasReservadas();
        p.exemplos();
    }
}