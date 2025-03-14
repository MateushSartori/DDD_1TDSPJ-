import java.sql.SQLOutput;

public class TesteReceita {
    public static void main(String[] args) {
        //Instanciar um objeto = Criar o objeto
        Receita boloFuba = new Receita();
        boloFuba.nomeReceita = "Bolo de Fuba";
        boloFuba.dificuldade = "Fácil";
        boloFuba.porcoes = 8;
        boloFuba.tempo = 35;
        boloFuba.autorReceita = "Ana Maria";
        boloFuba.descricao = "bla bla bla";
        boloFuba.modoPreparo = "bla bla bla";
        boloFuba.ingredientes = "bla bla bla";
        boloFuba.exibirReceita();
        System.out.println(boloFuba.exibirReceita2());

        System.out.println(boloFuba + " endereço ");

        }
}