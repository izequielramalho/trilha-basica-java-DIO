package estudos.Izequiel.sintaxejava.trilhaDIO;

public class Escopo {

    // atributo de classe → acessível em qualquer método
    int atributo = 10;

    public void metodo() {

        // variável de método → só existe aqui dentro
        int numero = 5;

        if (numero > 3) {
            // variável de bloco → só existe dentro do if
            int resultado = numero + atributo;
            System.out.println(resultado); // 15
        }

        // resultado não existe aqui → causa erro!
        System.out.println(atributo); // funciona → é da classe
        System.out.println(numero);   // funciona → é do método
    }
}

