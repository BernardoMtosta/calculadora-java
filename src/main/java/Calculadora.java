import java.util.ArrayList;
public class Calculadora {

    private ArrayList<String> historico = new ArrayList<String>();

    public  void adicionarHistorico(String add){
        historico.add(add);
    }

    public String consultarHistorico(Integer get){
        return historico.get(get);
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;



    }
}
