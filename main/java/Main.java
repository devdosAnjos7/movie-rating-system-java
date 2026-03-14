//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
// Declaração da classe principal do programa.
// Em Java, todo programa precisa estar dentro de uma classe.
public class Main {

    // Método principal do programa.
    // É por onde a execução do Java começa quando o programa roda.
    public static void main(String[] args) {

        // Imprime uma mensagem no console (terminal).
        // System.out.println serve para mostrar texto na tela e pular uma linha depois.
        System.out.println("Bem vindo ao Screen Movie");

        // Imprime o nome do filme no console.
        System.out.println("Filme: sinners");

        // Cria uma variável do tipo inteiro (int) chamada anoFilme
        // e armazena o valor 2002 dentro dela.
        int anoFilme = 2025;

        // Mostra no console o texto + o valor da variável anoFilme.
        // O operador + concatena (junta) texto com valores.
        System.out.println("Ano do Lançamento:" + anoFilme);

        // Cria uma variável booleana (true ou false).
        // Aqui indica se o filme está incluído no plano.
        boolean incluidoNoPlano = true;

        // Cria uma variável do tipo double (número decimal)
        // para armazenar a nota do filme.
        double notaDoFilme = 9.2;
        // media calculada pelas 3 notas
        double media = (9.4 + 9.3 + 7.8)/3;
        System.out.println(media);


        String sinopse;
        sinopse = """
                Sinners acompanha dois irmãos gêmeos que voltam à cidade natal tentando recomeçar, mas acabam enfrentando forças sobrenaturais e segredos sombrios que ameaçam suas vidas e o destino da comunidade.
                """;
        System.out.println("Sinopse: " + sinopse);
        int classificacao;
        classificacao = (int) media /2;
        System.out.println(classificacao);

        


    }
}