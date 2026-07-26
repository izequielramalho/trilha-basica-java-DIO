
package estudos.Izequiel.sintaxejava.trilhaDIO;

public class Operadores {

    public static void main(String[] args) {

        // OPERADOR DE ATRIBUIÇÃO (=) + OPERADOR DE CONCATENAÇÃO (+)
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto); // LinguagemJava

        // OPERADOR DE ATRIBUIÇÃO (=)
        String concatenacao = "?";

        // OPERADORES ARITMÉTICOS (+) + OPERADOR DE CONCATENAÇÃO (+)
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // 31

        // OPERADOR DE CONCATENAÇÃO (+)
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao); // 1111

        // OPERADOR DE CONCATENAÇÃO (+)
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao); // 1111

        // OPERADOR DE AGRUPAMENTO ( ) + OPERADORES ARITMÉTICOS (+)
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao); // 13

        // OPERADOR DE ATRIBUIÇÃO (=)
        int numero = 5;

        // OPERADOR UNÁRIO (-)
        numero = -numero;
        System.out.println(numero); // -5

        // OPERADOR ARITMÉTICO (*) + OPERADOR UNÁRIO (-)
        numero = numero * -1;
        System.out.println(numero); // 5
    }
}