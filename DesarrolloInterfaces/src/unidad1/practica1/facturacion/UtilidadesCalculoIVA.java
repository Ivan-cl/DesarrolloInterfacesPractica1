package unidad1.practica1.facturacion;

import java.util.Calendar;
import java.util.List;

public class UtilidadesCalculoIVA {

	public static double calculoIVATrimestral(List<Factura> listaFacturas, int ano, int mes) {
		double IVATrimestral = 0;

		for (var factura : listaFacturas) {
			Calendar fechaActual = new Calendar.Builder().setDate(ano, mes, 1).build(),
					fecha3MesesAntes = (Calendar) fechaActual.clone();
			
			fecha3MesesAntes.add(Calendar.MONTH, -3);
			fecha3MesesAntes.add(Calendar.DAY_OF_MONTH, -1);
			
			if (factura.getFecha().before(fechaActual) && factura.getFecha().after(fecha3MesesAntes)) {
				IVATrimestral += UtilidadesFactura.calcularIVAFactura(factura);
			}
		}
		return IVATrimestral;
	}

	public static double calculoIVAMesActual(List<Factura> listaFacturas, int ano, int mes) {
		double IVAMesActual = 0;

		for (var factura : listaFacturas) {
			Calendar ultimoDiaDelMesAnterior = new Calendar.Builder().setDate(ano, mes, 1).build(),
					primerDiaDelMesSiguiente = (Calendar) ultimoDiaDelMesAnterior.clone();
			
			ultimoDiaDelMesAnterior.add(Calendar.DAY_OF_MONTH, -1);
			primerDiaDelMesSiguiente.add(Calendar.MONTH, 1);
			
			if (factura.getFecha().after(ultimoDiaDelMesAnterior)
					&& factura.getFecha().before(primerDiaDelMesSiguiente)) {
				IVAMesActual += UtilidadesFactura.calcularIVAFactura(factura);
			}
		}
		return IVAMesActual;
	}
}