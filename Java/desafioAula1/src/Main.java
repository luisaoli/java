import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Thomas Shelby";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int operacaoEscolhida = 0;
        Scanner leitor = new Scanner(System.in);

        String boasVindas = """
                *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                
                *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*
                """.formatted(nome, tipoConta, saldo);

        System.out.println(boasVindas);

        String operacoes = """
                
                Operações:
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a operação desejada:                
                """;

        while (operacaoEscolhida != 4) {
            System.out.println(operacoes);
            operacaoEscolhida = leitor.nextInt();

            switch (operacaoEscolhida) {
                case 1:
                    System.out.println("O seu saldo é de R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorRebecer = leitor.nextDouble();
                    saldo += valorRebecer;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    double valorTransferir = leitor.nextDouble();
                    if (valorTransferir > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transação.");
                        break;
                    } else {
                        saldo -= valorTransferir;
                        System.out.println("Saldo atualizado R$ " + saldo);
                        break;
                    }

                case 4:
                    System.out.println("Consulta finalizada.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}