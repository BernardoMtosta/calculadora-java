import java.util.Scanner;

public class Calculadora {

    public static int somar(int a, int b){
        return a + b;
    }

    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

       int escolha = 0;
       while(escolha != 5){
       System.out.println("Bem vindo a calculadora, informe a opção que deseja");
       System.out.println("1 - soma");
       System.out.println("2 - subtração");
       System.out.println("3 - multiplicação");
       System.out.println("4 - divisão");
       System.out.println("5 - sair");
       escolha = entrada.nextInt();

       if(escolha == 1){
           System.out.println("Informe o primeiro número:");
           int soma1 = entrada.nextInt();
           System.out.println("Informe o segundo número:");
           int soma2 = entrada.nextInt();
           System.out.println(somar(soma1, soma2));

       }
       if(escolha == 2){
           System.out.println("Informe o primeiro número");
           int sub1 = entrada.nextInt();
           System.out.println("Informe o segundo número");
           int sub2 = entrada.nextInt();
           System.out.println("Resultado = " + (sub1 - sub2));
       }
       if(escolha == 3){
           System.out.println("Informe o primeiro número");
           int mult1 = entrada.nextInt();
           System.out.println("Informe o segundo número");
           int mult2 = entrada.nextInt();
           System.out.println("Resultado = " + (mult1 * mult2));
       }
       if(escolha == 4) {
           System.out.println("Iforme o primeiro número");
           Double div1 = entrada.nextDouble();
           System.out.println("Iforme o segundo número");
           Double div2 = entrada.nextDouble();
           System.out.println("Resultado = " + (div1 / div2));
       }

       if(escolha == 5){
           System.out.println("Saindo...");
            escolha = 5;
           }

    }

    }
}
