import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaBancario cliente = new SistemaBancario();

        int escolha;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo atual: R$ " + cliente.getSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    cliente.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    cliente.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Digite o valor a ser transferido: ");
                    double valorTransferencia = scanner.nextDouble();
                    SistemaBancario destinatario = new SistemaBancario();
                    cliente.transferir(valorTransferencia, destinatario);
                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
        scanner.close();
    }
}