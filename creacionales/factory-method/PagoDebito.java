package factory;

public class PagoDebito implements Pago {

	@Override
	public void generarPago() {
		System.out.println("Se realizo el pago con " + TipoDePago.DEBITO);
	}

}
