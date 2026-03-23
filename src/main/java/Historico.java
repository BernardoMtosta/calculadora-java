import java.util.ArrayList;

public class Historico {

    private ArrayList<Operacao> historico = new ArrayList<Operacao>();

    public  void adicionarHistorico(Operacao operacao){
        historico.add(operacao);
    }

    public void  exibirHistorico(){
        if(historico.isEmpty()){
            System.out.println("Histórico vazio!");
        }else{
            System.out.println("===== HISTÓRICO =====\n");
            System.out.println("Total: " + historico.size() +" operações\n" );
            for (Operacao operacao: historico){
                System.out.println(operacao);
            }
            System.out.println("\n");
            System.out.println("===============");
        }
    }
}
