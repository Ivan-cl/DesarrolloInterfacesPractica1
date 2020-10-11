package unidad1.practica1.facturacion;

import static unidad1.practica1.facturacion.Producto.IVA.Normal;

public class Producto {

	private double importe;
	private String descripcion;
	private IVA IVA;

	public Producto(double importe, String descripcion) {
		super();
		this.importe = importe;
		this.descripcion = descripcion;
		IVA = Normal;
	}

	public Producto(double importe, String descripcion, IVA IVA) {
		super();
		this.importe = importe;
		this.descripcion = descripcion;
		this.IVA = IVA;
	}

	// GETTERS Y SETTERS
	public double getImporte() {
		return importe;
	}

	public IVA getIVA() {
		return IVA;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String toString() {
		return "Producto [importe=" + importe + ", descripcion=" + descripcion + ", IVA=" + IVA + "]\n";
	}

	public enum IVA {
		Normal(.21), Reducido(.1), Superreducido(.04);

		public double porcentaje;

		IVA(double d) {
			porcentaje = d;
		}
	}
}