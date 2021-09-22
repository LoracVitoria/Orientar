public class Voo {

    private String destino;
    private String saida;
    private Integer numVoo;
    private Passageiro[] vetPassageiro;



    public Voo() {
        this.vetPassageiro = new Passageiro[25];
    }

    public Passageiro[] getVetPassageiro(int acentoPas) {
        return vetPassageiro;
    }

    public void setVetPassageiro(int acentoPas ,Passageiro[] vetPassageiro) {
        this.vetPassageiro = vetPassageiro;
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

}
