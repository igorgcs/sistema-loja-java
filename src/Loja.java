import java.util.Scanner;

public class Loja {

    static void main() {

    System.out.println("Digite seu nome:");
    Scanner leitor = new Scanner(System.in);
    String nome = leitor.nextLine();
    System.out.println("\n=====Bem vindo, " + nome +"!=====\n");
    System.out.println("Abaixo estão os itens em estoque:\n");


    Produto celular = new Eletronico("Apple","Iphone 17", 9000.00, 5, 12, "Bivolt"); //Criando um produto

        celular.alterarNome("Iphone 18"); //Chamando metodo com parametros
        celular.exibirInformacoes(); //Chamando o metodo

    Produto notebook = new Eletronico("Samung", "Notebook", 3500.00, 10, 12, "Bivolt"); //Criando um produto

        notebook.exibirInformacoes(); //Chamando o metodo

    Produto videogame = new Eletronico("Sony", "Playstation 4", 2000.00, 6, 24, "Bivolt"); //Criando um produto

        videogame.exibirInformacoes(); //Chamando o metodo

}
}
