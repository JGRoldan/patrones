package abstract_factory.pago;

import abstract_factory.TipoDePago;

public class DebitoPago implements Pago {

	@Override
	public void generarPago() {
		System.out.println("Pago generado con " + TipoDePago.DEBITO);
	}

}
