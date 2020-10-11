package unidad1.practica1.gestion;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import unidad1.practica1.facturacion.*;
import unidad1.practica1.facturacion.Producto.IVA;

public class Ejercicio3 {

	public static void main(String[] args) {

		List<Factura> facturas = Arrays.asList(
			new Factura(1,
					Arrays.asList(
						new Producto(1.20, ">>>Macarrones", IVA.Normal),
						new Producto(.50, ">>>Pan", IVA.Reducido),
						new Producto(1.50, ">>>Borraja", IVA.Normal)
					),
					new Calendar.Builder().setDate(2020, Calendar.JANUARY, 21).build()
				),
			new Factura(2,
					Arrays.asList(
						new Producto(1.3, ">>>Jabon", IVA.Normal),
						new Producto(3.2, ">>>Platanos", IVA.Normal),
						new Producto(2.5, ">>>Peras", IVA.Normal)
					),
					new Calendar.Builder().setDate(2020, Calendar.MARCH, 10).build()
				),
			new Factura(3, 
					Arrays.asList(
						new Producto(2.5, ">>>Caballa", IVA.Normal),
						new Producto(0.59, ">>>Pilas", IVA.Normal),
						new Producto(2.5, ">>>Judias", IVA.Normal )
					),
					new Calendar.Builder().setDate(2020, Calendar.JUNE, 2).build()
				),
			new Factura(4, 
					Arrays.asList(
							new Producto(4, ">>>Hamburguesas", IVA.Reducido),
							new Producto(1.2, ">>>Lentejas", IVA.Reducido),
							new Producto(6.2, ">>>Lubina", IVA.Normal )
						),
					new Calendar.Builder().setDate(2020, Calendar.APRIL, 24).build()
				),
			new Factura(5,
					Arrays.asList(
							new Producto(2, ">>>Cereales", IVA.Reducido),
							new Producto(2.5, ">>>Colacao", IVA.Normal ),
							new Producto(1.4, ">>>Salchichas", IVA.Normal)
						),
					new Calendar.Builder().setDate(2020, Calendar.SEPTEMBER, 2).build()
				)
			);
		
		for ( var factura : facturas ) {
			System.out.println(factura);
		}
		
		System.out.printf("El IVA Trimestral: %.2f‚", UtilidadesCalculoIVA.calculoIVATrimestral(facturas, 2020, Calendar.SEPTEMBER));
		System.out.printf("\nEl IVA Mensual: %.2f‚", UtilidadesCalculoIVA.calculoIVAMesActual(facturas, 2020, Calendar.SEPTEMBER));
	}
}