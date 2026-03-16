import java.util.Scanner;
public class Main {
    public static void main(String args[]) {

        Calculadora calc = new Calculadora();

        Scanner entrada = new Scanner(System.in);
        int escolha = 0;
        while (escolha != 5) {
            System.out.println("Bem vindo a calculadora, informe a opção que deseja");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("5 - sair");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Informe o primeiro número:");
                    double soma1 = entrada.nextDouble();
                    System.out.println("Informe o segundo número:");
                    double soma2 = entrada.nextDouble();
                    System.out.println(calc.somar(soma1, soma2));
                    break;

                case 2:
                    System.out.println("Informe o primeiro número");
                    double sub1 = entrada.nextDouble();
                    System.out.println("Informe o segundo número");
                    double sub2 = entrada.nextDouble();
                    System.out.println(calc.subtrair(sub1, sub2));
                    break;

                case 3:
                    System.out.println("Informe o primeiro número");
                    double mult1 = entrada.nextDouble();
                    System.out.println("Informe o segundo número");
                    double mult2 = entrada.nextDouble();
                    System.out.println(calc.multiplicar(mult1, mult2));
                    break;

                case 4:
                    System.out.println("Informe o primeiro número");
                    double div1 = entrada.nextDouble();
                    System.out.println("Informe o segundo número");
                    double div2 = entrada.nextDouble();
                    if (div2 == 0) {
                        System.out.println("erro!");
                        break;
                    }
                    System.out.println(calc.dividir(div1, div2));
                    break;

                case 5:
                    System.out.println("Saindo...");
                    escolha = 5;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    escolha = 0;
            }

        }
        entrada.close();
    }
}
