import java.util.Scanner;

public class Loja {

    static void main() {


    Produtos celular = new Produtos("Iphone 17", 9000.00, 5);

        celular.alterarNome("Iphone 18");
        celular.exibirInformacoes();

    Produtos notebook = new Produtos("Notebook Samsung I5 8GB Ram", 3500.00, 10);

        notebook.exibirInformacoes();

    Produtos videogame = new Produtos("Playstation 4", 2000.00, 6);

        videogame.exibirInformacoes();

}
}
