//Nome: Lais Aparecida Borges - RA: 2453525

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Terceirizado extends Funcionario implements Validar{
    private String nomeEmp;
    private String tipoServPrest;
    private String dataIniContrato;
    private String dataTermContrato;
    
    public Terceirizado(){
        nomeEmp = "";
        tipoServPrest = "";
        dataIniContrato = "";
        dataTermContrato = "";
    }
    
    //Sobrecarga
    public Terceirizado(Terceirizado t){
        nomeEmp = t.getNomeEmp();
        tipoServPrest = t.getTipoServPrest();
        dataIniContrato = t.getDataIniContrato();
        dataTermContrato = t.getDataTermContrato();
    }
    
    //Sobrescrita
    public void mostraDados(){
        JOptionPane.showMessageDialog(null, "Nome da empresa: " + nomeEmp + "\nServiço prestado: " + tipoServPrest + "\nData inicial do contrato: " + dataIniContrato + "\nData final do contrato: " + dataTermContrato, "NOVOS DADOS", 1);
    }
    
    public void mostraDadosMae(){
        super.mostraDados();
    }

    public String getNomeEmp() {
        return nomeEmp;
    }

    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public String getTipoServPrest() {
        return tipoServPrest;
    }

    public void setTipoServPrest(String tipoServPrest) {
        this.tipoServPrest = tipoServPrest;
    }

    public String getDataIniContrato() {
        return dataIniContrato;
    }

    public void setDataIniContrato(String dataIniContrato) {
        this.dataIniContrato = dataIniContrato;
    }

    public String getDataTermContrato() {
        return dataTermContrato;
    }

    public void setDataTermContrato(String dataTermContrato) {
        this.dataTermContrato = dataTermContrato;
    }
    
    public String validaData(){
        String data1 = "";
        SimpleDateFormat dataFormato1 = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            dataFormato1.setLenient(false);
            dataFormato1.parse(getDataIniContrato());
            data1 = getDataIniContrato();
        }catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Data inválida!", "ATENÇÃO", 2);
        }
        
        try{
            dataFormato1.setLenient(false);
            dataFormato1.parse(getDataIniContrato());
            data1 = getDataTermContrato();
        }catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Data inválida!", "ATENÇÃO", 2);
        }
        
        return data1;
    }
}