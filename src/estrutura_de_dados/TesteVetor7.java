package estrutura_de_dados;

public class TesteVetor7 {
    static void main() {

        Vetor lista = new Vetor(4);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");



        lista.remove(2);


        System.out.println(lista);
        System.out.println(lista.tamanho());





    }
}
