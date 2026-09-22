public class Produto {

    String nome;
    double valor;
    int quantidadeEstoque;

    void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + valor);
        System.out.println("Estoque: " + quantidadeEstoque + " unidades\n");
    }
    void alterarNome (String novoNome) {
        nome = novoNome;
    }
    Produto(String nome, double valor, int quantidadeEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    }


