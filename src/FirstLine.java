import java.util.Scanner;

public class FirstLine{
    public static void main(String[] args) {

        int idade;
        double altura;
        String nome;
        String cargo;
        String horario;
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo! Este é um formulário importante para sua validação no Senai!!!\n");

        System.out.println("Digite seu nome");
        nome = leia.nextLine();
        System.out.println("Digite sua idade");
        idade = leia.nextInt();
        System.out.println("Digite Sua altura");
        altura = leia.nextDouble();
        System.out.println("Digite seu cargo");
        cargo = leia.nextLine();
        System.out.println("Digite o horário que estuda, ex: Matutino, verspertino, noturno");
        horario = leia.nextLine();

        System.out.println("Bem-vindo " + nome + "Você tem " + idade + "  anos, sua altura é " + altura + ", você trabalha como "+ cargo + ", e você estuda no periodo da " + horario);



    }
}