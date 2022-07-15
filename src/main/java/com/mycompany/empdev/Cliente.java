//Nome: Luís Henrique de Jesus Lima - RA: 2313642
package com.mycompany.empdev;

public class Cliente extends Pessoa{

  /* Atributos da Classe Pessoa */
  private String dataUltimaCompra;
  private String servico;

  /* Método Construtor */
  public Cliente(){
    dataUltimaCompra = "00/00/0000";
    servico = "";
  }

  /* Métodos Getters da Classe Pessoa */
  public String getDataUltimaCompra(){
    return dataUltimaCompra;
  }
  public String getServico(){
    return servico;
  }

  /* Métodos Setters da Classe Pessoa */
  public void setDataUltimaCompra(String dataUltimaCompra){
    this.dataUltimaCompra = dataUltimaCompra;
  }
  public void setServico(String servico){
    this.servico = servico;    
  }
}