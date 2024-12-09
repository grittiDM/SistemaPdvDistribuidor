package br.pdvcongelados.model.entities;

/**
 *
 * @author Murilo Gritti
 */

public class Fornecedor {
    
    private String nomeFantasia;
    private String celular;
    private String cnpj;

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
