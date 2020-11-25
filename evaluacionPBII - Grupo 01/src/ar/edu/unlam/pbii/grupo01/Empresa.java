package ar.edu.unlam.pbii.grupo01;

import java.util.HashSet;

public class Empresa {

	private String nombre;
	private HashSet<Cliente> clientes;

	public Empresa(String nombre) {
		this.nombre=nombre;
		this.clientes=new HashSet<Cliente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(HashSet<Cliente> clientes) {
		this.clientes = clientes;
	}

	

	public Object getCantidadAbonados() {
		
		return clientes.size();
	}

	public boolean habilitarPremium(Premium futbol, Cliente clienteAHabilitar) throws NoEsClienteConCableException {
		if(clienteAHabilitar instanceof ClienteCable && clientes.contains(clienteAHabilitar)) {
			
			return true;
		}
		else {
			throw new NoEsClienteConCableException();
		}
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
		
	}

	

}
