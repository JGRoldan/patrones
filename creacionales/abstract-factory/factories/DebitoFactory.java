package abstract_factory.factories;

import abstract_factory.pago.DebitoPago;
import abstract_factory.pago.Pago;

public class DebitoFactory implements GUIFactory {

	@Override
	public Pago crearPago() {
		return new DebitoPago();
	}

}
