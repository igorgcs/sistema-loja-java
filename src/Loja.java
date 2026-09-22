import java.util.Scanner;

public class Loja {

    static void main() {


    Produtos celular = new Produtos();
        celular.nome = "Iphone 17";
        celular.valor = 9800.00;
        celular.quantidadeEstoque = 9;

        celular.alterarNome("Iphone 18");
        celular.exibirInformacoes();

    Produtos notebook = new Produtos();
        notebook.nome = "Notebook Samsung I5 8Gb Ram";
        notebook.valor = 3500.00;
        notebook.quantidadeEstoque = 5;

        notebook.exibirInformacoes();

    Produtos videogame = new Produtos();
        videogame.nome = "Playstation 4";
        videogame.valor = 2000.00;
        videogame.quantidadeEstoque = 3;

        videogame.exibirInformacoes();

}
}
