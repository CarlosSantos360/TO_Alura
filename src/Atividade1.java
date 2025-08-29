public class Atividade1 {
    public static void main(String[] args) {
        int celsius = 32;
        double conversor = (celsius * 1.8) + 32;

        String temperatura;
        temperatura = """
                A temperatura em graus Celsius é %d° 
                E quando convertida  para Fahrenheit fica %.2f° 
                """.formatted(celsius,conversor);
        System.out.println(temperatura);
    }

}
