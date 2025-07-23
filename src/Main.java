import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        String nome = "Natalie Rushman";
        String tipoConta = "Corrente";
        double saldo = 1600;

        System.out.println("*".repeat(40));
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("*".repeat(40));

        String menu = """
                1- Consultar Saldo
                2- Transferir Valor
                3- Receber Valor
                4- Sair
                
                Digite sua opção:\s""";

        while (opcao != 4) {
            System.out.print(menu);
            opcao = leitura.nextInt();
        }

    }
}
