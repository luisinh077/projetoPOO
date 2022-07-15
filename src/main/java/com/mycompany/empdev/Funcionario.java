//Nome: Luís Henrique de Jesus Lima - RA: 2313642
package com.mycompany.empdev;

public class Funcionario extends Pessoa implements Calculos{

  /* Atributos da Classe Pessoa */
  private String funcao;
  private float salario;
  // private int identificador;

  /* Método Construtor */
  public Funcionario(){
    funcao = "";
    salario = 0;
    // identificador = 0;
  }

  /* Métodos Getters da Classe Pessoa */
  public String getFuncao(){
    return funcao;
  }
  public float getSalario(){
    return salario;
  }

  /* Métodos Setters da Classe Pessoa */
  public void setFuncao(String funcao){
    this.funcao = funcao;
  }
  public void setSalario(float salario){
    this.salario = salario;    
  }

  public float CalcInss(float salario){
    float result = 0, imposto = 0;

    if(salario <= 1212){
      imposto = 0.075f;
      result = salario*imposto;
      
      return result;
    } else if(salario > 1212 && salario 
    <= 2427.35){
      imposto = 0.09f;
      result = salario*imposto;
      
      return result;
    } else {
      imposto = 0.12f;
      result = salario*imposto;
      
      return result;
    }
  }
}