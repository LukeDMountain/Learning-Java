package encapsulamento.banco.modelo;

public class BankAccount {

    private String nome;
    private int numeroConta;
    private double saldo;

    private static int proximoNumeroConta = 1000;

    public BankAccount(String nome) {
        this.nome = nome;
        this.numeroConta = proximoNumeroConta;
        proximoNumeroConta++;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}