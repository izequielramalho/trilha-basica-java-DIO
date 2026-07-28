
package estudos.Izequiel.sintaxejava.trilhaDIO;

public class Operadores {

    public static void main(String[] args) {

        // operador + com String = concatenação (une textos)
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto); // LinguagemJava

        String concatenacao = "?";

        // número + número + String = soma primeiro, depois concatena
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // 31

        // número + String = vira texto da esquerda pra direita
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao); // 1111

        // String no início = tudo vira texto
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao); // 1111

        // () força a soma antes de concatenar
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao); // 13

        int numero = 5;

        // unário - inverte o sinal
        numero = -numero;
        System.out.println(numero); // -5

        // * -1 também inverte o sinal
        numero = numero * -1;
        System.out.println(numero); // 5

        // incremento → adiciona 1 ao valor atual
        numero++;
        System.out.println(numero); // 6

        // decremento → subtrai 1 do valor atual
        numero--;
        System.out.println(numero); // 5

        // ternário → condição ? se verdadeiro : se falso
        String resultado = numero > 3 ? "maior que 3" : "menor ou igual a 3";
        System.out.println(resultado); // maior que 3

        // relacionais → comparam dois valores e retornam boolean
        System.out.println(numero == 5);  // true  → igual
        System.out.println(numero != 5);  // false → diferente
        System.out.println(numero > 3);   // true  → maior que
        System.out.println(numero < 3);   // false → menor que
        System.out.println(numero >= 5);  // true  → maior ou igual
        System.out.println(numero <= 5);  // true  → menor ou igual

        // lógicos → combinam condições
        boolean ativo = true;
        boolean logado = false;

        // && (E) → ambos precisam ser verdadeiros
        System.out.println(ativo && logado);  // false

        // || (OU) → pelo menos um precisa ser verdadeiro
        System.out.println(ativo || logado);  // true

        // ! (NÃO) → inverte o valor
        System.out.println(!ativo);   // false
        System.out.println(!logado);  // true
    }

}