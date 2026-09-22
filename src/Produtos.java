public class Produtos {

    String nome;
    double valor;
    int quantidadeEstoque;

    void exibirInformacoes() {
        System.out.println(nome);
        System.out.println(valor);
        System.out.println(quantidadeEstoque + "\n");
    }
    void alterarNome (String novoNome) {
        nome = novoNome;
    }
    Produtos (String nome, double valor, int quantidadeEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    }


