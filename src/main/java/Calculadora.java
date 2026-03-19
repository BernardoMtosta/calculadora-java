import java.util.ArrayList;
public class Calculadora {

    private ArrayList<String> historico = new ArrayList<String>();

    public  void adicionarHistorico(String add){
        historico.add(add);
    }

    public void  exibirHistorico(){
            if(historico.isEmpty()){
                System.out.println("Histórico vazio!");
            }else{
                System.out.println("===== HISTÓRICO =====\n");
                System.out.println("Total: " + historico.size() + " operações\n" );
                for (String item : historico){
                    System.out.println(item);
                }
                System.out.println("\n");
                System.out.println("===============");
        }
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
