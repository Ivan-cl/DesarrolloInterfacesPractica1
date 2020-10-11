package unidad1.practica1.gestion;

import java.util.Arrays;
import unidad1.practica1.facturacion.*;
import unidad1.practica1.facturacion.Producto.IVA;

public class Ejercicio2 {
    public static void main(String[] args)
    {
        Factura factura = new Factura(
            1,
            Arrays.asList(
                new Producto(0.75, ">>>Leche", IVA.Reducido),
                new Producto(0.50, ">>>Pan", IVA.Superreducido),
                new Producto(8.99, ">>>Salmon", IVA.Normal),
                new Producto(2.95, ">>>Aguacates", IVA.Normal),
                new Producto(1.20, ">>>Friegasuelos", IVA.Reducido),
                new Producto(0.56, ">>>Cerveza", IVA.Normal),
                new Producto(1.45, ">>>Sandia", IVA.Reducido)
            )
        );
		System.out.printf(factura + "\nImporte con IVA: %.2f", UtilidadesFactura.calcularImporteFacturaConIVA(factura));
	}
}