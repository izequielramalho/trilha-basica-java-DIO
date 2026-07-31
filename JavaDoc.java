package estudos.Izequiel.sintaxejava.trilhaDIO;

/**
 * Classe de exemplo para demonstrar o JavaDoc
 * @author Izequiel
 * @version 1.0
 */
public class JavaDoc {

    /**
     * Soma dois números inteiros
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Verifica se o usuário é maior de idade
     * @param idade idade do usuário
     * @return true se maior de idade, false se não
     */
    public boolean maiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static void main(String[] args) {
        JavaDoc doc = new JavaDoc();

        System.out.println(doc.somar(5, 3));           // 8
        System.out.println(doc.maiorDeIdade(19));      // true
        System.out.println(doc.maiorDeIdade(16));      // false
    }
}