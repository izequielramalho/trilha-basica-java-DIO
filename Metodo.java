package estudos.Izequiel.sintaxejava.trilhaDIO;

public class Metodo {

    // método sem retorno → só executa uma ação
    public void saudacao() {
        System.out.println("Olá! Seja bem-vindo.");
    }

    // método com retorno → executa e devolve um valor
    public String getNome() {
        return "Izequiel";
    }

    // método com parâmetro → recebe um valor para trabalhar
    public void apresentar(String nome) {
        System.out.println("Meu nome é " + nome);
    }

    // método com parâmetro e retorno → recebe e devolve
    public int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Metodo metodo = new Metodo();

        // chamando cada método
        metodo.saudacao();           // Olá! Seja bem-vindo.
        metodo.getNome();            // não imprime, só retorna
        metodo.apresentar("Izequiel"); // Meu nome é Izequiel
        System.out.println(metodo.somar(2, 3)); // 5
    }
}

