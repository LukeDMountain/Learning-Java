package encapsulamento.banco.principal;

import encapsulamento.banco.modelo.BankAccount;

public class Main {

    public static void main(String[] args) {

        BankAccount conta1 = new BankAccount("Lucas Montenegro");
        BankAccount conta2 = new BankAccount("Maria Silva");

        conta1.depositar(1000);
        conta1.sacar(250);

        System.out.println("=== Conta 1 ===");
        conta1.exibirDados();

        System.out.println();

        System.out.println("=== Conta 2 ===");
        conta2.exibirDados();
    }
}