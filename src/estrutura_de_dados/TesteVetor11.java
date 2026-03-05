package estrutura_de_dados;

public class TesteVetor11 {
    public static void main(String[] args) {

        Vetor lista = new Vetor(3);

        lista.adicionarSeNaoExiste("A");
        lista.adicionarSeNaoExiste("A");
        lista.adicionarSeNaoExiste("A");

        System.out.println(lista);

    }
}
