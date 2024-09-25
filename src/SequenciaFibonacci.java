import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        //Agora inicia os numeros da sequencia de Fibonacci.
        int a = 0, b = 1;

        //Loop para gerar os números até que exceda o valor inserido.
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        //Agora inicia uma verificação de segurança para entender se os números estão na sequência.
        if (b == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
