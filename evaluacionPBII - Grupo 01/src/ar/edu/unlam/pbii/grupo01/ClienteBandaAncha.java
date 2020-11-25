package ar.edu.unlam.pbii.grupo01;

public class ClienteBandaAncha extends Cliente{

	
	private String eMail;

	public ClienteBandaAncha(Integer idCliente, String nombre, String eMail) {
		super(idCliente, nombre);
		this.eMail=eMail;
	}

	

	public String getEMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	

}
