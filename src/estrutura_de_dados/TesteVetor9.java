package estrutura_de_dados;

public class TesteVetor9 {
    public static void main(String[] args) {

        Vetor lista = new Vetor(6);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("B");
        lista.adiciona("D");
        lista.adiciona("B");



        System.out.println(lista);

        int indice = lista.indiceUltimo("B");

        System.out.println("Último índice de B: " + indice);


    }
}
