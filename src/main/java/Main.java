import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Informe o valor do seu número inteiro");
        numero = entrada.nextInt();
    if(numero % 2 == 0){
        System.out.println("par");
    }else{System.out.println("impar");}
    }
}
