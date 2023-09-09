package factory;

public class PagoPaypal implements Pago {

	@Override
	public void generarPago() {
		System.out.println("Se realizo el pago con " + TipoDePago.PAYPAL);
	}

}
