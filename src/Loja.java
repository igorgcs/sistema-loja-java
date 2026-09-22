import java.util.Scanner;

public class Loja {

    static void main() {

    System.out.println("Digite seu nome:");
    Scanner leitor = new Scanner(System.in);
    String nome = leitor.nextLine();
    System.out.println("\n=====Bem vindo, " + nome +"!=====\n");
    System.out.println("Abaixo estão os itens em estoque:\n");


    Produto celular = new Produto("Iphone 17", 9000.00, 5);

        celular.alterarNome("Iphone 18");
        celular.exibirInformacoes();

    Produto notebook = new Produto("Notebook Samsung I5 8GB Ram", 3500.00, 10);

        notebook.exibirInformacoes();

    Produto videogame = new Produto("Playstation 4", 2000.00, 6);

        videogame.exibirInformacoes();

}
}
