package abstract_factory.pago;

import abstract_factory.TipoDePago;

public class EfectivoPago implements Pago {

	@Override
	public void generarPago() {
		System.out.println("Pago generado con " + TipoDePago.EFECTIVO);
	}

}
