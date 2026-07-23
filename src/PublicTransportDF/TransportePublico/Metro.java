package PublicTransportDF.TransportePublico;

public class Metro extends Transporte {

    private int numeroVagoes;

    public Metro() {
        super("Linha Verde", 1000, 5.50);
        this.numeroVagoes = 6;
    }

    @Override
    public void iniciarViagem() {
        System.out.println("\n===== METRÔ =====");
        System.out.println("Linha: " + getNumeroDaLinha());
        System.out.println("Número de vagões: " + numeroVagoes);
        System.out.println("Tarifa: R$ " + getTarifa());
        System.out.println("Viagem iniciada!");
    }

    public void fecharPortasAutomaticamente() {
        System.out.println("Portas fechadas automaticamente.");
    }

    public int getNumeroVagoes() {
        return numeroVagoes;
    }

    public void setNumeroVagoes(int numeroVagoes) {
        this.numeroVagoes = numeroVagoes;
    }
}