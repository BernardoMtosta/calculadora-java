import java.util.Scanner;
public class Main {
    public static void main(String args[]) {

        Calculadora calc = new Calculadora();

        Scanner entrada = new Scanner(System.in);
        int escolha = 0;
        while (escolha != 6) {
            System.out.println("Bem vindo a calculadora, informe a opção que deseja");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("5 - histórico");
            System.out.println("6 - sair");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Informe o primeiro número:");
                    double soma1 = entrada.nextDouble();
                    System.out.println("Informe o segundo número:");
                    double soma2 = entrada.nextDouble();
                    double resultado = calc.somar(soma1, soma2);
                    System.out.println("Resultado: " + resultado);
                    String operacao = soma1 + " + " + soma2 + " = " + resultado;
                    calc.historico.add(operacao);
                    break;

                case 2:
                    System.out.println("Informe o primeiro número");
                    double sub1 = entrada.nextDouble();
                    System.out.println("Informe o segundo número");
                    double sub2 = entrada.nextDouble();
                    resultado = calc.subtrair(sub1, sub2);
                    System.out.println("Resultado: " + resultado);
                    operacao = sub1 + " - " + sub2 + " = " + resultado;
                    calc.historico.add(operacao);
                    break;

                case 3:
                    System.out.println("Informe o primeiro número");
                    double mult1 = entrada.nextDouble();
                    System.out.println("Informe o segundo número");
                    double mult2 = entrada.nextDouble();
                    System.out.println("Resultado: " + calc.multiplicar(mult1, mult2));
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
                    System.out.println("Resultado: " + calc.dividir(div1, div2));
                    break;

                case 5:
                    System.out.println(calc.historico);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    escolha = 6;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    escolha = 0;
            }

        }
        entrada.close();
    }
}
