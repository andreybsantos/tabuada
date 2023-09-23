import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, cont;

        System.out.println("digite o número da tabuada (de 1 à 10): ");
        numero = teclado.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido");
        } else {
            for (cont = 0; cont < 11; cont++) {
                System.out.println(numero + " X " + cont + " = " + (numero * cont));
            }

        }

        teclado.close();
    }
}