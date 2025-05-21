import java.util.Scanner;

public class Calculadora{
  public static void main(String[]args){
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite o primeiro numero: ");
    int num1 = scanner.nextInt();

    System.out.println("Digite o segundo número; ");
    int num2 = scanner.nextInt();

    System.out.println("1. Soma");
    System.out.println("2. Subtração");
    System.out.println("3. Multiplicação");
    System.out.println("4. Divisão");
    System.out.println("Digite o número da operação desejada");
    int escolha = scanner.nextInt();

    switch (escolha){
      case 1: 
        int re = num1+ num2;
        System.out.println("O resultado da soma é igual a: " + re);
        break;

      case 2:
        
        int sub = num1 - num2;
        System.out.println("O resultado da subtração é igual a:  " + sub);
        break;

      case 3:
        int mu = num1 * num2;
        System.out.println("O resultado da multiplicação é igual a:  " + mu);
        break;

      case 4:
        int di = num1 - num2;
        System.out.println("O resultado da divisão é igual a:  " + di);
        break;
    }
    scanner.close();
  }

}
