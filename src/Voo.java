public class Voo {

    private String destino;
    private String saida;
    private Integer numVoo;
    private Integer acento;
    private Passageiro[] vetPassageiro;


    public Voo() {
        this.vetPassageiro = new Passageiro[2];

    }

    public Passageiro getVetPassageiro(int acentoPas) {
        return this.vetPassageiro[acentoPas];
    }

    public void setVetPassageiro(int acentoPas , Passageiro passageiro) {
        this.vetPassageiro[acentoPas] = passageiro;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String n) {
        this.destino = n;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public Integer getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(Integer numVoo) {
        this.numVoo = numVoo;
    }

    public Integer getAcento() {
        return acento;
    }

    public void setAcento(Integer acento) {
        this.acento = acento;
    }
}
