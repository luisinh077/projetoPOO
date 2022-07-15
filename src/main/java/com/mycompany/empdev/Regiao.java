//Nome: Luís Henrique de Jesus Lima - RA: 2313642
package com.mycompany.empdev;

public class Regiao {
  /* Atributos da Classe Regiao */
  private String estado = "";
  private String cidade = "";

  /* Métodos Getters da Classe Regiao */
  public String getEstado(){
    return estado;
  }
  public String getCidade(){
    return cidade;
  }

  /* Métodos Setters da Classe Regiao */
  public void setEstado(String estado){
    this.estado = estado;
  }
  public void setCidade(String cidade){
    this.cidade = cidade;
  }
}
