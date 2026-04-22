public class Calculadora {

    public double somar(double a, double b) {return a + b;}

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {return a / b;}

    public Operacao somarOperacao(double a,  double b){
        double resultado = somar(a,b);
        Operacao op = new Operacao(a , "+" , b , resultado);
        return op;
    }

}
