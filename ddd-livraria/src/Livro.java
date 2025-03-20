public class Livro {
    //Atributo tipo nomeAtributo;
    String titulo;
    String autor;
    double preco;
    Editora editora;
    int paginas;
    String resumo;
    TipoCapaEnum tipoCapa;

    //Metodo para exibir o livro
    public void  exibirlivro(){
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora.nome);
        System.out.println("Preço: " + preco);
        System.out.println("Tipo da capa: " + tipoCapa);
        System.out.println("-------------------------------------\n");
    }
    public String exibirTipoCapa(){

    }

    public void exibirLivro() {
    }
}
