package unidad1.practica1.gestion;

import java.util.Arrays;

import unidad1.practica1.facturacion.*;

public class Ejercicio1 {

	public static void main(String[] args) {

		Factura f = new Factura(1, Arrays.asList(

				new Producto(0.75, ">>>Leche"),
				new Producto(0.50, ">>>Pan"),
				new Producto(8.99, ">>>Salmon"),
				new Producto(2.95, ">>>Aguacates"),
				new Producto(1.20, ">>>Friegasuelos"),
				new Producto(0.56, ">>>Cerveza"),
				new Producto(1.45, ">>>Sandia")
			)
		);

		System.out.println(f);
	}
}