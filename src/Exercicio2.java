import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não
a sequência.
IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no
código;*/

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> fibonacci = new ArrayList<>();
        int numero;
        int num1 = 0;
        int num2 = 1;
        int num3 = num1 + num2;
        int flag = 0;
        fibonacci.add(num1);
        fibonacci.add(num2);

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while(num3<=numero)
        {
            fibonacci.add(num3);
            if(num3 == numero){
                flag = 1;
                break;
            }
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }

        System.out.println("Sequência Fibonacci até o número informado: ");
        System.out.print(fibonacci);

        if(flag == 1 || numero == 0) {
            System.out.println("\nO número informado pertence à sequência Fibonacci.");
        }else{
            System.out.println("\nO número informado NÃO pertence à sequência Fibonacci.");
        }
    }
}
