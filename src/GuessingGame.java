import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entradaUsuario = new Scanner(System.in);
        int numeroAleatorio = random.nextInt(100);
        int tentativas = 0;

        System.out.println("Seja bem vindo ao Guessing Games!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem 5 tentativas!");

        while (tentativas < 5) {
            System.out.println("Digite o seu palpite: ");
            int numero = entradaUsuario.nextInt();
            tentativas++;

            if (numero == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número aleatório com: " + tentativas +   " tentativas!" + " O número é: " + numeroAleatorio);
                break;
            } if (numero < numeroAleatorio) {
                System.out.println("O número digitado é menor!");
            } else {
                System.out.println("O número digitado é maior!");
            }
        }
        if (tentativas == 5) {
            System.out.println("Fim de jogo! Você atingiu o máximo de tentativas!");
            System.out.println("O número correto era: " + numeroAleatorio);
        }
        entradaUsuario.close();
    }
}