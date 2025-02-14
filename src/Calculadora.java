import Exceptions.CalculadoraException;

public class Calculadora {
    
    public double dividir(double n1, double n2) throws CalculadoraException{
        if(n1 == 0 || n2 == 0){
            throw new CalculadoraException("No se puede dividir por cero");
        }

        return n1 / n2;
    }
}
