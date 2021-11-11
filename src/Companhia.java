public class Companhia {

    private String nome;
    private String cnpj;
    private Voo[] vetVoos;
    private int qtdeVoos;//aqui

    public Companhia(){
        this.vetVoos = new Voo[5]; //aqui
    }

    public int getQtdeVoos(){//aqui
        return this.qtdeVoos;
    }

    public void setQtdeVoos(int qt){//aqui
        this.qtdeVoos = qt;
    }

    public Voo getVoos(Integer i) {
        return this.vetVoos[i];
    }

    public void setVoos(Voo voo) {
        this.setQtdeVoos(this.getQtdeVoos() + 1);
        int pos = this.getQtdeVoos() - 1;
        this.vetVoos[pos] = voo;
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
