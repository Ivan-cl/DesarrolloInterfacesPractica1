package unidad1.practica1.facturacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Factura {

	private int numero;
	private List<Producto> productos;
	private Calendar fecha;

	public Factura(int numero) {
		super();
		this.numero = numero;
		productos = new ArrayList<Producto>();
	}

	public Factura(int numero, List<Producto> productos) {
		super();
		this.numero = numero;
		this.productos = productos;
	}

	public Factura(int numero, List<Producto> productos, Calendar fecha) {
		super();
		this.numero = numero;
		this.productos = productos;
		this.fecha = fecha;
	}

	// GETTERS Y SETTERS
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	
	public String toString() {
		String facturaCompleta = "Factura " + numero + "\n";

		for (var producto : productos) {
			facturaCompleta += producto.getImporte() + "\t" + producto.getDescripcion() + "\n";
		}
		return facturaCompleta;
	}
}