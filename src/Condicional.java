public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano  = false;
        double notaDoFilme = 8.1;
        String tipoDoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme Retrô que vale a pena assistir!");
        }
        if (incluidoNoPlano == true && tipoDoPlano .equals("plus")) {
            System.out.println("Filme Liberado");   ;
        }else {
            System.out.println("Filme precisa ser alugado");
        }
    }
}
 