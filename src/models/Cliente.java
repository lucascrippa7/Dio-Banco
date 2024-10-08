package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private static List<Cliente> listaClientes = new ArrayList<>();

    public void adicionarCliente() {
        listaClientes.add(this);  // Adiciona o cliente à lista de clientes
    }

    public String getNome() {
        return nome;
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static void setListaClientes(List<Cliente> listaClientes) {
        Cliente.listaClientes = listaClientes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  nome;
    }
}


