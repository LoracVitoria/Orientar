public class Companhia {

    private String nome;
    private String cnpj;
    private Voo[] vetVoos;

    public Companhia(){

    }
    public Voo getVoos(Integer i) {
        return this.vetVoos[i];
    }

    public void setVoos(Voo voos,Integer i) {
        this.vetVoos[i] = voos;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
