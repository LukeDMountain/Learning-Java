package activityFour;

public class BugOnSys {

    public static void main(String[] args) {

        int valor1 = 10;
        int contador = 5;

        exibirMensagens("Bem-vindo ao sistema", 1);

        while (contador > 0) {
            System.out.println("Iniciando em: " + contador);
            contador--;
        }

        System.out.println("Valor: " + valor1);
    }

    public static void exibirMensagens(String texto, int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(texto);
        }
    }
}