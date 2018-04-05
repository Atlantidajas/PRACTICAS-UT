public class Factura {
	
	double precio;
	double porcentajeDescuento;
	double descuento;
	double precioFinal;
	
	public Factura(double precio, double porcentajeDescuento) {
		this.precio = precio;
		this.porcentajeDescuento = porcentajeDescuento;

	}

	public double getPrecioFinal() {
		this.descuento = ((this.precio * this.porcentajeDescuento) /100);
		this.precioFinal = (this.precio - this.descuento);
		return( this.precioFinal );
		
	}
}