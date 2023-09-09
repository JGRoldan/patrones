package abstract_factory.app;

import abstract_factory.factories.GUIFactory;
import abstract_factory.pago.Pago;

public class Application {
	private Pago pago;
	
	public Application(GUIFactory factory) {
		pago = factory.crearPago();
	}
	public void generarPago() {
		pago.generarPago();
	}
}
