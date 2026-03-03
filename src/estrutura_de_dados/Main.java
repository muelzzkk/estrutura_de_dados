package estrutura_de_dados;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adicionar("Diogo");
        vetor.adicionar("João");
        vetor.adicionar("Samuel");

        vetor.verificarSeVetorVazio();
        vetor.ImprimirVetor();
        vetor.ultimoElementoValidoLista();
        vetor.buscarElemento("Samuel");
    }
}
