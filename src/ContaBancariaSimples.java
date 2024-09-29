import java.util.Scanner;

public class ContaBancariaSimples {
    public static void main(String[] args) {

        String nome = "Abinadabe Oliveira";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        int opcao = 0;

        System.out.println("**************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n*************************");

        String menu = """
                ** Digite a sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Você tem R$" + saldo + ". Digite quanto quer transferir?");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("Você não tem saldo suficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor à receber: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
