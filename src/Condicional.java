public class Condicional {
    public static void main(String[] args) {
        int anoFilme = 2025;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.2;
        String tipoPlano = "plus";


        if (anoFilme >= 2024) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme Antigo que vale a pena assistir");
        }

        if (incluidoNoPlano && tipoPlano.equals("Plus")) {
            System.out.println("Incluido no plano, está Liberado");
        } else {
            System.out.println("Deve assinar o Plano");
        }


    }
}
