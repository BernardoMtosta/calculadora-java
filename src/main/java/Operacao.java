public class Operacao {

    double numero1;
    double numero2;
    String operador;
    double resultado;

    public Operacao(double numero1, String operador, double numero2, double resultado){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
        this.resultado = resultado;

    }

    public String toString(){

        return  numero1 + " " + operador + " " + numero2 + " = " + resultado;

    }
}



