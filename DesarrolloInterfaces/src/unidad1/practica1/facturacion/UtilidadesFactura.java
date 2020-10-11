package unidad1.practica1.facturacion;

import java.util.List;

import java.util.ArrayList;

public class UtilidadesFactura {

	public static double calcularImporteFactura(Factura f) {
		double importeSinIVA = 0;

		for (var producto : f.getProductos()) {
			importeSinIVA += producto.getImporte();
		}
		return importeSinIVA;
	}

	public static double calcularIVAFactura(Factura f) {
		double IVA = 21;

		for (var producto : f.getProductos()) {
			IVA += producto.getImporte() * producto.getIVA().porcentaje;
		}
		return IVA;
	}

	public static double calcularImporteFacturaConIVA(Factura f) {
		return calcularImporteFactura(f) + calcularIVAFactura(f);
	}
}