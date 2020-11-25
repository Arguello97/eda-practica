package ar.edu.unlam.pbii.grupo01;

public class ClienteTri extends Cliente{

	
	private String codigoDeArea;
	private String telefono;
	private String codigoDecodificador;
	private String eMail;

	public ClienteTri(Integer idCliente, String nombre, String codigoDeArea, String telefono, String codigoDecodificador, String eMail) {
		
		super(idCliente, nombre);
		this.codigoDeArea=codigoDeArea;
		this.telefono=telefono;
		this.codigoDecodificador=codigoDecodificador;
		this.eMail=eMail;
	}


	public String getCodigoDeArea() {
		return codigoDeArea;
	}

	public void setCodigoDeArea(String codigoDeArea) {
		this.codigoDeArea = codigoDeArea;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public void setCodigoDecodificador(String codigoDecodificador) {
		this.codigoDecodificador = codigoDecodificador;
	}

	public String getEMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
