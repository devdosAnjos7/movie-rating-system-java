import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double avaliacaoMedia = 0;
        double nota = 0;
        int totalNotas = 0;
        while (nota != -1 ){
            System.out.println("Digite a avalicao para o filme:" +
                    " " +
                    "Digite -1 para sair");
            nota = leitura.nextDouble();

            if (nota !=-1){
                avaliacaoMedia += nota;
                totalNotas++;
            }

        }

        System.out.println("Media de avaliações:" + avaliacaoMedia/totalNotas);
    }
}
