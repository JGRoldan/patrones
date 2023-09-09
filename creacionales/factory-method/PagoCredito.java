package factory;

public class PagoCredito implements Pago {

	@Override
	public void generarPago() {
		System.out.println("Se realizo el pago con " + TipoDePago.CREDITO);
	}

}
