//Nome: Luís Henrique de Jesus Lima - RA: 2313642
package com.mycompany.empdev;

public abstract class Pessoa {

  /* Atributos da Classe Pessoa */
  private String name;
  private int age;
  private int cpf;
  private Endereco address;

  /* Método Construtor */

  public Pessoa(){
    name = "Digite Sua Idade...";
    age = 0;
    cpf = 0;
    address = new Endereco();
  }

  //Aplicando poliformismo por sobrecarga
  public Pessoa(String name){
    this.name = name;
    age = 0;
    cpf = 0;
    address = new Endereco();
  }

  /* Métodos Getters da Classe Pessoa */
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public int getCpf(){
   return cpf;
  }
  public Endereco getAddress(){
    return address;
  }

  /* Métodos Setters da Classe Pessoa */
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;    
  }
  public void setCpf(int cpf) throws NumNegatCpf{
    if(cpf > 0){
      this.cpf = cpf;
    } else {
      throw new NumNegatCpf();
    }
  }
  public void setAddress(Endereco address){
    this.address = address;
  }
}