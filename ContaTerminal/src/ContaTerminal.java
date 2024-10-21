import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        int agencia;
        String conta;
        String nomeCliente;
        Double saldo;
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Insira o número da Agência:");
            agencia = myScanner.nextInt();
            myScanner.nextLine();
            System.out.println("Insira o número da Conta:");
            conta = myScanner.nextLine();
            System.out.println("Insira o nome do Cliente:");
            nomeCliente = myScanner.nextLine();
            System.out.println("Insira o Saldo:");
            saldo = myScanner.nextDouble();
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
