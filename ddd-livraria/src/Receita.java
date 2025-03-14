public class Receita {
    //Atributo tipo nomeAtributo;
    String nomeReceita;
    int tempo;
    String dificuldade;
    String descricao;
    String ingredientes;
    String modoPreparo;
    int porcoes;
    String autorReceita;

    //Metodo da classe sem retorno
    public void exibirReceita(){ //void é um metodo sem retorno
        System.out.println("Receita de " + nomeReceita);
        System.out.println("==============================");
        System.out.println("Publicado por: " + autorReceita);
        System.out.println(dificuldade + "\t" + tempo +"\t" + porcoes);
        System.out.println(descricao);
        System.out.println("Ingredientes\n" + ingredientes);
        System.out.println("Modo de preparo\n" + modoPreparo);
    }
    //Metodo de casse com retorno
    public String exibirReceita2(){
        String mensagem = "Receita de " + nomeReceita +
                "\n==============================" +
                "\nPublicado por: " + autorReceita +
                "\ndificuldade + tempo + porcoes";
        return mensagem;
    }
}
