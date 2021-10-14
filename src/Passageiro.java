public class Passageiro {

    private String nome;
    private String cpf;
    private Integer fone;

    private Integer voo;


    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String n){
        this.cpf = n;

    }
    public Integer getFone(){
        return this.fone;
    }

    public void setFone(Integer n){
        this.fone = n;
    }



    public Integer getVoo() {
        return voo;
    }

    public void setVoo(Integer voo) {
        this.voo = voo;
    }

    public Passageiro() {

    }


}

