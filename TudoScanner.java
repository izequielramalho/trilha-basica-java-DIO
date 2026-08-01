package estudos.Izequiel.sintaxejava.trilhaDIO;

import java.util.Scanner;

public class TudoScanner {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        Double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ola, me chamo " + nome + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + String.format("%.2f", altura) + " cm");
    }
}
