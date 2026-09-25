public class Eletronico extends Produto {

    private int mesesGarantia;
    private String marca;
    private String voltagem;

    @Override
    void exibirInformacoes() {

        super.exibirInformacoes();
        System.out.println("Marca: " + marca);
        System.out.println("Garantia: " + mesesGarantia);
        System.out.println("Voltagem: " + voltagem);


    }
    public Eletronico(String marca, String nome, double valor, int quantidadeEstoque, int mesesGarantia, String voltagem) {

        super(nome, valor, quantidadeEstoque);
        this.mesesGarantia = mesesGarantia;
        this.marca = marca;
        this.voltagem = voltagem;
    }
}
