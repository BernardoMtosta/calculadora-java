import java.util.ArrayList;

public class Historico {

    private ArrayList<String> historico = new ArrayList<String>();

    public  void adicionarHistorico(String add){
        historico.add(add);
    }

    public void  exibirHistorico(){
        if(historico.isEmpty()){
            System.out.println("Histórico vazio!");
        }else{
            System.out.println("===== HISTÓRICO =====\n");
            System.out.println("Total: " + historico.size() +" operações\n" );
            for (String item : historico){
                System.out.println(item);
            }
            System.out.println("\n");
            System.out.println("===============");
        }
    }
}
