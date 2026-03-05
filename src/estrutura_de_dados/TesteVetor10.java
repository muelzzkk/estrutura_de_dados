package estrutura_de_dados;

public class TesteVetor10 {
    public static void main(String[] args) {

        Vetor lista = new Vetor(8);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");
        lista.adiciona("D");
        lista.adiciona("B");
        lista.adiciona("E");
        lista.adiciona("A");



        lista.removerTodos("A");
        lista.removerTodos("B");


        System.out.println(lista);


    }
}
