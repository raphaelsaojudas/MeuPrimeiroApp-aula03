package br.usjt.ads.desmob.clienteads18.model;

public class ClienteDAO {

    private static Cliente[] clientes;

    private ClienteDAO(){}

    public static Cliente[] getClientes(){

        if(clientes == null){

            clientes = new Cliente[1];

            clientes[0] = new Cliente(1,"Os Incríveis 2","11 999999999","ht@usjt.br","Brad Bird","28/06/2018");
        }
        return clientes;
    }
}