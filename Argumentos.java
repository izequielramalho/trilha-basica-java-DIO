package estudos.Izequiel.sintaxejava.trilhaDIO;

// args[] → array que recebe os argumentos passados no terminal
// exemplo de execução:
// java AboutMe IZEQUIEL RAMALHO 20 1.70

public class Argumentos {

    public static void main(String[] args) {

        // args[0] → primeiro argumento → nome
        String nome = args[0];

        // args[1] → segundo argumento → sobrenome
        String sobreNome = args[1];

        // Integer.valueOf → converte String para int
        int idade = Integer.valueOf(args[2]);

        // Double.valueOf → converte String para double
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm");
    }
}

//O integer e Double.valueOf vai converter o texto em números