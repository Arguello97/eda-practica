package ar.edu.unlam.pbii.grupo01;

public class ClienteCable extends Cliente{
	
	private String codigoDecodificador;

	public ClienteCable(Integer idCliente, String nombre, String codigoDecodificador) {
		super(idCliente, nombre);
		this.codigoDecodificador=codigoDecodificador;
	}

	

	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public void setCodigoDecodificador(String codigoDecodificador) {
		this.codigoDecodificador = codigoDecodificador;
	}

	
}
