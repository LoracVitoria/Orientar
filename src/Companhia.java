public class Companhia {

    private String nome;
    private String cnpj;
    private Voo[] voos;
    private Integer qtdeVoos;


    public Voo[] getVoos(int i) {
        return this.voos[i];
    }

    public void setVoos(Voo voos) {
        this.setQtdeVoos(this.getQtdeVoos() + 1);
        int pos = this.getQtdeVoos() - 1;
        this.voos[pos] = voos;
    }

    public Integer getQtdeVoos() {
        return qtdeVoos;
    }

    public void setQtdeVoos(Integer qtdeVoos) {
        this.qtdeVoos = qtdeVoos;
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
