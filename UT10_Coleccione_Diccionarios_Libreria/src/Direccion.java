
public class Direccion {
	protected String calle;
	protected int codigoPostal;
	protected String provincia;
	
	public Direccion(String calle, int codigoPostal, String provincia) {
		this.calle = calle;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
	}

	protected void setCalle(String calle) {
		this.calle = calle;
	}

	protected void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	protected void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	protected String getCalle() {
		return calle;
	}
	
	protected int getCodigoPostal() {
		return codigoPostal;
	}

	protected String getProvincia() {
		return provincia;
	}


		
}