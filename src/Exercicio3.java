
/*3) Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2,10, 12, 16, 17, 18, 19, ____
* */

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("A) 1, 3, 5, 7, ___");
        System.out.println("Próximo elemento = " + 9);
        System.out.println("Lógica: soma-se 2 ao último elemento");
        System.out.println("-----------");

        System.out.println("B) 2, 4, 8, 16, 32, 64, ____");
        System.out.println("Próximo elemento = " + 128);
        System.out.println("Lógica: multiplica-se o último elemento por 2");
        System.out.println("-----------");

        System.out.println("C) 0, 1, 4, 9, 16, 25, 36, ____");
        System.out.println("Próximo elemento = " + 49);
        System.out.println("Lógica: números naturais multiplicados por eles mesmos em sequência");
        System.out.println("-----------");

        System.out.println("D) 4, 16, 36, 64, ____");
        System.out.println("Próximo elemento = " + 100);
        System.out.println("Lógica: números naturais pares multiplicados por eles mesmos em sequência");
        System.out.println("-----------");

        System.out.println("E) 1, 1, 2, 3, 5, 8, ____");
        System.out.println("Próximo elemento = " + 13);
        System.out.println("Lógica: sequência fibonacci - próximo elemento é sempre a soma dos dois anteriores");
        System.out.println("-----------");

        System.out.println("F) 2,10, 12, 16, 17, 18, 19, ____");
        System.out.println("Próximo elemento = " + 200);
        System.out.println("Lógica: todos os números iniciam-se pela letra D");
        System.out.println("-----------");
    }
}
