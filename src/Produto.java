public class Produto {

    //Intáncias da classe
    private String nome;
    private double valor;
    private int quantidadeEstoque;

    //Método
    void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + valor);
        System.out.println("Estoque: " + quantidadeEstoque + " unidades");
    }

    //Metodo que utiliza parâmetros
    void alterarNome (String novoNome) {
        nome = novoNome;
    }


    //Contrutor com parâmetros
    Produto(String nome, double valor, int quantidadeEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    }


