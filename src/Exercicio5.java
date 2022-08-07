/*5) Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no
código;
b) Evite usar funções prontas, como, por exemplo, reverse;*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        string = scanner.next();

        System.out.print("String invertida: ");
        for(int i = string.length()-1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }
    }
}
