package estrutura_de_dados;

public class TesteVetor8 {
    static void main() {

        Vetor lista = new Vetor(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("B");
        lista.adiciona("D");

        lista.remove("B");
        lista.remove("X");

        System.out.println(lista);



    }

}
