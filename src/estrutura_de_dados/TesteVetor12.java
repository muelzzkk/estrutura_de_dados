package estrutura_de_dados;

public class TesteVetor12 {
    public static void main(String[] args) {

        Vetor lista = new Vetor(2);

        lista.adiciona("A");
        lista.adiciona("C");
        lista.adiciona("D");

        System.out.println(lista);

        lista.inserirDepois("A","B");

        System.out.println(lista);

    }
}
