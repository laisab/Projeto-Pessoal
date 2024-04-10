//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class Professor extends Funcionario{
    private String discLeciona;
    private String titulacao;
    private int qtdeAulasSemanais;
    
    public Professor(){
        discLeciona = "";
        titulacao = "";
        qtdeAulasSemanais = 0;
    }
    
    //Sobrecarga
    public Professor(Professor p){
        discLeciona = p.getDiscLeciona();
        titulacao = p.getTitulacao();
        qtdeAulasSemanais = p.getQtdeAulasSemanais();
    }
    
    //Sobrescrita
    public void mostraDados(){
        JOptionPane.showMessageDialog(null, "Disciplina lecionada: " + discLeciona + "\nTitulação: " + titulacao + "\nQtde de aulas semanais (h): " + qtdeAulasSemanais, "NOVOS DADOS", 1);
    }
    
    public void mostraDadosMae(){
        super.mostraDados();
    }

    public String getDiscLeciona() {
        return discLeciona;
    }

    public void setDiscLeciona(String discLeciona) {
        this.discLeciona = discLeciona;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public int getQtdeAulasSemanais() {
        return qtdeAulasSemanais;
    }

    public void setQtdeAulasSemanais(int qtdeAulasSemanais) throws LimAulasSemException{
        if(qtdeAulasSemanais <= 44 && qtdeAulasSemanais  > 0){
            this.qtdeAulasSemanais = qtdeAulasSemanais;
        }else{
            throw new LimAulasSemException();
        }
    }
}