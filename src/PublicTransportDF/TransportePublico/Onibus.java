package PublicTransportDF.TransportePublico;

public class Onibus extends Transporte {

    private String nomeViacao;

    public Onibus() {
        super("101", 50, 5.50);
        this.nomeViacao = "Pioneira";
    }

    @Override
    public void iniciarViagem() {
        System.out.println("\n===== ÔNIBUS =====");
        System.out.println("Linha: " + getNumeroDaLinha());
        System.out.println("Viação: " + nomeViacao);
        System.out.println("Tarifa: R$ " + getTarifa());
        System.out.println("Viagem iniciada!");
    }

    public void abrirPortasTraseiras() {
        System.out.println("Portas traseiras abertas.");
    }

    public String getNomeViacao() {
        return nomeViacao;
    }

    public void setNomeViacao(String nomeViacao) {
        this.nomeViacao = nomeViacao;
    }
}