//Nome: Luís Henrique de Jesus Lima - RA: 2313642
package com.mycompany.empdev;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncGer{

	private Funcionario funcionario;
	private List<Funcionario> bdFunc = new ArrayList<Funcionario>();

        public List<Funcionario> getBdFunc(){
            return bdFunc;
        }
        
	public Funcionario cadFunc(Funcionario funcionario){

		if(consFuncCod(funcionario)== null){
			bdFunc.add(funcionario);
			return funcionario;
		}
		else{
			return null;
		}

	}//fim cadPes

	public Funcionario consFuncCod(Funcionario funcionario){
		for(int i = 0; i < bdFunc.size(); i++){
			if(funcionario.getCpf() == bdFunc.get(i).getCpf()){
				return bdFunc.get(i);
			}
		}
		return null;
	}//fim consFuncCod

	public Funcionario removeFuncCod(Funcionario funcionario){
                funcionario = consFuncCod(funcionario);
            	if(funcionario != null){
                    bdFunc.remove(funcionario);
                    return null;
		}
		else{
                    return funcionario;
		}
		
	}//fim removePesCod

	public Funcionario atualizaFuncCod(Funcionario funcionario){
		for(int i = 0; i < bdFunc.size(); i++){
			if(funcionario.getCpf() == bdFunc.get(i).getCpf()){
                                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                funcionario.setName(nome);
				bdFunc.set(i, funcionario);  
                                return bdFunc.get(i);
			}
		}
                return null;
	}//fim atualizaPesCod

}//fim da classe