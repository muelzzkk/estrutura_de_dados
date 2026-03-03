package estrutura_de_dados;

public class Vetor {
    private String[] lista;
    private int tamanho;

    // Construtor do vetor; irá definir a quantidade de valores que o vetor terá, e definirá o tamanho como 0.
    public Vetor(int quantidade) {
        this.lista = new String[quantidade];
        this.tamanho = 0;
    }

    // Método para adicionar algo ao vetor.
    public void adicionar(String elemento) {
        this.lista[tamanho] = elemento;
        tamanho++;
    }

    // Esse método irá verificar se o vetor está vazia; retornando true caso esteja.
    public boolean verificarSeVetorVazio() {
        if (tamanho == 0) {
            System.out.println("O Vetor está vazio.");
            return true;
        }
        return false;
    }

    // Método para pegar o ultimo elemento válido, caso esteja vazio; uma exception irá ser lançada.
    public void ultimoElementoValidoLista() {
        if (verificarSeVetorVazio()) {
            throw new IllegalStateException("Elemento não pode ser encontrado");
        } else {
            System.out.println(lista[tamanho - 1]);
        }
    }

    // Método para imprimir toda a lista, usando o for.
    public void ImprimirVetor() {
        for (String s : lista) {
            System.out.println(s);
        }
    }

    public boolean buscarElemento(String elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(elemento)) {
                System.out.println("O Elemento está no Vetor, no Indíce " + i);
                return true;
            }
        }
        return false;
    }

}
