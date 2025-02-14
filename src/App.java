public class App {
    public static void main(String[] args) throws Exception {
        double n1 = 9;
        double n2 = 3;

        Calculadora calculadora = new Calculadora();

        try {
            double resultado = calculadora.dividir(n1, n2);
            System.out.println("El resultado de la division es: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("Operacion finalizada con operacion exitosa o no exitosa");
        }
    }
}
