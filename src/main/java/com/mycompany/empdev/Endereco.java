//Nome: Luís Henrique de Jesus Lima - RA: 2313642
package com.mycompany.empdev;

public class Endereco {
  /* Atributos da Classe Endereco */
  private String street;
  private int number;
  private Regiao reg;

  /* Método Construtor */

  public Endereco(){
    street = "Digite Seu Endereco...";
    number = 0;
    reg = new Regiao();
  }

  /* Métodos Getters da Classe Endereco */
  public String getStreet(){
    return street;
  }
  public int getNumber(){
    return number;
  }
  public Regiao getReg(){
    return reg;
  }

  /* Métodos Setters da Classe Endereco */
  public void setStreet(String street){
    this.street = street;
  }
  public void setNumber(int number){
    this.number = number;
  }
  public void setReg(Regiao reg){
    this.reg = reg;
  }
}