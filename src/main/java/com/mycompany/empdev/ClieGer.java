//Nome: Luís Henrique de Jesus Lima - RA: 2313642
package com.mycompany.empdev;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClieGer{

	private Cliente cliente;
	private List<Cliente> bdClie = new ArrayList<Cliente>();

        public List<Cliente> getBdClie(){
            return bdClie;
        }
        
	public Cliente cadClie(Cliente cliente){

		if(consClieCod(cliente)== null){
			bdClie.add(cliente);
			return cliente;
		}
		else{
			return null;
		}

	}//fim cadPes

	public Cliente consClieCod(Cliente cliente){
		for(int i = 0; i < bdClie.size(); i++){
			if(cliente.getCpf() == bdClie.get(i).getCpf()){
				return bdClie.get(i);
			}
		}
		return null;
	}//fim consClieCod

	public Cliente removeClieCod(Cliente cliente){
                cliente = consClieCod(cliente);
            	if(cliente != null){
                    bdClie.remove(cliente);
                    return null;
		}
		else{
                    return cliente;
		}
		
	}//fim removePesCod

	public Cliente atualizaClieCod(Cliente cliente){
		for(int i = 0; i < bdClie.size(); i++){
			if(cliente.getCpf() == bdClie.get(i).getCpf()){
                                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Autalização", JOptionPane.QUESTION_MESSAGE);
                                cliente.setName(nome);
				bdClie.set(i, cliente);  
                                return bdClie.get(i);
			}
		}
                return null;
	}//fim atualizaPesCod

}//fim da classe