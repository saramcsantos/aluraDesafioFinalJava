import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        String dadosDoCliente = "Dados do cliente";
        String nomeCliente = "Sérgio Andrade Lima";
        double saldoInicialDoCliente = 2500.00;
        
        int opcao = 0;

        System.out.println(dadosDoCliente);
        String extratoCliente = """
                Nome: %s
                Saldo inicial: R$ %.2f
                """.formatted(nomeCliente, saldoInicialDoCliente);
        System.out.println(extratoCliente);

        Scanner entrarComDados = new Scanner(System.in);

        while (opcao != 4) {
            String menuDeOperacoes = """
                Operações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;
            System.out.println(menuDeOperacoes);
            opcao = entrarComDados.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(String.format("Saldo disponível: R$ %.2f", saldoInicialDoCliente));
                    break;
                case 2:
                    System.out.println("Digite o valor a ser enviado para está conta:");
                    double recebeValor = entrarComDados.nextDouble();
                    saldoInicialDoCliente += recebeValor;
                    System.out.println(String.format("Saldo disponível: R$ %.2f", saldoInicialDoCliente));
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido desta conta para outra conta:");
                    double transfereValor = entrarComDados.nextDouble();
                    if (transfereValor <= saldoInicialDoCliente){
                        saldoInicialDoCliente -= transfereValor;
                        System.out.println(String.format("Saldo disponível: R$ %.2f", saldoInicialDoCliente));
                    }else{
                        System.out.println("Saldo insuficiente para fazer a transferência");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando operações!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        entrarComDados.close();
    }
}
