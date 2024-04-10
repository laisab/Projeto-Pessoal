//Nome: Lais Aparecida Borges - RA: 2453525

public class Escola {
    private String nome;
    private String rua;
    private int num;
    private String bairro;
    private String cidade;
    private String cep;
    
    public Escola(){
        nome = "";
        rua = "";
        num = 0;
        bairro = "";
        cidade = "";
        cep = "";
    }
    
    //Sobrecarga
    public Escola(Escola e){
        nome = e.getNome();
        rua = e.getRua();
        num = e.getNum();
        bairro = e.getBairro();
        cidade = e.getCidade();
        cep = e.getCep();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) throws ValorNegativoException{
        if(num > 0){
            this.num = num;
        }else{
            throw new ValorNegativoException();
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}