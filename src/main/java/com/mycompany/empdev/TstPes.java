/*Nome: Luís Henrique de Jesus Lima - RA: 2313642*/
package com.mycompany.empdev;

import java.util.List;
import java.util.ArrayList;

public class TstPes {

    private static Leitura leitor = new Leitura();
    private static Cliente cliente;
    private static Funcionario funcionario;
    private static List<Cliente> bdClie = new ArrayList<Cliente>();
    private static List<Funcionario> bdFunc = new ArrayList<Funcionario>();

    public static void main(String arg[]) throws NumNegatCpf {

        /*
         * Funcionario funcionario = new Funcionario();
         * Cliente cliente = new Cliente();
         * Leitura leitor = new Leitura();
         */
        boolean ctrlGeral = false;
        boolean ctrlType = false;

        String escolha = "";

        while (ctrlGeral == false) {
            escolha = escolhaUser();

            switch (escolha) {
                case "1":
                    funcionario = new Funcionario();

                    System.out.println("\n\t//====== Cadastro Funcionario! ======\\");
                    funcionario.setName(leitor.entDados("NOME..: "));
                    while (ctrlType == false) {
                        try {
                            funcionario.setAge(Integer.parseInt(leitor.entDados("IDADE..:")));
                            ctrlType = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("\nO valor deve ser um número inteiro");
                            ctrlType = false;
                        }

                    } // fim do while
                    ctrlType = false;

                    while (ctrlType == false) {
                        try {
                            funcionario.setCpf(Integer.parseInt(leitor.entDados("CPF..: ")));
                            ctrlType = true;
                        } catch (NumNegatCpf nnc) {
                            nnc.impCpfNeg();
                            ctrlType = false;
                        } catch (NumberFormatException nfe) {
                            System.out.println("\nO valor deve ser um inteiro");
                            ctrlType = false;
                        }

                    } // fim do while
                    ctrlType = false;

                    funcionario.getAddress().getReg().setEstado(leitor.entDados("ESTADO..: "));
                    funcionario.getAddress().getReg().setCidade(leitor.entDados("CIDADE..: "));
                    funcionario.getAddress().setStreet(leitor.entDados("RUA..: "));
                    while (ctrlType == false) {
                        try {
                            funcionario.getAddress().setNumber(Integer.parseInt(leitor.entDados("NUMERO..: ")));
                            ctrlType = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("\nO valor deve ser um número inteiro");
                            ctrlType = false;
                        }

                    } // fim do while
                    ctrlType = false;

                    while (ctrlType == false) {
                        try {
                            funcionario.setSalario(Float.parseFloat(leitor.entDados("SALARIO..: ")));
                            ctrlType = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("\nO valor deve ser um número");
                            ctrlType = false;
                        }

                    } // fim do while
                    ctrlType = false;

                    funcionario.setFuncao(leitor.entDados("FUNCAO..: "));

                    bdFunc.add(funcionario);

                    System.out.println("Funcionário Cadastrado Com Sucesso!");
                    break;
                case "2":
                    Cliente cliente = new Cliente();

                    System.out.println("\n\t//====== Cadastro Cliente! ======\\");
                    cliente.setName(leitor.entDados("NOME..: "));
                    while (ctrlType == false) {
                        try {
                            cliente.setAge(Integer.parseInt(leitor.entDados("IDADE..:")));
                            ctrlType = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("\nO valor deve ser um número inteiro");
                            ctrlType = false;
                        }

                    } // fim do while
                    ctrlType = false;

                    while (ctrlType == false) {
                        try {
                            cliente.setCpf(Integer.parseInt(leitor.entDados("CPF..: ")));
                            ctrlType = true;
                        } catch (NumNegatCpf nnc) {
                            nnc.impCpfNeg();
                            ctrlType = false;
                        } catch (NumberFormatException nfe) {
                            System.out.println("\nO valor deve ser um inteiro");
                            ctrlType = false;
                        }

                    } // fim do while
                    ctrlType = false;

                    cliente.getAddress().getReg().setEstado(leitor.entDados("ESTADO..: "));
                    cliente.getAddress().getReg().setCidade(leitor.entDados("CIDADE..: "));
                    cliente.getAddress().setStreet(leitor.entDados("RUA..: "));
                    while (ctrlType == false) {
                        try {
                            cliente.getAddress().setNumber(Integer.parseInt(leitor.entDados("NUMERO..: ")));
                            ctrlType = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("\nO valor deve ser um número");
                            ctrlType = false;
                        }

                    } // fim do while
                    ctrlType = false;

                    cliente.setDataUltimaCompra(leitor.entDados("DATA ULTIMA COMPRA..: "));
                    cliente.setServico(leitor.entDados("SERVICO ADQUIRIDO..: "));

                    bdClie.add(cliente);
                    break;

                case "3":
                    System.out.println("Montar ainda");
                    ;
                    break;
                case "4":
                    ctrlGeral = true;
                    break;
            }

        }

        // ==========================================================================
        // System.out.println("\n\t//====== Seja Bem Vindo a Funcionario! ======\\");
        // System.out.println("\n\t Olá " + funcionario.getName() + ", tudo bem? logo abaixo informaremos seus dados");
        // System.out.println("\n\n\tIDADE: " + funcionario.getAge());
        // System.out.println("\tCPF: " + funcionario.getCpf());
        // System.out.println("\tESTADO: " + funcionario.getAddress().getReg().getEstado());
        // System.out.println("\tCIDADE: " + funcionario.getAddress().getReg().getCidade());
        // System.out.println("\tRUA: " + funcionario.getAddress().getStreet());
        // System.out.println("\tNUMERO: " + funcionario.getAddress().getNumber());
        // System.out.println("\tSALARIO: " + funcionario.getSalario());
        // System.out.println("\tFUNCAO: " + funcionario.getFuncao());

        // System.out.println("\n\t//====== Seja Bem Vindo Cliente! ======\\");
        // System.out.println("\n\t Olá " + cliente.getName() + ", tudo bem? logo abaixo informaremos seus dados");
        // System.out.println("\n\n\tIDADE: " + cliente.getAge());
        // System.out.println("\tCPF: " + cliente.getCpf());
        // System.out.println("\tESTADO: " + cliente.getAddress().getReg().getEstado());
        // System.out.println("\tCIDADE: " + cliente.getAddress().getReg().getCidade());
        // System.out.println("\tRUA: " + cliente.getAddress().getStreet());
        // System.out.println("\tNUMERO: " + cliente.getAddress().getNumber());
        // System.out.println("\tDATA ULTIMA COMPRA: " + cliente.getDataUltimaCompra());
        // System.out.println("\tSERVICO ADQUIRIDO: " + cliente.getServico());
    }

    public static String escolhaUser() {
        String escolha = "";

        System.out.println("\n\t//====== SELECIONE O TIPO QUE DESEJA CADASTRAR ======\\");
        System.out.println("\n\t//====== 1 - FUNCIONARIO");
        System.out.println("\n\t//====== 2 - CLIENTE");
        System.out.println("\n\t//====== 3 - FORNECEDOR");
        System.out.println("\n\t//====== 4 - SAIR");
        escolha = leitor.entDados(escolha);

        return escolha;
    }
}
