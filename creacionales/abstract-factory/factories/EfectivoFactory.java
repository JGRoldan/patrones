package abstract_factory.factories;

import abstract_factory.pago.EfectivoPago;
import abstract_factory.pago.Pago;

public class EfectivoFactory implements GUIFactory {

	@Override
	public Pago crearPago() {
		return new EfectivoPago();
	}

}
