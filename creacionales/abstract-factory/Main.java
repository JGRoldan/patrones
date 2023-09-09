package abstract_factory;

import abstract_factory.app.Application;
import abstract_factory.factories.DebitoFactory;
import abstract_factory.factories.EfectivoFactory;

public class Main {
	public static void main(String[] args) {
		Application app = new Application(new DebitoFactory());
		app.generarPago();
		
		Application app2 = new Application(new EfectivoFactory());
		app2.generarPago();
	}
}
